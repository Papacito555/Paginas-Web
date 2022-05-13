/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author edgar
 */
public class par {
     
    public int num(int i, int b, int s){
int lol=0;


while(i<=b)
{
if (i%2==0)
{
System.out.print(i+"*");
s=(s*i);
}
i++;
}


return lol;
   
    }
        
        

}
