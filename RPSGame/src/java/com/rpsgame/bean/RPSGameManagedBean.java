package com.rpsgame.bean;

import com.rpsgame.entity.GameEntity;
import com.rpsgame.util.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author l.gil
 */
public class RPSGameManagedBean implements Serializable {
    
    private ArrayList<GameEntity> gamesList; 
    
    private Integer draw;    
    private Integer winPlayer1;
    private Integer lossPlayer1;
    
    /**
     * Creates a new instance of RSPGameManagedBean
     */
    public RPSGameManagedBean() {
        gamesList = new ArrayList<GameEntity>();   
        draw = 0;    
        winPlayer1 = 0;
        lossPlayer1 = 0;
    }
    
    /**
     * Action that returns the game result
     * @return 
     */
    public String startProcess() {
        // Restarts the results
        gamesList = new ArrayList<GameEntity>();
        winPlayer1 = 0;
        lossPlayer1 = 0;
        draw = 0;
        
        for(int i = 1; i <= Constants.GAMES; i++) {       
            // Random option for player1
            int idx = new Random().nextInt(Constants.OPTIONS.length);
            String optionPlayer1 = (Constants.OPTIONS[idx]);
            
            // Checks the result of each game
            Integer result = checkWinner(optionPlayer1);            
  
            // Sets the result
            GameEntity game = new GameEntity();
            game.setGameId(i);
            game.setResult(result);
            game.setPlayer1(optionPlayer1);
            game.setPlayer2(Constants.ROCK);
            
            gamesList.add(game);
        }        
        return "startProcess";
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
     * @return the gameList
     */
    public ArrayList<GameEntity> getGamesList() {
        return gamesList;
    }

    /**
     * @param gameList the gameList to set
     */
    public void setGamesList(ArrayList<GameEntity> gameList) {
        this.gamesList = gameList;
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
