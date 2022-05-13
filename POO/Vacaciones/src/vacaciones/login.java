/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class login {
    

public void entrar(){
     String usuario="Edgar";
        String pass = "1234";
        String user,pass1;
         
        

        user=JOptionPane.showInputDialog("Ingrese usuario:");
        if(user.equals(usuario)){
             pass1=JOptionPane.showInputDialog("Ingrese contraseña:");
                    if(pass1.equals(pass)){
                        JOptionPane.showMessageDialog(null,"Bienvenido"+usuario);
                    }
                    else{
                         JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
                    }
             
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Usuario Incorrecto");
        }
       
    
    
}    
    
    
    
    
    
    
    
    
}

