package uebung;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	
	
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		buildWindow(counter);
	}
	
	public static void buildWindow(Counter counter) {
		JPanel panel = new JPanel();
		
		JLabel text = new JLabel("number: 0");
		JButton addButton = new JButton("+");
		JButton minusButton = new JButton("-");
		
		addButton.addActionListener(new AddActionListener(text, counter));
		minusButton.addActionListener(new MinusActionListener(text, counter));
		
		panel.add(addButton);
		panel.add(text);
		panel.add(minusButton);
		
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("Number");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
	
	
}
