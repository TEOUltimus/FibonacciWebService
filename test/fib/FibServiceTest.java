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

    public static final int[] FIBS = {0, 1, 1, 2, 3, 5, 8, 13, 21};
    public static final int[] NO_FIBS = {-1, 4, 7, 16, 20};

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
        for (int i = 0; i < FIBS.length; i++) {
            FibService instance = new FibService();
            int expResult = FIBS[i];
            int result = instance.fib(i);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of fibCheck method, of class FibService.
     */
    @Test
    public void testFibCheck() {
        System.out.println("fibCheck");
        FibService instance = new FibService();
        for (int f : FIBS) {
            boolean result = instance.fibCheck(f);
            assertEquals(true, result);
        }
        for (int f : NO_FIBS) {
            boolean result = instance.fibCheck(f);
            assertEquals(false, result);
        }
    }

    /**
     * Test of whichFib method, of class FibService.
     */
    @Test
    public void testWhichFib() {
        System.out.println("whichFib");
        FibService instance = new FibService();
        for (int i = 2; i < FIBS.length; i++) {
            int result = instance.whichFib(FIBS[i]);
            assertEquals(i, result);
        }
    }
}