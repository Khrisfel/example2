/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @author Profesor
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        codificar c = new codificar();
        String mensaje = c.codifico("casa");
        System.out.println(""+mensaje);
        String mensaje2 = c.decodificar(mensaje);
        System.out.println(""+mensaje2);
    }
    
}
