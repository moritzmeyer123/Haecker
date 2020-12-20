package basics;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teilKetten();
	}

	public static void basics() {
		String s0 = "Test";

		String s1 = new String();

		String s2 = new String("Test");

		char[] c = { 't', 'e', 's', 't' };

		String s3 = new String(c);

		String s4 = "";

		String s5 = null; // s4 != s5

		String s6 = "Test";

	}

	public static void comparingStrings() {
		String s0 = "test", s1 = "test", s2 = new String("test"), s3 = new String("Test"), s4 = "Teststring",
				s5 = "string";
		
		System.out.println(s0 == s1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1)); //funktioniert in beide Richtungen
		System.out.println(s2.equalsIgnoreCase(s3)); //Groß- /Kleinschreibung ignoriert
		System.out.println(s4.startsWith(s3, 2)); 
		System.out.println(s4.endsWith(s5));
		
		System.out.println(s2.compareTo(s3));
		
		System.out.println("10".compareTo("2"));
		System.out.println("tEst".compareTo("Test")); //nicht 0, weil nach Unterschied des t ist schon unterschiedlich
		
		System.out.println(s3.compareTo(s4)); //CompareTo liefert nur 0, wenn Laenge und Groß-Klein gleich ist
		
		System.out.println(s4.compareTo("U")); //Erst Laenge vergleichen, wenn Buchstaben gleich sind
	}
	
	public static void teilKetten() {
		String s = "Hallo Welt";
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf('l'));
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.substring(6));
		System.out.println(s.substring(1, 5));
	}

	
	
	
	
	
	
	
}
