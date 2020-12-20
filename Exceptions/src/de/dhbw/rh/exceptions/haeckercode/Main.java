package de.dhbw.rh.exceptions.haeckercode;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		/*try {
			new InputFile("test.txt").getLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} */
		new InputFile("test.txt").getLine();
	}
}
