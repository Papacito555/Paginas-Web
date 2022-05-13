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
public class amor {
    public static void main(String[]garo) throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader (System.in));
        
        

            System.out.println("Nombre:");
         String nom1=in.readLine();     
            System.out.println("Edad:");
             String ede1=in.readLine(); 
             
             Integer edad=Integer.parseInt(ede1);
             
             if(edad<18){
               System.out.println("Nombre:"+nom1);
               System.out.println("Edad:"+edad);
               System.out.println("Eres menor de edad");
             }
                 
             if(edad>=18){
                 System.out.println("Nombre:"+nom1);
               System.out.println("Edad:"+edad);
               System.out.println("Eres mayor de edad GUAPA :3");
                 
                 
                 
                 
                 
             }
             
             
             
   
              
              
            
            
        
        
        
        
        
        
    }
}
