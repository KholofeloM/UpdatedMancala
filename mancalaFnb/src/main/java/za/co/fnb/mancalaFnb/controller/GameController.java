/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.mancalaFnb.controller;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.fnb.mancalaFnb.domain.Game;
import za.co.fnb.mancalaFnb.domain.Movement;
import za.co.fnb.mancalaFnb.service.GameService;

/**
 *
 * @author S2026015
 */
@RestController
@RequiredArgsConstructor
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/start")
    @ResponseBody
    public Game getStart(@RequestParam String gameId) {
        return gameService.getGame(gameId);
    }

    @PostMapping("/move")
    public Game getMovement(@Valid @RequestBody Movement movement) {
        return gameService.getMove(movement);
    }
}
