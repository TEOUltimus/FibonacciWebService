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

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "fib")
    public int fib(@WebParam(name = "n") int n) {
        final double SQRT5 = Math.sqrt(5.0);
        double a = Math.pow((1 + SQRT5) / 2, n), b = Math.pow((1 - SQRT5) / 2, n);
        return (int) ((a - b) / SQRT5);
    }
}
