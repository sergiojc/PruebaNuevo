/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Sergio
 */


public class LeerFichero{
    public void lee(String direccion){
        try {
            FileReader archivo = new FileReader(direccion);
            int a=0; 
//= archivo.read();
            System.out.println(Character.getNumericValue(archivo.read()));
            System.out.println((int)a);
            System.out.println((char)a);
            char x = (char)a;
            System.out.println(x);
            
            a=Character.getNumericValue(x);
            System.out.println(a);
            
            /*char letra = (char)a;
            
            
            while (a!=-1){
                System.out.print(letra);
                a=archivo.read();
                   letra=(char)a;

                
             
            }
            archivo.close();*/
        } catch (IOException ex) {
            System.out.println("Archivo no encontrado.");
        }
    }
}
