
package Tarea;
public class MenoraMayor {
   public int Menor(int num1,int num2,int num3) {
       int meno=0;
       if(meno==0){
           if(num1<num2 &&  num1<num3){
                System.out.println("Menor:"+num1);
           }
           if(num2<num1 && num2<num3){
                System.out.println("Menor:"+num2);
           }
           if(num3<num1 && num3<num2){
                System.out.println("Menor:"+num3);
           }
           }
       return meno;
   }
    public int Medio(int num1,int num2,int num3){
        int medi=0;
        
        if(medi==0){
            if(num1>num2 && num1<num3 || num1<num2 && num1>num3 ){
             System.out.println("Medio:"+num1);
            }
            if(num2>num1 && num2<num3 || num2<num1 && num2>num3){
                System.out.println("Medio:"+num2);
            }
            if(num3>num1 && num3<num2 || num3<num1 && num3>num2){
                System.out.println("Medio:"+num3);
                 }
        }
        
        return medi;
    }
    
    public int Mayor(int num1,int num2,int num3){
    int mayo;
    mayo=0;
  
    if(mayo==0){ 
       if(num1>num2 && num1>num3){
           System.out.println("Mayor:"+num1);
       }
           if(num2>num1 && num2>num3){
               System.out.println("Mayor:"+num2);
       }
    
            if(num3>num1 && num3>num2){
                System.out.println("Mayor:"+num3);
            }
            }

return mayo;
       }
}
    

    