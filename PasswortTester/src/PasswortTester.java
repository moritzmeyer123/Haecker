

import java.util.Scanner;

public class PasswortTester {

	private int minChars;
	private int minBigChars;
	private int minNums;
	private int minExtra;
	private char[] allowedExtra;

	public PasswortTester(int minChars, int minBigChars, int minNums, int minExtra, char[] allowedExtra) {
		this.minChars = minChars;
		this.minBigChars = minBigChars;
		this.minNums = minNums;
		this.minExtra = minExtra;
		this.allowedExtra = allowedExtra;
	}

	public String testPwd(String pwd) {
		if (pwd.length() < minChars) { // Teste Länge
			return "Das Passwort ist zu kurz. Es fehlen " + (minChars - pwd.length()) + " Zeichen.";
		}
		if (this.countBigs(pwd) < minBigChars) { // Teste Großbuchstaben
			return "Das Passwort enhält nicht genug Großbuchstaben, es fehlen " + (minBigChars - this.countBigs(pwd));
		}
		if (this.countNums(pwd) < minNums) { // Teste Zahlen
			return "Das Passwort enthält nicht genug Zahlen, es fehlen " + (minNums - this.countNums(pwd));
		}
		if (this.countExtras(pwd) < minExtra) { // Teste Sonderzeichen
			return "Das Passwort enthält nicht genug Sonderzeichen, es fehlen " + (minExtra - this.countExtras(pwd));
		}
		if (this.checkExtras(pwd) != 'a') {
			return "Das Zeichen " + this.checkExtras(pwd) + " ist nicht zulässig, folgende Zeichen sind zulässig: "
					+ this.getExtras();
		}
		return "Das Passwort entspricht den Richtlinien";
	}

	public int countBigs(String pwd) {
		int count = 0;
		for (int i = 0; i < pwd.length(); i++) {
			if (Character.isUpperCase(pwd.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public int countNums(String pwd) {
		int count = 0;
		for (int i = 0; i < pwd.length(); i++) {
			if (Character.isDigit(pwd.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public int countExtras(String pwd) {
		int count = 0;
		for (int i = 0; i < pwd.length(); i++) {
			if (!Character.isLetterOrDigit(pwd.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public char checkExtras(String pwd) {
		char forbiddenChar = 'a';
		boolean legalChar = false;
		for (int i = 0; i < pwd.length(); i++) {
			if (!Character.isLetterOrDigit(pwd.charAt(i))) {
				// Prüfe ob es ein erlaubtes Sonderzeichen ist
				for (int j = 0; j < allowedExtra.length; j++) { // Durchlaufe jeden aus den erlaubten Buchstaben
					// wenn i in j ist es ein korrektes Sonderzeichen
					if (pwd.charAt(i) == allowedExtra[j]) {
						legalChar = true;
					}
				}
				forbiddenChar = pwd.charAt(i);
			}
		}
		if (legalChar) {
			return 'a';
		} else {
			return forbiddenChar;
		}
	}

	public String getExtras() {
		String allowed = "";
		for (int i = 0; i < allowedExtra.length; i++) {
			allowed += allowedExtra[i] + " ";
		}
		return allowed;
	}

	public static void main(String[] args) {
		char[] extras = { '.', '@', '+', '#', '-' };
		PasswortTester pwt = new PasswortTester(11, 2, 2, 2, extras);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		while (!input.equals("ENDE")) {
			System.out.println(pwt.testPwd(input));
			input = scanner.nextLine();
		}
		scanner.close();
	}

}
