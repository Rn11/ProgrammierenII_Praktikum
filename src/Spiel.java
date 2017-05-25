import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Spiel {
	static JFrame screen;

	static void prepareGUI() {
		screen = new JFrame("Memory");
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// screengroesse 600x600
		screen.setSize(600, 600);
		screen.setVisible(true);

		// 2x2 Raster erstellen
		screen.setLayout(new GridLayout(2, 2, 10, 10));

		// buttons erstellen
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");

		screen.getContentPane().add(button1);
		screen.getContentPane().add(button2);
		screen.getContentPane().add(button3);
		screen.getContentPane().add(button4);

		// Icons werden nun seperat angelegt, damit bei den action listenern die
		// icons per Referenz manipuliert werden koennen
		ImageIcon kaffee = new ImageIcon("bilder/kaffee.png");
		ImageIcon bier = new ImageIcon("bilder/bier.png");

		// Ersetze das image mit einer skalierten Instanz des Bildes,
		// dessen Groesse sich nach dem Button richtet
		//
		// Zu beachten ist hierbei, dass es egal ist, von welchem Button die
		// Groesse abgefragt wird,
		// da alle Buttons gleich gross sind
		bier.setImage(bier.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_DEFAULT));
		kaffee.setImage(
				kaffee.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_DEFAULT));

		// event listener
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// sobald eine action auf dem button performed wurde, bekommt
				// der Button ein Bild (hier: Bier)
				button1.setIcon(bier);
				// Der Text des Buttons (die 1) verschwindet
				button1.setText("");
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setIcon(kaffee);
				button2.setText("");
			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3.setIcon(kaffee);
				button3.setText("");
			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4.setIcon(bier);
				button4.setText("");
			}
		});
	}

	/*
	 * Known bugs: - Buttons werden nicht richtig resized --> ggf. ist ein teil
	 * des buttons sichtbar - Groesse der Bilder werden erst nach klicken
	 * angezeigt --> die aktualisierung muss beim resize event des fensters
	 * erfolgen
	 */
}
