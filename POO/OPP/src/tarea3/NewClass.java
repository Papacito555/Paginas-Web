/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import tarea2.ingrese;

/**
 *
 * @author edgar
 */
public class NewClass {
       public static void main(String Arg[])throws IOException{

BufferedReader in= new BufferedReader (new InputStreamReader (System.in));
par enviar=new par();

int b,i,s=1;

System.out.println("Ingrese numero inicial:");
i=Integer.parseInt(in.readLine());

System.out.println(     "ingrese numero final");
b=Integer.parseInt(in.readLine());

int lol=enviar.num(i,b,s);
while (i>b)
{
System.out.println("Los valores del rango fueron ingresador incorrectamente, ingrese numero inicial");
i=Integer.parseInt(in.readLine());

System.out.println("ingrese numero final:" );
b=Integer.parseInt(in.readLine());


}
 System.out.print(" ="+s);

}

}
