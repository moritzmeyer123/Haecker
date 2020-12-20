package exceptions;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		testeArrayException(3);
	}

	public static void testeArrayException(int size) {
		int[] arr = new int[size];
		//for (int i = 0; i < 10; i++) {
			try {
				System.out.println(arr[size + 2]);
			} catch (IndexOutOfBoundsException e) {
				int[] temp = new int[8];
				temp[size + 2] = 3;
				arr = temp;
			} finally {
				System.out.println("ENDE");
			}
		//}
	}

	public static void testeArrayExcpetionWOTry(int size) {
		int[] arr = new int[size];
		System.out.println(arr[size + 1]);
	}

	public static void testeNullPointerException(int[] arr) throws FileNotFoundException{
		System.out.println(arr[1]);
	}

}
