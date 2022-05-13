/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edgar
 */
public class NewClass1 {
    public static void main(String[]garo) throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa el tamaño del arreglo:");
        int ar1=Integer.parseInt(leer.readLine());
        
        int arr[]= new int [ar1];
       int aux; 
       
        for(int i=0;i<arr.length;i++){
            System.out.println("Ingresa los valores del arreglos:");
           arr[i]=Integer.parseInt(leer.readLine());
        }
        
        
        for(int i=0;i<arr.length;i++){
            for(int j=(i+1);j<arr.length;j++){
                if(arr[i]>arr[j]){
                    aux=arr[i];
                    arr[i]=arr[j];
                    arr[j]=aux;
                    
                }
                
            }
        
        
        
        }
       
       for(int i=0;i<arr.length;i++) {
           System.out.println("Arreglos menor a mayor:"+arr[i]);
       }
            
        
       
    }
        
        
        
    }

