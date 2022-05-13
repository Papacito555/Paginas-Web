/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edgar
 */
public class immpar {
    public static void main(String Arg[])throws IOException{

BufferedReader in= new BufferedReader (new InputStreamReader (System.in));
ingrese enviar=new ingrese();

int b,i,s=1;

System.out.println("Ingrese numero inicial:");
i=Integer.parseInt(in.readLine());

System.out.println(     "ingrese numero final");
b=Integer.parseInt(in.readLine());

int lol=enviar.numeros(i,b,s);
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