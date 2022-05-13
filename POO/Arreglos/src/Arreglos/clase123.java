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
public class clase123 {
    public static void main(String[]Garo) throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader (System.in));
    do{
        System.out.println("\t TABLAS DE MULTIPLICAR.");
        System.out.println("Insterta el numero de tabla:");
        String num1=leer.readLine();
        Integer num11=Integer.parseInt(num1);
        
        int num2 []=new int [10];
        
        for(int i=0;i<num2.length;i++){
            
            int num3=num11*i;
            System.out.println(num11+"*"+i+"="+num3);
        
            
        }        
    }while(true);
        
        
        
        
    }
}
