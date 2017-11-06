/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Sergio
 */

public class Pruebas{

        
    public static void main(String[] args){
            int n=5,m = 5;
            int [][]matriz = new int [n][m];
            String direccion = new String();
            direccion="C:/Users/Sergio/Desktop/prueba.txt";
            
            LeerFichero leyendo=new LeerFichero();
            leyendo.lee(direccion);
            
        //System.out.println("Hola Sergio, ánimo!!! Has creado una variable con valores "+n+ " y "+m+".");
        
    }
    
}
