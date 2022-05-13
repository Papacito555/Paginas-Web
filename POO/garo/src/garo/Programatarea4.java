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
public class Programatarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        
  
      
       do{ 
        System.out.println("1)SUMA\n2)RESTA\n3)MULTIPLICACION\n4)DIVISION\n5)SALIR ");
        System.out.println("Escribe tu operacion:");
        
     String   op1=in.readLine();
        
        Integer op=Integer.parseInt(op1);
        

      if(op==1){
          System.out.println("Ingresa el primer numero:");
          String num1=in.readLine();
             System.out.println("Ingresa el segundo numero:");
          String num2=in.readLine();
          double num11=Double.parseDouble(num1);
          double num22=Double.parseDouble(num2);
          double num3=num11+num22;
          System.out.println("El resultado es:"+num3);
          }
      
      else if(op==2){
           System.out.println("Ingresa el primer numero:");
          String num1=in.readLine();
             System.out.println("Ingresa el segundo numero:");
          String num2=in.readLine();
          double num11=Double.parseDouble(num1);
          double num22=Double.parseDouble(num2);
          double num3=num11-num22;
          System.out.println("El resultado es:"+num3);
          
          
      }
      else if(op==3){
          System.out.println("Ingresa el primer numero:");
          String num1=in.readLine();
             System.out.println("Ingresa el segundo numero:");
          String num2=in.readLine();
          double num11=Double.parseDouble(num1);
          double num22=Double.parseDouble(num2);
          double num3=num11*num22;
          System.out.println("El resultado es:"+num3);
          
      }
      else if(op==4){
          System.out.println("Ingresa el primer numero");
          String num1=in.readLine();
          System.out.println("Ingresa el segundo numero");
          String num2=in.readLine();
          double num11=Double.parseDouble(num1);
          double num22=Double.parseDouble(num2);
          double num3=num11/num22;
          System.out.println("El resultado es: "+num3);
          
      }
      else if(op==5){
          System.exit(0);
          
      }
       }
       while(true);
    }
    
}
