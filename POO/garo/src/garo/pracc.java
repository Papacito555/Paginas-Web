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
public class pracc {
    public static void main(String[]garo) throws IOException{
        BufferedReader in=new BufferedReader (new InputStreamReader (System.in));
       do{
        System.out.println("1)Suma\n2)Resta\n3)Multiplicacion\n4)Division\n5)Salir");
        System.out.println("Escribe tu opcion:");
        String mes1=in.readLine();
       Integer mes=Integer.parseInt(mes1);
        
        switch (mes){
            
            case 1:
                System.out.println("SUMA");
                System.out.println("Escribe un numero:");
                 String num1=in.readLine();
                 double num11=Double.parseDouble(num1);
                 System.out.println("Escribe un segundo numero:");
                 String num2=in.readLine();
                 double num22=Double.parseDouble(num2);
                 double num3=num11+num22;
                 System.out.println("Resultado:"+num3);
                 
                 break;
            case 2: 
              System.out.println("RESTA");
             System.out.println("Escribe un numero:");
             String res1=in.readLine();
             System.out.println("Escribe un segundo numero:");
             String res2=in.readLine();
             double res11=Double.parseDouble(res1);
               double res22=Double.parseDouble(res2);
               double res3=res11-res22;
                System.out.println("Resultado:"+res3);
                 break;
              
            case 3: 
                System.out.println("MULTIPLICACION");
             System.out.println("Escribe un numero:");
             String mul1=in.readLine();
             System.out.println("Escribe un segundo numero:");
             String mul2=in.readLine();
             double mul11=Double.parseDouble(mul1);
               double mul22=Double.parseDouble(mul2);
               double mul3=mul11*mul22;
                System.out.println("Resultado:"+mul3);
                 break;
                
            case 4: 
                   System.out.println("DIVISION");
             System.out.println("Escribe un numero:");
             String di1=in.readLine();
             System.out.println("Escribe un segundo numero:");
             String di2=in.readLine();
             double di11=Double.parseDouble(di1);
               double di22=Double.parseDouble(di2);
               double di3=di11/di22;
                System.out.println("Resultado:"+di3);
                 break;
                
            
            case 5: 
                System.exit(0);
               break;
            
        }
        
       }while(true);
        
        
    }
    
}
