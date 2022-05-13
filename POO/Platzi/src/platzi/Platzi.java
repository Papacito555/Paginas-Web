/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platzi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edgar
 */
public class Platzi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      BufferedReader leer=new BufferedReader (new InputStreamReader(System.in));
      
   
      
      System.out.println("Bienvendio al registro de calificiaciones");
      System.out.println("Indica cuantos alumnos tienes:");
      int alumnos=Integer.parseInt(leer.readLine());
      
      
     String  alumn[]=new String [alumnos];
     
     double  alumnn[]=new double[alumnos];
      
      System.out.println("Ingresa calificaciones de los 3 parcial=");
      for(int i=0; i<alumn.length;i++){
               System.out.println("Nombre del alumno["+(i+1)+"]");
                alumn[i]=leer.readLine();
               
      }
              for(int i=0;i<alumnos;i++){
                    System.out.println("Nota del Alumno "+alumn[i]+": ");
                    double suma=0;
  for(int j=0;j<3;j++){
      System.out.print("Ingrese nota ["+(j+1)+"]: ");
           double   nota=Double.parseDouble(leer.readLine());
    
  suma= suma+nota;
  
alumnn[i]=suma/3; 
          }
 

        
      }
        for(int i=0;i<alumnos;i++){
            System.out.println("Alumno["+alumn[i]+"]"+"\n Promedio:"+alumnn[i]);
        }
      
      
      
      
    }
    
}
