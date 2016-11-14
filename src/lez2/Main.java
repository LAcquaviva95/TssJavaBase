/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez2;

/**
 * commenti vari
 *
 * @author tss
 */
public class Main {

    //variabile statica
    private static int colore;
    //variabile di istanza
    private int carattere;

    public static void main(String[] args) {
        // args è una variabile locale del main che identifica un parametro

        //singola riga
        /*
        più
        righe
         */
        System.out.println("start esempio commenti...");
        int totale = 10;
        String frase;

        if (totale > 0) {
            int x = 5;
            frase = "Il totale è positivo";
        } else {
            int x = 10;
            frase = "il totale è negativo";

        }

        frase = (totale > 0) ? "il totale è positivo" : "il totale è negativo";

        totale += 20;
        System.out.println("totale: " + totale);
        System.out.println(frase);
    }

}
