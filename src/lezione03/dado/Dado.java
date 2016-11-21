
package lezione03.dado;

import java.util.Random;



public class Dado {
    private int numeroFacce;
    
   public Dado(int facce){
   numeroFacce=facce;
   }
    
    public int lancio(){
        Random rnd= new Random();
       return rnd.nextInt(numeroFacce) + 1;
        
                
        
    }
    
}
