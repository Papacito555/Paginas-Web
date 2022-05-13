/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class arr {
    public static void main(String[]garo){
          Scanner in=new Scanner(System.in);
        
            System.out.println("Cuantos elementos:");
          int f1=in.nextInt();
          
            System.out.println("Cuantos elementos:");
          int f2=in.nextInt();
          
          int arr []=new int [f1];
             int arr1 []=new int [f2];
          int i;
          System.out.println("Escribe valor a los elementos:");
          for(i=0;i<arr.length;i++){
               System.out.print("numeros[" + i + "]= ");
              arr[i]=in.nextInt();
              
              
              System.out.println("Elementos"+arr[i]);
              
          }
          System.out.println("Escribe valor a los elementos:");
          for(i=0;i<arr1.length;i++){
               System.out.print("numeros[" + i + "]= ");
              arr1[i]=in.nextInt();
              
              System.out.println("Elementos"+arr[i]);
          }
        
    }  
}
