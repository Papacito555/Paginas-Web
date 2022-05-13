
package platzi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioSemestre {
  
    public static void main(String[]garo) throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        do{
        System.out.println("Bienvenido");
        
        System.out.println("Ingresa porfavor la cantidad de alumnos");
        int alumnos=Integer.parseInt(leer.readLine());
            
    String nombre[]=new String[alumnos];    
    double promedio[]=new double [alumnos];
    double notas;
    
    
    for(int i=0;i<alumnos;i++){
        System.out.println("Ingresa nombre del alumno["+(i+1)+"]");
        nombre[i]=leer.readLine();
        
    }
    
    for(int i=0;i<alumnos;i++){
        System.out.println("Alumno["+nombre[i]+"]");
        double sumas=0;
        
        for(int j=0;j<3;j++){
              System.out.println("Ingresa calificació["+(j+1)+"]\n Parcial="+(j+1));
               notas=Double.parseDouble(leer.readLine());
               
            sumas=sumas+notas;   
               promedio[i]= sumas/3;   
        }
    }    
    
    for(int i=0;i<alumnos;i++){
    
         System.out.println("Alumno \n["+nombre[i]+"]\nCalificacion Total del semestre=\n"+promedio[i]);
         if(promedio[i]>=6){
             System.out.println("Calificacion aprobatoria");
             
         }else{
                 System.out.println("Calificacion reprobatoria");
         }
         
             
    }
     
    
        }while(true);
    }  
}
