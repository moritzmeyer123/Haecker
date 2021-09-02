package Uebung;

public class Main {

	public static void main(String[] args) {
		System.out.println(woIstDerUnterschied("Morina", "Moritz"));

	}
	
	public static int woIstDerUnterschied(String s1, String s2) {
		if (s1.equals(s2)) {
			return 0;
		} else if (s1.length() != s2.length()){
			return -1;
		} else {
			for(int i = 0; i < s1.length(); i++) {
				char c1 = s1.charAt(i);
				char c2 = s2.charAt(i);
				if(c1 != c2) return i + 1;
			}
		}
		return -2;
		
	}

}
