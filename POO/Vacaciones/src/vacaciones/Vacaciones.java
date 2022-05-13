/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class Vacaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int alu,cali,grado;
        
        login enter=new login ();
        
        enter.entrar();
       
   alu =Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos tienes:"));
   
   
          int[ ] alu2 = new int[alu];
        for(int i=0;i<alu;i++){
             alu2[i]=Integer.parseInt(JOptionPane.showInputDialog("Digita calificacion:"+(i+1)));
             
        }  
    for(int i=0;i<alu;i++){
       JOptionPane.showMessageDialog(null, "Tus calificaciones guardadas\n "+(i+1)+".-"+alu2[i]);
    }
    }
    
}
