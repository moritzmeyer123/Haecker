package de.dhbw.rh.exceptions.eigeneexceptions;

public class EigeneException11 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EigeneException11() {
		super("Eigene Exception 11");
	}
	
	public EigeneException11(String message) {
		super ("Eigene Exception 11: " + message);
	}
	
}
