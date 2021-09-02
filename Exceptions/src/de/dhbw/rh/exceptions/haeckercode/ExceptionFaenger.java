package de.dhbw.rh.exceptions.haeckercode;

import de.dhbw.rh.exceptions.eigeneexceptionshaecker.EigeneException1;
import de.dhbw.rh.exceptions.eigeneexceptionshaecker.EigeneException11;
import de.dhbw.rh.exceptions.eigeneexceptionshaecker.EigeneException2;

public class ExceptionFaenger {
	
	public static void fangeEineException() {
		try {
			ExceptionProduzent.produziereEineException(true);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	public static void fangeMehrereExceptions() {
		try {
			ExceptionProduzent.produziereMehrereExceptions(2); 
			// der Compiler prüft nicht, welche Exception hier tatsächlich geworfen wird, das passiert zur Laufzeit
		} catch(EigeneException11 ex11) {
			ex11.printStackTrace();
		} catch(EigeneException1 ex1) {
			ex1.printStackTrace();
		} catch(EigeneException2 ex2) {
			// Hier werden EigeneException2 und EigeneException22 aufgefangen
			ex2.printStackTrace();
		} catch(Exception e) { // kann als eine Art Default oder Fallback funktionieren
			e.printStackTrace();
		}
	}
	
	public static String finallyBlock() {
		try {
			// Hier könnte eine Exception geworfen werden
			return "try";
		} catch(Exception e) {
			return "catch";
		} finally {
			return "finally";
		}
	}

}
