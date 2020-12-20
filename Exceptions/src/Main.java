import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import de.dhbw.rh.exceptions.eigeneexceptions.EigeneException1;
import de.dhbw.rh.exceptions.eigeneexceptions.EigeneException11;
import de.dhbw.rh.exceptions.eigeneexceptions.EigeneException2;
import de.dhbw.rh.exceptions.eigeneexceptions.EigeneException22;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * try { produziereEineException(true); } catch (Exception e) {
		 * e.printStackTrace(new PrintStream("fehler.txt")); }
		 */

		//produziereEineException(true);
		//produziereFileNotFoundException();
		//fangeMehrereExceptions();
		System.out.println(finallyBlock());

	}

	public static void produziereEineException(boolean mitGrund) throws Exception {
		if (mitGrund) {
			Exception e = new Exception("Der Grund");

			try {
				int[] i = { 1, 2, 3 };

				i[5] = 3;
			} catch (Exception ex) {
				throw new Exception("Fehler beim Zugriff, zu Demozwecken", ex);
			} finally {
				System.out.println("Grüße vom finally Block");
			}
			System.out.println("Try war erfolgreich");
		}
	}

	public static void produziereFileNotFoundException() throws Exception{
		try {
			FileReader fir = new FileReader("abc");
			fir.close();
		} catch (FileNotFoundException e) {
			throw new Exception("Die File abc konnte nicht gefunden werden", e);
		} catch(IOException e) {
			throw new IOException("Eine IOExceptin ist aufgetreten", e);
		} catch (Exception e) {
			throw new Exception("Eine Exception ist aufgetreten", e);
		}
	}

	public static void produziereMehrereExceptions(int welche)
			throws EigeneException1, EigeneException2, EigeneException11, EigeneException22, Exception {
		switch (welche) {
		case 1:
			throw new EigeneException1();
		case 2:
			throw new EigeneException2();
		case 11:
			throw new EigeneException11();
		case 22:
			throw new EigeneException22();
		default:
			throw new Exception();
		}

	}

	public static void fangeMehrereExceptions() {
		try {
			produziereMehrereExceptions(2);
		} catch (EigeneException11 e) {
			System.out.println("Catch von ex11");
			e.printStackTrace();
		} catch (EigeneException1 e) {
			System.out.println("Catch von ex1");
			e.printStackTrace();
		} catch (EigeneException22 e) {
			System.out.println("Catch von ex22");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean finallyBlock() {
		try {
			return true;
		} catch(Exception e) {
			return false;
		} finally {
			System.out.println("Grüße vom Finally-Block");
			//return false; //wird immer ausgeführt werden
		}
	}

}
