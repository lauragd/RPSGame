package com.rpsgame.bean;

import com.rpsgame.util.Constants;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author l.gil
 */
public class RPSGameManagedBeanTest {
    
    public RPSGameManagedBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkWinner method in case of tie;
     */
    @Test
    public void testRockForPlayer1() {
        System.out.println("testRockForPlayer1");
        RPSGameManagedBean instance = new RPSGameManagedBean();
        
        String optionPlayer1 = Constants.ROCK;
        
        Integer expResult = 0;
        Integer result = instance.checkWinner(optionPlayer1);
        
        assertEquals(expResult, result);  
    }
    
     /**
     * Test of checkWinner method in case of choose paper
     * Player1 wins
     */
    @Test
    public void testPaperForPlayer1() {
        System.out.println("testPaperForPlayer1");
        RPSGameManagedBean instance = new RPSGameManagedBean();
        
        String optionPlayer1 = Constants.PAPER;
        
        Integer expResult = 1;
        Integer result = instance.checkWinner(optionPlayer1);
        
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of checkWinner method in case of choose scissors
     * Player1 loses
     */
    @Test
    public void testScissorsForPlayer1() {
        System.out.println("testScissorsForPlayer1");
        RPSGameManagedBean instance = new RPSGameManagedBean();
        
        String optionPlayer1 = Constants.SCISSORS;
        
        Integer expResult = 2;
        Integer result = instance.checkWinner(optionPlayer1);
        
        assertEquals(expResult, result);        
    }
}
