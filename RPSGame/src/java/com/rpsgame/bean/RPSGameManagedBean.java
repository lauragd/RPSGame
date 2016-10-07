package com.rpsgame.bean;

import com.rpsgame.util.Constants;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author l.gil
 */
@Named(value = "rpsGameManagedBean")
@SessionScoped
public class RPSGameManagedBean implements Serializable {
    
    private Integer draw;    
    private Integer winPlayer1;
    private Integer lossPlayer1;
    
    /**
     * Creates a new instance of RSPGameManagedBean
     */
    public RPSGameManagedBean() {
        draw = 0;    
        winPlayer1 = 0;
        lossPlayer1 = 0;
    }
    
    /**
     * Check the result for one game. IMPORTANT: One player should always play 
     * randomly, the other should always choose rock.
     * @param optionPlayer1
     * @return 
     */
    public Integer checkWinner(String optionPlayer1) {
        Integer result;
        
        // Checks the player1´s option. Player 2 always has rock
        switch (optionPlayer1) {
            case Constants.PAPER:
                // Player1 wins
                winPlayer1++;
                result = 1;
                break;
            case Constants.SCISSORS:
                // Player1 loses
                lossPlayer1++;
                result = 2;
                break;
            default:
                // Both players tie
                draw++;
                result = 0;
                break;
        }        
        return result;
    }
    
    /**
     * @return the draw
     */
    public Integer getDraw() {
        return draw;
    }

    /**
     * @param draw the draw to set
     */
    public void setDraw(Integer draw) {
        this.draw = draw;
    }
    
        /**
     * @return the winPlayer1
     */
    public Integer getWinPlayer1() {
        return winPlayer1;
    }

    /**
     * @param winPlayer1 the winPlayer1 to set
     */
    public void setWinPlayer1(Integer winPlayer1) {
        this.winPlayer1 = winPlayer1;
    }

    /**
     * @return the lossPlayer1
     */
    public Integer getLossPlayer1() {
        return lossPlayer1;
    }

    /**
     * @param lossPlayer1 the lossPlayer1 to set
     */
    public void setLossPlayer1(Integer lossPlayer1) {
        this.lossPlayer1 = lossPlayer1;
    }
    
}
