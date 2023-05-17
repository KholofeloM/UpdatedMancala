/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.mancalaFnb.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import za.co.fnb.mancalaFnb.domain.Game;
import za.co.fnb.mancalaFnb.domain.Movement;
import za.co.fnb.mancalaFnb.service.GameServiceImpl;
import za.co.fnb.mancalaFnb.util.Constants;

/**
 *
 * @author S2026015
 */
@ExtendWith(MockitoExtension.class)
public class GameServiceTest {
    
    @InjectMocks
    GameServiceImpl gameService;

    @Test
    public void whenGameIdNotExist_shouldReturnNewGameId() {
        assertNotEquals(gameService.getGame("random").getGameId(), "random");
    }


    @Test
    public void whenGameIdExists_shouldReturnExistOne() throws Exception {
        Game game = gameService.getGame("random");
        assertEquals(gameService.getGame(game.getGameId()).getGameId(), game.getGameId());
    }


    @Test
    public void whenMovementExists_shouldReturnProperResult() throws Exception {
        Movement movement = Movement.builder().gameId("random").player(Constants.PLAYER1_KEY).pitNumber(4).build();
        Game game = gameService.getMove(movement);
        assertEquals(game.getCurrentPlayer(), Constants.PLAYER2_KEY);
        assertFalse(game.isWinnerExist);
        assertEquals(game.getPlayer1().getTreasury(), 1);

    }
    
}
