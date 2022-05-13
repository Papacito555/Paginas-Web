
 
package garo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ALBERT {
public static void main(String[]argns) throws IOException{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 do{
 System.out.println("1)SUMA\n2)RESTA\n3)MULTIPLICACION\n4)DIVICION\n5)SALIR\n");
 System.out.println("Escribe un numero");
 String operacion1=in.readLine();
 Integer op=Integer.parseInt(operacion1);
 if(op==1){
System.out.println("Ingresa el primer numero");
String num1=in.readLine();
System.out.println("Ingresa el segundo numero");
String num2=in.readLine();
double num99=Double.parseDouble(num1);
double num98=Double.parseDouble(num2);
double num97=num99+num98;
System.out.println("EL RESULTADO ES:"+num97);
 }
 if(op==2){
 System.out.println("Ingresa el primer numero");
String num1=in.readLine();
System.out.println("Ingresa el segundo numero");
String num2=in.readLine();
double num88=Double.parseDouble(num1);
double num87=Double.parseDouble(num2);
double num86=num88-num87;
System.out.println("EL RESULTADO ES"+num86);  
 }
 if(op==3){
System.out.println("Ingresa el primer numero");
String num1=in.readLine();
System.out.println("Ingresa el segundo numero");
String num2=in.readLine();
double num55=Double.parseDouble(num1);
double num56=Double.parseDouble(num2);
double num54=num55*num56;
System.out.println("EL RESULTADO ES"+num54);     
 }
 if(op==4){
System.out.println("Ingresa el primer numero");
String num1=in.readLine();
System.out.println("Ingresa el segundo numero");
String num2=in.readLine();
double num33=Double.parseDouble(num1);
double num34=Double.parseDouble(num2);
double num39=num33+num34;
System.out.println("EL RESULTADO ES"+num39);
 }
if(op==5){
System.exit(0);       
  }
 }while(true);
 }
 }
 
 
 
