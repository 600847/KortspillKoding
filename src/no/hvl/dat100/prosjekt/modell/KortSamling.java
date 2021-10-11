package no.hvl.dat100.prosjekt.modell;

import no.hvl.dat100.prosjekt.TODO;
import java.util.Arrays;	
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

/**
 * Struktur for Ã¥ lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene. NÃ¥r
 * programmet er ferdig settes denne til 13, men under utvikling / testing kan
 * det vÃ¦re praktisk Ã¥ ha denne mindre.
 * 
 */
public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;
	private int antall;

	

	/**
	 *m Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {
		samling = new Kort[MAKS_KORT];
		antall=0;

	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke vÃ¦re
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan fÃ¥
	 * tilgang til antallet ved Ã¥ bruke metoden getAntallKort(). Metoden er
	 * fÃ¸rst og fremst ment Ã¥ brukes i testklasser. Om man trenger
	 * kortene utenfor, anbefales metoden getAlleKort().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {
		
		return samling;
		
	}
	
	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {
		
		// TODO - START
		
		return antall;
		
		// TODO - END
	}
	
	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {
		
		// TODO - START
		boolean erTom = true;
		if (antall > 0)
			erTom = false;
		
		return erTom;
		
		// TODO - END
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort
	 *            er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {
		
		// TODO - START
		samling[antall]= kort;
		antall++;
		// TODO - END
		
	}
	
	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil vÃ¦re sortert
	 * slik at de normalt mÃ¥ stokkes fÃ¸r bruk.
	 */
	public void leggTilAlle() {
		
		// TODO - START
		// Husk: bruk Regler.MAKS_KORT_FARGE for Ã¥ fÃ¥ antall kort per farge
		for(Kortfarge farge: Kortfarge.values()) {
			for(int i=0; i<Regler.MAKS_KORT_FARGE; i++) {
				Kort kort =new Kort(farge, i+1);
				leggTil(kort);
			}
		}
		 //TODO - END
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {
		
		// TODO - START
		samling = new Kort[MAKS_KORT];
		antall = 0;
	}
		// TODO - END
	
	/**
	 * Ser pÃ¥ siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort seSiste() {
		
		// TODO - START
		if(antall<=0)
			return null;
		return samling[antall-1];
	
		
		// TODO - END
		
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		
		// TODO - START
		if (antall<=0)
			return null;
		Kort siste = samling[antall-1];
		samling[antall-1]=null;
		antall--;
		return siste;
		
		
		// TODO - END
	}
	
	/**
	 * UndersÃ¸ker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {
		
		   if (kort == null){
	            return false;
	        }
	        
	        for (int i = 0; i < samling.length; i++){
	            if (samling[i] == null){
	                continue;
	            }
	            else if (kort.equals(samling[i])){
	                return true;
	            }
	        }
	        return false;
	    }
	

	/**
	 * Fjernar et kort frÃ¥ samlinga. Dersom kortet ikke finnest i samlinga,
	 * skjer ingenting med samilingen
	 * 
	 * @param kort
	 *            kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *            ingenting.
	 * @return true om kortet blev fjernet fra samlinga, false ellers.
	 */
			 
	public boolean fjern(Kort kort) {
		
		// TODO - START
		for(int i = 0; i<samling.length; i++) {
            if (samling[i] == null){
                continue;
            }
            else if(samling[i].equals(kort)) {
                samling[i] = null;
                antall--;
                return true;
            }
        }
        return false;
		
 
		// TODO - END
	}

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefÃ¸lge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {
		
		// TODO - START
		Kort[] copy = new Kort[antall];
		int teller= 0;
		for(int i=0; i<samling.length; i++) {
			if(samling[i] instanceof Kort) {
				copy[teller]=samling[i];
				teller++;
			}
		}
		return copy;
		

		// TODO - END
	
	}
	
}