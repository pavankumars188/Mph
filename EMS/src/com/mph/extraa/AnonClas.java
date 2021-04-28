package com.mph.extraa;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonClas {

	private Frame f;

	public AnonClas() {
		f = new Frame("My WINDOW");
	}

	public void launchFrame() {
		f.setSize(250, 250);
		f.setBackground(Color.GREEN);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		AnonClas ac = new AnonClas();
		ac.launchFrame();

	}

}