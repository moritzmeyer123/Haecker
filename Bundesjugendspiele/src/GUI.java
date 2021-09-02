import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class GUI {
	
	

	public GUI(ArrayList<Teilnehmer> teilnehmerList) {
		erstelleGUI(this.getContentTeilnehmer(teilnehmerList));
	}
	
	private void erstelleGUI(String teilnehmerListe) {
		
		//Hauptpanels
		JPanel panel = new JPanel(new GridLayout(1,2));
		JPanel links = new JPanel(new GridLayout(2,1));
		JPanel rechts = new JPanel();
		
		//Teilnehmer hinzufügen Panel
		JPanel hinzufuegen = new JPanel();
		
		JPanel daten = new JPanel(new GridLayout(4,1));
		
		JTextField name = new JTextField("Name");
		JTextField vorname = new JTextField("Vorname");
		JTextField stufe = new JTextField("Semester");
		JTextField geschlecht = new JTextField("Geschlecht");
		
		JButton hinzuButton = new JButton("Hinzufügen");
		
		daten.add(name);
		daten.add(vorname);
		daten.add(stufe);
		daten.add(geschlecht);
		
		hinzufuegen.add(daten);
		hinzufuegen.add(hinzuButton);
		
		hinzufuegen.setBorder(new CompoundBorder(hinzufuegen.getBorder(), new LineBorder(Color.gray,2)));
		
		//Teilnehmerliste Panel
		JPanel teilnehmerliste = new JPanel();
		
		JTextArea liste = new JTextArea();
		liste.setEditable(false);
		
		teilnehmerliste.setBorder(new CompoundBorder(teilnehmerliste.getBorder(), new LineBorder(Color.gray,4)));
		
		//Sortieren Panel
		JPanel sortieren = new JPanel(new GridLayout(5,1));
		
		JTextField sortierenT = new JTextField("Sortieren");
		sortierenT.setEditable(false);
		sortierenT.setHorizontalAlignment(JTextField.CENTER);
		JButton d1 = new JButton("D1");
		JButton d2 = new JButton("D2");
		JButton d3 = new JButton("D3");
		JButton bName = new JButton("Name");
		
		sortieren.add(sortierenT);
		sortieren.add(d1);
		sortieren.add(d2);
		sortieren.add(d3);
		sortieren.add(bName);
		
		sortieren.setBorder(new CompoundBorder(sortieren.getBorder(), new LineBorder(Color.gray,2)));
		
		//Sieger Panel
		JPanel sieger = new JPanel(new GridLayout(4,1));
		
		JTextField siegerT = new JTextField("Sieger von");
		siegerT.setEditable(false);
		siegerT.setHorizontalAlignment(JTextField.CENTER);
		JButton sD1 = new JButton("D1");
		JButton sD2 = new JButton("D2");
		JButton sD3 = new JButton("D3");
		
		sieger.add(siegerT);
		sieger.add(sD1);
		sieger.add(sD2);
		sieger.add(sD3);
		
		sieger.setBorder(new CompoundBorder(sieger.getBorder(), new LineBorder(Color.gray,2)));
		
		//Unteres Panel
		JPanel unten = new JPanel(new GridLayout(1,2));
		unten.add(sortieren);
		unten.add(sieger);
		
		//Panel zusammenbasteln
		links.add(hinzufuegen);
		links.add(unten);
		
		rechts.add(teilnehmerliste);
		
		panel.add(links);
		panel.add(rechts);
		
		//Ins Frame hinzufuegen
		JFrame frame = new JFrame("Bundesjugendspiele");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	public String getContentTeilnehmer(ArrayList<Teilnehmer> teilnehmerlist) {
		String ergebnis = "";
		for(Teilnehmer t: teilnehmerlist) {
			ergebnis += t.getName() + "\n";
		}
		return ergebnis;
	}
	
	
}
