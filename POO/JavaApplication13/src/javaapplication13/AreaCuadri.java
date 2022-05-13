/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class AreaCuadri {
    
    public static void main (String[]args){
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
  float lado1,lado2;
       Cuadrilatero c1;
       
       lado1=Float.parseFloat(JOptionPane.showInputDialog("Digite lado:"));  
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Digite lado:"));  
        
        if(lado1==lado2){
           c1= new Cuadrilatero(lado1);
            
        }else{
              c1= new Cuadrilatero(lado1,lado2);
        }
        System.out.println("El perimetro es:"+c1.getPerimetro());
        System.out.println("El Area es:"+c1.getArea());
    }
    
}
