package uebung;

public class Counter {

	int number;
	
	public Counter() {
		number = 0;
	}
	
	public int increaseNumber() {
		number++;
		return number;
	}
	
	public int decreaseNumber() {
		number--;
		return number;
	}
	
	public int getNumber() {
		return number;
	}
	
}
