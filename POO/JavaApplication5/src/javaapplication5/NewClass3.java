/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class NewClass3 {
      public static void main(String[]garo) throws IOException{
Scanner leer=new Scanner(System.in);

int[] numeross = new int[5];
   
        int i;
       
        System.out.println("Ingresa valores=");
        for (i = 0; i < numeross.length; i++) {
            System.out.print("numeros[" + i + "]= ");
        numeross[i]=leer.nextInt();
        
       
        
        }

      }
}
