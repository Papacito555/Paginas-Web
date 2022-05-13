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
public class practica4 {
    public static void main(String[]garo) throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader (System.in));
        do{
        System.out.println("Ingresa tu nombre:");
     String nom=in.readLine();
        System.out.println("Ingresa tu peso(kg):");
     String pes=in.readLine();
      System.out.println("Ingresa tu altura(m):");
 String alt=in.readLine();
    
    double pes1=Double.parseDouble(pes);
        double alt1=Double.parseDouble(alt);
        
        double masa1=alt1*alt1;
        double masa=pes1/masa1;
        
        if(masa<=18.7){
             System.out.println("Infrapeso");
          }  
        if(masa>=18.8 && masa<=24.9){
             System.out.println("Normal");
          }
    
            if(masa>=25 && masa<=29.9){
 System.out.println("Sobrepeso");
            }
            if(masa>=30 && masa<=42.8){
 System.out.println("Obeso");
            }
    }while(true);
    }
}