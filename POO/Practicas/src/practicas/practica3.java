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
public class practica3{
    public static void main(String[]garo) throws IOException{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in) );
   do{
            System.out.println("Ingresa tu calificacion:");
            String cali=in.readLine();
         int cali1=Integer.parseInt(cali);
         
         if(cali1>=1 && cali1<=6){
             System.out.println("Esta reprobado ");
             
        }
         if(cali1>=7 && cali1<=8){
             System.out.println("Notable");
             
        }
         if(cali1>=9 && cali1<=10 ){
             System.out.println("Sobre saliente");
         }
   }while(true);
    }
  
}
