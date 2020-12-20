package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MeinMouseAdapter extends MouseAdapter {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e);
	}

}
