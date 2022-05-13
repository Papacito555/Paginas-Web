/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upiicsa2;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Hola {
    Scanner leer=new Scanner(System.in);
    
        
        public void usuario(int b[]){
            for(int i=0;i<b.length;i++){
                System.out.println("["+(i+1)+"]:\n");
                b[i]=leer.nextInt();
            }
        }
        
        public void mostrar(int c[]){
            for(int i=0;i<c.length;i++){
                System.out.println("["+(i+1)+"]:"+c[i]+"\n");
            }
            
        }
        
        }
      
  

    
    
    
    

