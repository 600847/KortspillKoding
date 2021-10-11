package no.hvl.dat100.prosjekt.modell;

import java.util.Arrays;
import java.util.Collections;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

    /**
     * Sorterer en samling. RekkefÃ¸lgen er bestemt av compareTo() i Kort-klassen.
     * 
     * @see Kort
     * 
     * @param samling
     *             samling av kort som skal sorteres. 
     */
    
    public static void sorter(KortSamling samling) {
        
        // TODO START
        Kort[] alleKort = samling.getAllekort();

        Arrays.sort(alleKort);
        samling.fjernAlle();

        for(Kort K: alleKort) {
            samling.leggTil(K);
        }
    }
           
        // TODO - END
           
    
         
    /**
     * Stokkar en kortsamling. 
     * 
     * @param samling
     *             samling av kort som skal stokkes. 
     */
    public static void stokk(KortSamling samling) {
        
        // TODO - START
        
        Kort[] alleKort = samling.getAllekort();
        Random rand = new Random();
        for(int i = 0; i<alleKort.length; i++) {
            int randomIndexToSwap = rand.nextInt(alleKort.length);
            Kort temp = alleKort[randomIndexToSwap];
            alleKort[randomIndexToSwap]= alleKort[i];
            alleKort[i] =temp;
            
        }
        
        
        // TODO - END
    }
    
}

