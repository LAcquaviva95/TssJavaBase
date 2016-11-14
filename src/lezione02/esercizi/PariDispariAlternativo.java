/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class PariDispariAlternativo {
     public static void main (String[] args){
       
    
    //crea oggetto scanner per leggere imput    
    Scanner s = new Scanner (System.in);
    
    System.out.print("inserire il numero: ");
    //legge un numero intero inserito da console,da errore se non è numero
    int numero=s.nextInt();
    int n=0;
    for (int i=0; i<(numero/2); i++ )
    {
        n=n+2;
    }
    if(n==numero)
    { 
        System.out.print(" Il numero è pari");
    }
    else
    {
         System.out.print(" Il numero è dispari");
    }
   
    
    
    }
    
    
}
