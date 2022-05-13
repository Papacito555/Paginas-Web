/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.sql.*;
/**
 *
 * @author edgar
 */
public class conexionBD {
    
    Connection cn;
    
    
    public Connection conexion(){//se crea metodo de tipo conexion
      try{ 
        Class.forName("com.mysql.jdbc.Driver");
      
     cn= DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","garobeat123");
   System.out.println("Se hizo la conexion exitosa");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }return cn;
    }
   
    Statement crateStatement(){
        throw new UnsupportedOperationException("No soportable");
    }

    
    
}
