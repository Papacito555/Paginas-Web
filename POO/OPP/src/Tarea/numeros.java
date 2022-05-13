
package Tarea;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class numeros {
    public static void main(String[]garo) throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in)); 
       do{
        MenoraMayor enviar=new MenoraMayor();
          System.out.println("\nBienvenida AMOR DE MI VIDA");
         
        System.out.println("Ingresa numero:");
          int num1=Integer.parseInt(leer.readLine());
         System.out.println("Ingresa numero:");
             int num2=Integer.parseInt(leer.readLine());
          System.out.println("Ingresa numero:");
               int num3=Integer.parseInt(leer.readLine());
           
               int meno=enviar.Menor(num1, num2,num3);     
        int medi=enviar.Medio(num1, num2,num3);
       int mayo=enviar.Mayor(num1, num2,num3);
        //GARO
       }while(true);
         }
       }
