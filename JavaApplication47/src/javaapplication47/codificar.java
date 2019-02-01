/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class codificar {
    
    ArrayList<String> letras = new ArrayList<String>();
    
    public codificar(){
        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");
        letras.add("e");
        letras.add("f");
        letras.add("g");
        letras.add("h");
        letras.add("i");
        letras.add("j");
        letras.add("k");
        letras.add("m");
        letras.add("n");
        letras.add("l");
        letras.add("o");
        letras.add("p");
        letras.add("q");
        letras.add("r");
        letras.add("s");
        letras.add("t");
        letras.add("u");
        letras.add("v");
        letras.add("w");
        letras.add("x");
        letras.add("y");
        letras.add("z");
       
    }
    
    
    public String codifico(String mensaje){
        String codificado="";
        for(int i=0; i<mensaje.length(); i++){
            int posicion = (int) mensaje.charAt(i) - 97;
            posicion = (posicion + 4)%26;
            codificado = codificado + letras.get(posicion);
        }
        return codificado;
    }
    
    public String decodificar(String mensaje){
        String decodificado="";
        for(int i=0; i<mensaje.length(); i++){
            int posicion = (int) mensaje.charAt(i) - 97;
            posicion = Math.floorMod((posicion - 4 ), 26);
            decodificado = decodificado + letras.get(posicion);
        }
        
        return decodificado;
    }
    
}
