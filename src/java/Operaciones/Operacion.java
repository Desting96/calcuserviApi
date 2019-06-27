/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author BOG-A209-E-020
 */
@WebService(serviceName = "Operacion")
public class Operacion {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Suma")
    public double Suma(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        double Suma;
        Suma = A + B;
        return Suma;
    }

  
}
