package Logik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import GUI.Spiel;

public class Logik {
	// Logik-Bereich
	// Pruefung, ob 2 Buttons das gleiche Bild haben
	public static boolean checkCards(String path1, String path2) {
		if (path1 == path2) {
			System.out.println("Ein Päärchen, schön!");
			Spiel.setKlick(0);
		} else {
			// Wenn 2 unterschiedliche Bilder
			Spiel.setKlick(0);
			// Wartezeit bis Buttons "umgedreht" werden
			t.start();
			return true;
		}
		return false;
	}

	// Timer
	private static Timer t = new Timer(750, new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			System.out.println("Pech gehabt...");
			// Bilder der Buttons entfernen
			Spiel.getButtons().get(Spiel.getTmpID_a()).setIcon(null);
			Spiel.getButtons().get(Spiel.getTmpID_b()).setIcon(null);
			t.stop();
		}
	});
}
