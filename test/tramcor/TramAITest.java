/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tramcor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S6105692
 */
public class TramAITest {
    
    public TramAITest() {
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
     * Test of setNext method, of class TramAI.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        ErrorHandling Low = null;
        TramAI instance = new TramAI();
        instance.setNext(Low);
    }

    /**
     * Test of processError method, of class TramAI.
     */
    @Test
    public void testProcessError() {
        System.out.println("processError");
        Error error = null;
        TramAI instance = new TramAI();
        instance.processError(error);
    }
    
}
