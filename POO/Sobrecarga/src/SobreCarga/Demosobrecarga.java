/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreCarga;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author edgar
 */
public class Demosobrecarga {
   public static void main (String []garo){
   BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
   
   Sobrecarga objeto=new Sobrecarga ();
   
   objeto.prueba(8);
   objeto.prueba(9);
   objeto.prueba(7,6);
   objeto.prueba(3.8,4.3,7.4);
   
   
   
}
}