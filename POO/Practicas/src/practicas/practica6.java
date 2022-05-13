/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edgar
 */
public class practica6 {
  public static void main(String[]garo) throws IOException{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
   
    
    
    
    System.out.println("1)OR EXCLUSION\n2)AND\n3)OR INCLUSION");
    
    System.out.println("Escribe la opcion:");
    String po=in.readLine();
    Integer po1=Integer.parseInt(po);
    do{
    if(po1==1){
         
    System.out.println("Escribe F O V:");
    String f1=in.readLine();
Integer f11=Integer.parseInt(f1);
    System.out.println("Escribe F O V:");
   String f2=in.readLine();
   Integer f22=Integer.parseInt(f2);
             
    
     if(f11=='F' && f22== 'F' ){
                    System.out.println("F");
                 
    
        }
    
    }
    
    }while(true);
    
  }
}
