/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edgar
 */
public class practica2 {
    public static void main(String[]garo) throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader (System.in));
    
    do{
        System.out.println("Nombre:\n");
    String nom1=in.readLine();
    System.out.println("SEXO: (M/F) \n");
     String nom2=in.readLine();
    System.out.println("Ingresa tu edad:\n");
        String edad=in.readLine();
        
        Integer edad1=Integer.parseInt(edad);
        
        if(edad1<18){
            System.out.println(nom1);
             System.out.println("Sexo:"+nom2);
            System.out.println("Eres menor de edad");
        }
        
           if (edad1>=18){
            System.out.println(nom1);
             System.out.println("Sexo:"+nom2);
            System.out.println("Eres mayor de edad");
           }
    }while(true);
    
    }
}
