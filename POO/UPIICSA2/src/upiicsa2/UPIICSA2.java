/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upiicsa2;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class UPIICSA2 {

  
    public static void main(String[] args) {
   final int N=16;
  	int a []={25,255,12,72,73,98,5,8,47,105,34,21,27,16,87,116}; 
		for(int i=0;i<N;i++) System.out.print(a[i]+" ");
		System.out.println();

	for(int i=1;i<N;i++){
		int temp=a[i];
		int j=i-1;
		while(j>=0 && a[j]>temp){
		a[j+1]=a[j];   //recorrimiento a la derecha
		j--;
		}
		a[j+1]=temp;    //por el ultimo decremento
	}
	for(int i=0;i<N;i++) System.out.print(a[i]+" ");
		System.out.println();
  }
        
        
        
    }
    




