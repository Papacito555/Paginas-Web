/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class principal {
    
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
   	int alumnos,tareas,cumplieron,si=0,no=0;
	
	System.out.println("Cantidad de Tareas:\n");
	tareas=leer.nextInt();
	System.out.println("Cantidad de Alumnos:\n");
         alumnos=leer.nextInt();
	for(int i=1;i<=tareas;i++){
		        for(int k=1;k<=alumnos;k++){
				   System.out.println("Tarea No"+i+"\tAlumno No"+k+"\nCumpliste?:\t1)Si\t2)No\n");
	               cumplieron=leer.nextInt();
	            if(cumplieron==1){
	            
					si=si+1;
	            }else{
	                 if(cumplieron==2){ 
						no=no+1;
					}
				}
	    }					
	}	
		
	System.out.println("Total de alumnos que cumplieron:"+si+"\nTotal de alumnos que no cumplieron:%d"+no);

    }
}
