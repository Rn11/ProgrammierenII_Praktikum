import java.awt.*;
import java.awt.event.*;

//import von javax.swing.ImageIcon für die Bilder der Buttons
import javax.swing.*;

public class MemoryMain {
	static JFrame screen;

	public static void main(String[] args) {
		prepareGUI();
	}

	static void prepareGUI() {
		screen = new JFrame("Memory");
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// screengroesse 600x600
		screen.setSize(600, 600);
		screen.setVisible(true);

		// 2x2 Raster erstellen
		screen.setLayout(new GridLayout(2, 2));

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
		// icons per Referenz manipuliert werden können
		ImageIcon kaffee = new ImageIcon("bilder/kaffee.png");
		ImageIcon bier = new ImageIcon("bilder/bier.png");

		// event listener
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ersetze das image mit einer skalierten instanz des bildes,
				// dessen groesse sich nach dem button richtet
				bier.setImage(bier.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(),
						Image.SCALE_DEFAULT));
				button1.setIcon(bier);
				/*
				 * sobald eine action auf dem button performed wurde, bekommt
				 * der Button ein Bild (hier: Bier)
				 */

				// und der Text des Buttons (die 1) verschwindet
				button1.setText("");

			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffee.setImage(kaffee.getImage().getScaledInstance(button2.getHeight(), button2.getWidth(),
						Image.SCALE_DEFAULT));
				button2.setIcon(kaffee);
				button2.setText("");

			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffee.setImage(kaffee.getImage().getScaledInstance(button3.getHeight(), button3.getWidth(),
						Image.SCALE_DEFAULT));
				button3.setIcon(kaffee);
				button3.setText("");

			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bier.setImage(bier.getImage().getScaledInstance(button4.getHeight(), button4.getWidth(),
						Image.SCALE_DEFAULT));
				button4.setIcon(bier);
				button4.setText("");
			}
		});

		/*
		 * Known bugs: - Buttons werden nicht richtig resized --> ggf. ist ein
		 * teil des buttons sichtbar - Groesse der Bilder werden erst nach
		 * klicken angezeigt --> die aktualisierung muss beim resize event des
		 * fensters erfolgen
		 */
	}

}