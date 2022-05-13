/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreCarga;


/**
 *
 * @author edgar
 */
class Sobrecarga {
  //  public static void main (String []garo){
    // BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    public void prueba(){
        
System.out.println("Metodos sin argumentos:");
        
        
    }
    
    public void prueba(int x){

  System.out.println("Metodo con 1argumento:");
         System.out.println("x="+x);
        
    }
     public void prueba(int x, int y){

  System.out.println("Metodo con 2 argumento:");
         System.out.println("x="+x+"y="+y);
     }
  
     public void prueba(double x, double y, double z){

       System.out.println("Metodo con 3 argumentos");
       System.out.print("x="+x+"y="+y+"z="+z);
}
     
     
}

