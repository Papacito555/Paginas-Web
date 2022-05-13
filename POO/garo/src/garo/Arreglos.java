
 
package garo;


import java.io.IOException;



public class Arreglos {
 public static void main(String[]garo) throws IOException{

 
 

int f;
int ff;
 
System.out.println("Cuantos elementos de F1");
 f=leer.datoInt();
 int[] F1=new int[f];
  System.out.println("Cuantos elementos de F2");
ff=leer.datoInt();
 int[] F2=new int[ff];
 int i=0; 


 
System.out.println("Ingresa los valores de cada F1:");

for( i= 0; i<f; i++){
  System.out.println("F1["+i+"]=");
   F1[i]=leer.datoInt();
   
   

}
System.out.println("Ingresa los valores de cada F1:");

for( i= 0; i<ff; i++){
  System.out.println("F2["+i+"]=");
   F2[i]=leer.datoInt();

 
 }
System.out.println();
for(i=0;i<f;i++)
  System.out.print(F1[i]  +  "  ");
System.out.println("\n\nFIN");
 }
    
}
