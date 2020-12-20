package de.dhbw.rh.exceptions.eigeneexceptionshaecker;

public class EigeneException1 extends Exception {

	/**
	 * Nur zur Info:
	 * https://de.wikipedia.org/wiki/Serialisierung
	 * Serialisierung ist nötig, z. B. um Objekte in Streams zu schreiben.
	 * Die VersionUID wird dabei verwendet um sicherzustellen, dass serielle Daten
	 * beim einlesen auch zum Programm passen.
	 */
	private static final long serialVersionUID = 1L;
	
	public EigeneException1() {
		super("Eigene Exception1");
	}
	
	public EigeneException1(String message) {
		super("Eigene Exception1: " + message);
	}

}
