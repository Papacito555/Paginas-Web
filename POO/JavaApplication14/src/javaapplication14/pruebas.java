
package javaapplication14;

public class pruebas {

    public double primedio(double arr1[]){
       double suma = 0 ;
       double promedio;
        
        for(int i=0;i<arr1.length;i++){
           suma+=arr1[i];
        }
        promedio=suma/arr1.length;
        return promedio;
    }

    
}
