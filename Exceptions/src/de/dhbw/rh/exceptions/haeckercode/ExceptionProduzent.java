package de.dhbw.rh.exceptions.haeckercode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import de.dhbw.rh.exceptions.eigeneexceptionshaecker.EigeneException1;
import de.dhbw.rh.exceptions.eigeneexceptionshaecker.EigeneException11;
import de.dhbw.rh.exceptions.eigeneexceptionshaecker.EigeneException2;
import de.dhbw.rh.exceptions.eigeneexceptionshaecker.EigeneException22;


public class ExceptionProduzent {
	
	public static void produziereOutOfMemory() {
		int i = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while(true) {
			i++;
			list.add(i); // fügt so lange Elemente in die Liste ein, bis der Speicher voll ist
			// mit einem anderen Listen Typ würde das länger dauern (Das Array im Hintergrund muss kopiert werden)
			if(i%100000 == 0) {
				System.out.println(i);

			}
		}
	}
	
	public static void produziereNullPointerException(String s) { // Wenn hier null übergeben wird, wird eine NullPointerException geworfen. 
		if(s.equals("test")) {
			System.out.println("ok."); // W
		}
	}
	
	public static void produziereFileNotFoundException() throws FileNotFoundException {
		FileReader fir = new FileReader("abc"); // Wenn nicht zufällig eine Datei mit Namen "abc" im aktuellen Verzeichnis liegt, wird hier schon eine Exception geworfen
	}
	
	public static void produziereEineException(boolean mitGrund) throws Exception {
		if(mitGrund) {
			throw new Exception("Eine Exception, die einen Grund hat", new Exception("Der Grund"));
		} else {
			throw new Exception("Eine Exception wurde geworfen");
		}
	}
	
	public static void produziereMehrereExceptions(int welche) throws EigeneException1, EigeneException11, EigeneException2, Exception {
		switch(welche) {
		case 1:
			throw new EigeneException1();
		case 2: 
			throw new EigeneException2();
		case 11:
			throw new EigeneException11();
		case 22: 
			throw new EigeneException22(); 
			// erbt von EigeneException2, muss daher nicht nochmal separat bei throws aufgeführt werden
		default:
			throw new Exception();
		}
	}

}
