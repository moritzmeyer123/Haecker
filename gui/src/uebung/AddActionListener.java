package uebung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class AddActionListener implements ActionListener {
	
	JLabel label;
	Counter counter;
	
	public AddActionListener(JLabel label, Counter counter) {
		this.label = label;
		this.counter = counter;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("number :" + Integer.toString(counter.increaseNumber()));

	}

}
