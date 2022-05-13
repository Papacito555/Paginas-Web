/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class NewClass {
    
    
    public static void main(String[]arg) throws IOException{
        Scanner leer=new Scanner(System.in);
        
      Operaciones operacion =new Operaciones();
     int a,b;
     System.out.println("Type first number:");
     a=leer.nextInt();
     System.out.println("Type second number:");
     b=leer.nextInt();
     
     System.out.println("Sum:"+operacion.suma(a, b));
    }
    
}
