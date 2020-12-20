package exceptions;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		testeArrayException(3);
	}

	public static void testeArrayException(int size) {
		int[] arr = new int[size];
		try {
			System.out.println(arr[size + 2]);
		} catch (IndexOutOfBoundsException e) {
			int[] temp = new int[8];
			temp[size + 2] = 3;
			arr = temp;
		}

	}

	public static void testeArrayExcpetionWOTry(int size) {
		int[] arr = new int[size];
		System.out.println(arr[size + 1]);
	}

	public static void testeNullPointerException(int[] arr) throws FileNotFoundException {
		System.out.println(arr[1]);
	}

}
