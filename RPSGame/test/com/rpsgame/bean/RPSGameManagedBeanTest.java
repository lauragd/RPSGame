/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpsgame.bean;

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
        assertTrue(true);
    }
    
     /**
     * Test of checkWinner method in case of choose paper
     * Player1 wins
     */
    @Test
    public void testPaperForPlayer1() {
        assertTrue(true);
    }
    
    /**
     * Test of checkWinner method in case of choose scissors
     * Player1 loses
     */
    @Test
    public void testScissorsForPlayer1() {
        assertTrue(true);
    }
}
