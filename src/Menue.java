import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// Klasse fuer das GUI des Hauptmenues
public class Menue {
	static JFrame screen;
	
	// aufloesung
	// hoehe
	private static int res_h = 768;
	// breite
	private static int res_b = 1024;

	// getter und setter entsprechender variablen
	public static int getRes_b() {
		return res_b;
	}

	public static void setRes_b(int res_b) {
		Menue.res_b = res_b;
	}

	public static int getRes_h() {
		return res_h;
	}

	public static void setRes_h(int res_h) {
		Menue.res_h = res_h;
	}

	static void prepareGUI() {
		screen = new JFrame("Memory");
		screen.setLocationRelativeTo(null);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setSize(450, 450);
		screen.setLayout(new GridBagLayout());

		JButton btnEinzelspieler = new JButton("Einzelspieler");
		JButton btnMehrspieler = new JButton("Mehrspieler");
		JButton btnCredits = new JButton("Credits");
		JButton btnEinstellungen = new JButton ("Einstellungen");
		JButton btnExit = new JButton("Verlassen");

		GridBagConstraints c = new GridBagConstraints();

		c.insets = new Insets(4, 4, 4, 4);
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		screen.getContentPane().add(btnEinzelspieler, c);
		c.gridy = 1;
		screen.getContentPane().add(btnMehrspieler, c);
		c.gridy = 2;
		screen.getContentPane().add(btnEinstellungen, c);
		c.gridy =3;
		screen.getContentPane().add(btnCredits, c);
		c.gridy =4;
		screen.getContentPane().add(btnExit, c);
		screen.setVisible(true);


		btnEinzelspieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Schliesse Menue
				screen.dispose();
				// Starte Einzelspieler
				// uebergebe aufloesung
				Spiel.prepareGUI(res_b, res_h);	
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Schliesse Applikation
				System.exit(0);
			}
		});
		btnCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Schliesse Applikation
				credits.main(null);
			}
		});
		btnEinstellungen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Schliesse Applikation
				Einstellungen.einstellungen();
			}
});
	}
}