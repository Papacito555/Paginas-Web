

package manual;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Manual {

    
    public static void main(String[] args) throws IOException  {
BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
do{
     System.out.println("\tMENU DE OPCIONES");
System.out.println("1)Tablas de multiplicar\n 2)Operaciones\n 3)Salario");
int op=Integer.parseInt(leer.readLine());

if(op==1){
    System.out.println("Tablas de multiplicar.");
    System.out.println("Ingresa el numero de tabla: ");
int tab=Integer.parseInt(leer.readLine());
   for(int i=1;i<=10;i++){
       int resul=tab*i;
       System.out.println(tab+"*"+i+"="+resul);
   }
   }


if(op==2){
     System.out.println("OPERACIONES");
    System.out.println("1)Suma,\n 2)Resta,\n 3)Multipicacion,\n4)Division");
    int op1=Integer.parseInt(leer.readLine());
    
  if(op1==1){
            System.out.println("Ingresa el primer numero");
            String num1=leer.readLine();
            System.out.println("Ingresa el seundo numero");
            String num2=leer.readLine();
           double num11=Double.parseDouble(num1);
            double num22=Double.parseDouble(num2);
            double num3=num11+num22;
            System.out.println("El resultado es:"+num3);
            
        }
        
        else if(op1==2){
             System.out.println("Ingresa el primer numero");
            String num1=leer.readLine();
            System.out.println("Ingresa el seundo numero");
            String num2=leer.readLine();
           double num11=Double.parseDouble(num1);
            double num22=Double.parseDouble(num2);
            double num3=num11-num22;
            System.out.println("El resultado es:"+num3);
        }
        
           else if(op1==3){
             System.out.println("Ingresa el primer numero");
            String num1=leer.readLine();
            System.out.println("Ingresa el seundo numero");
            String num2=leer.readLine();
           double num11=Double.parseDouble(num1);
            double num22=Double.parseDouble(num2);
            double num3=num11*num22;
            System.out.println("El resultado es:"+num3);
        }
         else if(op1==4){
             System.out.println("Ingresa el primer numero");
            String num1=leer.readLine();
            System.out.println("Ingresa el seundo numero");
            String num2=leer.readLine();
           double num11=Double.parseDouble(num1);
            double num22=Double.parseDouble(num2);
            double num3=num11/num22;
            System.out.println("El resultado es:"+num3);
        }
}
  

if(op==3){
    System.out.println("Nombre:");
  String nom=leer.readLine();
  System.out.println("Salario: ");
  double sal=Double.parseDouble(leer.readLine());
   System.out.println("Porcentaje de descuento: ");
  double des=Double.parseDouble(leer.readLine());
  
  double ress=sal*des/100;
  double res=sal-ress;
   System.out.println("Nombre: "+nom);
  System.out.println("Salario con descuento: "+res);
}
}
while(true);
  }
}
    
