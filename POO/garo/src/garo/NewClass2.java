/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewClass2{
 public static void main(String[]garo) throws IOException{
  
     BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
     
     System.out.println("Nombre");
     String edgar=leer.readLine();
     
     System.out.println("\tIngresa edad");
     String edad=leer.readLine();
     
     double edad1=Double.parseDouble(edad);
     
     if(edad1<18){
           System.out.println("MENOR DE EDAD");
         
     }
     if(edad1>=18){
           System.out.println("Mayor de edad");
         
     }
 }
 }