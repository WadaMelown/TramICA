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
public class ITSpecialistsTest {
    
    public ITSpecialistsTest() {
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
     * Test of setNext method, of class ITSpecialists.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        ErrorHandling Medium1 = null;
        ITSpecialists instance = new ITSpecialists();
        instance.setNext(Medium1);
    }

    /**
     * Test of processError method, of class ITSpecialists.
     */
    @Test
    public void testProcessError() {
        System.out.println("processError");
        Error error = null;
        ITSpecialists instance = new ITSpecialists();
        instance.processError(error);
    }
    
}
