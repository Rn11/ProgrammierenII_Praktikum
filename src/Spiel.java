import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class Spiel {
	static JFrame screen;

	static void prepareGUI() {
		screen = new JFrame("Memory");
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// screengroesse 600x600
		screen.setSize(800, 800);

		// 2x2 Raster erstellen
		screen.setLayout(new GridLayout(4, 4, 10, 10));

		// buttons erstellen
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button10 = new JButton("10");
		JButton button11 = new JButton("11");
		JButton button12 = new JButton("12");
		JButton button13 = new JButton("13");
		JButton button14 = new JButton("14");
		JButton button15 = new JButton("15");
		JButton button16 = new JButton("16");

		screen.getContentPane().add(button1);
		screen.getContentPane().add(button2);
		screen.getContentPane().add(button3);
		screen.getContentPane().add(button4);
		screen.getContentPane().add(button5);
		screen.getContentPane().add(button6);
		screen.getContentPane().add(button7);
		screen.getContentPane().add(button8);
		screen.getContentPane().add(button9);
		screen.getContentPane().add(button10);
		screen.getContentPane().add(button11);
		screen.getContentPane().add(button12);
		screen.getContentPane().add(button13);
		screen.getContentPane().add(button14);
		screen.getContentPane().add(button15);
		screen.getContentPane().add(button16);

		screen.setVisible(true);

		// Icons werden nun seperat angelegt, damit bei den action listenern die
		// icons per Referenz manipuliert werden koennen
		ImageIcon kaffee = new ImageIcon("bilder/5.png");
		ImageIcon bier = new ImageIcon("bilder/2.png");
		// event listener
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// neuer Thread von SleepThread
				SleepThread S1 = new SleepThread("TiredThread");
				S1.start();
				System.out.println("Ist gestartet");

				try {
					// eigentlich sollte hier gewartet werden und das bild
					// anschlieﬂend entfernt werden
					S1.join();
					System.out.println("asdasd");

				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					System.out.println("123");
					e1.printStackTrace();
				}

				button1.setIcon(bier);
				button1.setText("");
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setIcon(kaffee);
				button2.setText("");
				try {
					Mischen.mischen();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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

		// ComponentListener welcher auf das Resize-Event reagiert
		// Bilder werden nun beim aendern der Fenstergroesse skaliert
		screen.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				// Ersetze das image mit einer skalierten Instanz des Bildes,
				// dessen Groesse sich nach dem Button richtet
				// Zu beachten ist hierbei, dass es egal ist, von welchem Button
				// die Groesse abgefragt wird,
				// da alle Buttons gleich gross sind
				bier.setImage(
						bier.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				kaffee.setImage(
						kaffee.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
			}
		});
	}
	/*
	 * Known bugs: -
	 */
}