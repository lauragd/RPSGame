package com.rpsgame.bean;

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
    
    /**
     * Creates a new instance of RSPGameManagedBean
     */
    public RPSGameManagedBean() {
        draw = 0; 
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
            default:
                // Both players tie
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
    
}
