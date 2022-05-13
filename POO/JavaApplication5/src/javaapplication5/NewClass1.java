/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edgar
 */
public class NewClass1 {
    public static void main(String[]garo) throws IOException{
        BufferedReader in=new BufferedReader( new InputStreamReader(System.in));
        do{
        System.out.println("Escribe el numero:");
        String num1=in.readLine();
        Integer num=Integer.parseInt(num1);
        
        int arr []= new int [14*num];
        
        System.out.println("Los elementos son:"+arr.length);
        
        }while(true);
        
        
        
        
        
        
         
    }
}
