/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.mancalaFnb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
/**
 *
 * @author S2026015
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movement {

    @NotBlank
    public String gameId;

    @NotBlank
    @Pattern(regexp = "(?:player1|player2)", message = "must be player1 or player2")
    public String player;

    @Min(0)
    @Max(5)
    public int pitNumber;

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int getPitNumber() {
		return pitNumber;
	}

	public void setPitNumber(int pitNumber) {
		this.pitNumber = pitNumber;
	}

//	public static Object builder() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//    
    

}
