/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author edgar
 */
public class Areas {
    
    public void Areass(double pi,double radio){
        double cuadrado=radio*radio;
        double resul=pi*cuadrado;
        
        System.out.println("Area del circulo="+resul);
    
    }    
    
     public void Areass(int base,int altura){
         
         double resul=base*altura;
          System.out.println("Area del rectangulo="+resul);
         
     }
 
     
       public void Areass(int lado){
           int resul=lado*lado;
           System.out.println("Area del cuadrado="+resul);
       }
      
     
}
