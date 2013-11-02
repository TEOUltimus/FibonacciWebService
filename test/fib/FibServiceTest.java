/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author esummers
 */
public class FibServiceTest {
    
    public FibServiceTest() {
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
     * Test of hello method, of class FibService.
     */
    @Test
    public void testHello() {
        System.out.println("hello");
        String txt = "Joe";
        FibService instance = new FibService();
        String expResult = "Hello Joe !";
        String result = instance.hello(txt);
        assertEquals(expResult, result);
    }

    /**
     * Test of fib method, of class FibService.
     */
    @Test
    public void testFib() {
        System.out.println("fib");
        int n = 0;
        FibService instance = new FibService();
        int expResult = 0;
        int result = instance.fib(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of fibCheck method, of class FibService.
     */
    @Test
    public void testFibCheck() {
        System.out.println("fibCheck");
        int n = 0;
        FibService instance = new FibService();
        boolean expResult = true;
        boolean result = instance.fibCheck(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of whichFib method, of class FibService.
     */
    @Test
    public void testWhichFib() {
        System.out.println("whichFib");
        int n = 0;
        FibService instance = new FibService();
        int expResult = 0;
        int result = instance.whichFib(n);
        assertEquals(expResult, result);
    }
}