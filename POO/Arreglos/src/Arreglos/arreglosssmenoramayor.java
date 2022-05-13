/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class arreglosssmenoramayor {
    public static void main (String[]garo) throws IOException{
 BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
      
        System.out.println("Ingresa el tamaño del arreglo 1:");
       String   f1=leer.readLine();
         System.out.println("Ingresa el tamaño del arreglo 2:");
         String f2=leer.readLine();
         
         int f11=Integer.parseInt(f1);
         int f22=Integer.parseInt(f2);
         
         int aux;
         
         int F1 []= new int [f11];
         int F2[]= new int [f22];
         
         for(int i=0;i<F1.length;i++){
             System.out.println("ARREGLO 1 \t"+(i+1)+" ["+i+"]");
             F1[i]=Integer.parseInt(leer.readLine());
             
             
         }
         
         
     for(int i=0;i<F2.length;i++){
         System.out.println("ARREGLO 2 \t"+(i+1)+"["+i+"]");
         F2[i]=Integer.parseInt(leer.readLine());
                
         
     }
        
     for(int i=0;i<F1.length;i++ ){
         for(int j=(i+1);j<F1.length;j++){
             if(F1[i]>F1[j]){
                 aux=F1[i];
                 F1[i]=F1[j];
                 F1[j]=aux;
             }
         }
         
     }
        
     
     
     
     
System.out.println("Los Arrelgos 1 ordenados de meno a mayor  son:");
for(int i=0;i<F1.length;i++){
             System.out.print(F1[i]+",");
}

System.out.println("\n");
   
    
for(int i=0;i<F2.length;i++ ){
         for(int j=(i+1);j<F2.length;j++){
             if(F2[i]>F2[j]){
                 aux=F2[i];
                 F2[i]=F2[j];
                 F2[j]=aux;
             }
         }
         
     }
      
 System.out.println("Los Arrelgos 2 ordenados de meno a mayor  son:");
for(int i=0;i<F2.length;i++){
             System.out.print(F2[i]+",");
}

         
        
        
     
        
     
                
        
        
        
    }
    
}
