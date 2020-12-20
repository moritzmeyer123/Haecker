package de.dhbw.rh.exceptions.eigeneexceptionshaecker;

public class EigeneException2 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EigeneException2() {
		super("Eigene Exception 2");
	}
	
	public EigeneException2(String message) {
		super("Eigene Exception 2: " + message);
	}
}
