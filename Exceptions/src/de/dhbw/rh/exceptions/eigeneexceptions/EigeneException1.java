package de.dhbw.rh.exceptions.eigeneexceptions;

public class EigeneException1 extends Exception {

	private static final long serialVersionUID = 1L;
	
	public EigeneException1() {
		super("Eigene Exception 1");
	}
	
	public EigeneException1(String message) {
		super ("Eigene Exception 1: " + message);
	}
}
