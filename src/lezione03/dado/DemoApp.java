/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione03.dado;


public class DemoApp {

    
    public static void main(String[] args) {
        //creo oggetto giocatore e dichiaro dentro variabili dichiarate nel costruttore
        Giocatore g = new Giocatore("Rossi",10);
        //creo oggetti dado giocatore e banco e dichiaro dentro variabili dichiarate nel costruttore
        Dado gDado= new Dado(6);
        Dado bDado = new Dado(6);
        
        contatore contaMani = new contatore (0,1);
        while(g.saldo()>0){
            contaMani.conta();
        int lancioGiocatore=gDado.lancio();
        int lancioBanco=bDado.lancio();
        if(lancioGiocatore>lancioBanco){
        g.vince();
        }
        else
        {
        g.perde();
        }
        
       System.out.println(contaMani.valoreCorrente()+ "risultato lancio: Giocatore" + lancioGiocatore + "----banco" + lancioBanco);
       
       g.stampa();
        
       }
        
       
       
    }
    
}
