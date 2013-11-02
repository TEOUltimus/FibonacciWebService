/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fib;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author esummers
 */
@WebService(serviceName = "Fibonacci")
public class FibService {
        private static final double SQRT5 = Math.sqrt(5.0);

    /**
     * This is a sample web service operation
     * Says Hello
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Find a Fibonacci number in constant time
     * @param n which fib
     * @return the fib
     */
    @WebMethod(operationName = "fib")
    public int fib(@WebParam(name = "n") int n) {
        double a = Math.pow((1 + SQRT5) / 2, n), b = Math.pow((1 - SQRT5) / 2, n);
        return (int) ((a - b) / SQRT5);
    }
    
    /**
     * Check if a potential Fibonacci number really is
     * @param n the potential number
     * @return true or false
     */
    @WebMethod(operationName = "fibCheck")
    public boolean fibCheck(@WebParam(name = "n") int n) {
        if (n < 0) return false;
        double a = Math.sqrt(5.0 * Math.pow(n, 2.0) + 4.0),
               b = Math.sqrt(5.0 * Math.pow(n, 2.0) - 4.0);
        return isInt(a) || isInt(b);
    }
    
    /**
     * Find which Fibonacci the candidate is
     * @param n candidate Fibonacci number
     * @return which Fibonacci number
     */
    @WebMethod(operationName = "whichFib")
    public int whichFib(@WebParam(name = "n") int n) {
        if (!fibCheck(n)) {
            return -1;
        }
        double base = Math.log((1+SQRT5)/2);
        double a = Math.log((n * SQRT5 + Math.sqrt(5 * Math.pow(n, 2.0) + 4))/2.0)/base;
        return (int) (a + 0.5);
    }
    
    /**
     * Is this an integer
     * @param x the candidate
     * @return true or false
     */
    private boolean isInt(double x) {
        return (int) x == x;
    }
}
