package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

public class Main {

	public static void main(String[] args) {
		einfachesFenster();
	}
	
	public static void einfachesFenster() {
		JPanel panel = new JPanel();
		
		
		//panel.setLayout(new BorderLayout());
		//panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setLayout(new GridLayout(0 , 10));
		
		for(int i = 1; i <= 10; i++) {
			JButton button = new JButton("Button " + i);
			button.addMouseListener(new MeinMouseAdapter());
			panel.add(button);
		}
		
	/*  panel.add(new JButton("Norden"), BorderLayout.NORTH);
		panel.add(new JButton("Westen"), BorderLayout.WEST);
		panel.add(new JButton("Süden"), BorderLayout.SOUTH);
		panel.add(new JButton("Osten"), BorderLayout.EAST);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(new JButton("Norden"), BorderLayout.NORTH);
		panel2.add(new JButton("Westen"), BorderLayout.WEST);
		panel2.add(new JButton("Süden"), BorderLayout.SOUTH);
		panel2.add(new JButton("Osten"), BorderLayout.EAST);
//		panel2.add(new JButton("Zentrum2")); //maximal eine pro Richtung möglich
		panel2.add(new JButton("Zentrum"), BorderLayout.CENTER);
		
		panel.add(panel2, BorderLayout.CENTER); */
		
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("Test Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//frame.setSize(300, 300);
		frame.pack();
	}
}
