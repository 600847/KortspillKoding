package no.hvl.dat100.prosjekt;

public class TODO {

	public static String method() {
		//hei hva skjer
		//Hei igjen
		//hei igjen2
		//hei igjen3
		//takk for kampen gutta
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		
		return "Metoden " + methodName + " er ikke implementert";
	}
	
	
	public static String constructor(String className) {
				
	   return "Konstruktøren for klassen " + className + " er ikke implementert";
		
	}

}
