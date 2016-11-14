/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;
import java.util.Scanner;
/**
 *legge un numero in input e stampa se è pari o dispari 
 * 
 * @author tss
 */
public class PariDispare {
    public static void main (String[] args){
        String risultato;
    
    //crea oggetto scanner per leggere imput    
    Scanner s = new Scanner (System.in);
    
    System.out.print("inserire il numero: ");
    //legge un numero intero inserito da console,da errore se non è numero
    int numero=s.nextInt();
    if((numero % 2)==0){
        
        risultato=" Il numero è pari";
    }
    else
    {
    risultato=" il numero è dispari";
    }
    System.out.println("Il numero inserito è " +  numero + risultato);
    
    
    }
    
}
