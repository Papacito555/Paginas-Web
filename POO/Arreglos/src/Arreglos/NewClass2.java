/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author edgar
 */
public class NewClass2 {
    public static void main(String[]garo){
 
    int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el primer numero:"));
   int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el primer numero:"));
   
 int resultado =a+b;
 
// JOptionPane.showMessageDialog(null,"El Resutlado es" +resultado);
 
// JOptionPane.showConfirmDialog(null, resultado);
 
 //JOptionPane.showConfirmDialog(null, resultado, title, resultado); NO
 //JOptionPane.showConfirmDialog(null, resultado, title, resultado, resultado);NO
  // JOptionPane.showConfirmDialog(null, resultado);
 // JOptionPane.showInputDialog(resultado);
 //  JOptionPane.showInputDialog(null, resultado);
  // JOptionPane.showInputDialog(null, resultado);
   // JOptionPane.showInputDialog(null, resultado, title, resultado);NO
  // JOptionPane.showInputDialog(null, resultado, title, resultado, icon, garo, resultado);NO
 // JOptionPane.showInternalConfirmDialog(null, resultado);NO
  //JOptionPane.showInternalConfirmDialog(null, resultado, title, resultado); no
  // JOptionPane.showInternalConfirmDialog(null, resultado, title, resultado, resultado); no
  // JOptionPane.showInternalConfirmDialog(null, resultado, title, resultado, resultado, icon); no
 //  JOptionPane.showInternalInputDialog(null, resultado);no
  // JOptionPane.showInternalConfirmDialog(null, "Hola");no
   JOptionPane.showInternalConfirmDialog(null,"Garo");
    }
}
