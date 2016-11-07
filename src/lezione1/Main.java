/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione1;

/**
 *
 * @author tss
 */
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        System.out.println("Primo software inizializzato...");
        String frase = JOptionPane.showInputDialog("inserisci la frase da stampare");
        System.out.println(frase);        
    }
}
