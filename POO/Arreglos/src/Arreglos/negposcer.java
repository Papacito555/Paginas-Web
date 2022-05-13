/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edgar
 */
public class negposcer {
    public static void main(String[]garo) throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        int positivo=0,negativo=0,cero=0;
       
         System.out.println("Inserta el tamaño de tu arreglo:");
     Integer ar1=Integer.parseInt(leer.readLine());
      
       
     
       
       int Arr []= new int[ar1];
       
       for(int i=0;i<Arr.length;i++){
           System.out.println("Ingresa los valores de tu arreglo:");
           Arr[i]=Integer.parseInt(leer.readLine());
           
       
           if(Arr[i]>0){
               positivo++;
           }
           else if (Arr[i]<0){
               negativo++;
           }else if(Arr[i]==0)
                       cero++;
                       }
       
          
           
               
       
               
               System.out.println("Numeros positivos:"+positivo);
                System.out.println("Numeros negativos:"+negativo);
                 System.out.println("Numeros positivos:"+cero);
       
           
       
        
                
       }
       } 
        
        
    

