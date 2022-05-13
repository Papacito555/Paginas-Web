/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class PRACTICA {
    public static void main(String[]garo) throws IOException{
      BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Inserta el tamaño del vector:");
        String vec=leer.readLine();
        Integer vec11=Integer.parseInt(vec);
      
        int vec1 []= new int [vec11];
        int pos = 0, neg = 0;
        
        for(int i=0;i<vec1.length;i++){
                System.out.println("ARREGLO  \t"+(i+1)+" ["+i+"]");
           vec1[i]= Integer.parseInt(leer.readLine());
          
            
              if (vec1[i] > 0) {
                pos++;
            } else if (vec1[i] < 0) {
                neg++;
            } 
             
        }
    
         System.out.println("Numeros Positivos: " + pos);
        System.out.println("Numero Negativos: " + neg);
        
        
        
        
        }
        
        
         }
    

