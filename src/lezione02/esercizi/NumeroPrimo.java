/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 *legge un numero in imput e stampa se è un numero primo oppure no
 * @author tss
 */
public class NumeroPrimo {
    public static void main(String[] args){
    Scanner s = new Scanner (System.in);
    
    System.out.print("inserire il numero: ");

    int numero=s.nextInt();
    if(numero<=1){
        System.out.println("errore");
        System.exit(0);
    }
    int n=0;
    int v=0;
    
    for (int i=0; i<(numero/2); i++ )
    {
        n=n+2;
    }
     
     for (int j=0; j<(numero/3); j++ )
    {
        v=v+3;
    }
      

    if(n==numero && n!=2)
    { 
        System.out.print("il numero non è primo ");
    }
    else{
    
    if(numero==v && numero!=3)
    {
        System.out.print("Il numero non è primo ");
    }
    else
    {
        System.out.print("il numero è primo ");
    }
    }
        
    
    
    
    }
    
}
