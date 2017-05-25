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

	static void prepareGUI() {
		screen = new JFrame("Memory");
		screen.setLocationRelativeTo(null);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setSize(200, 200);
		screen.setVisible(true);
		screen.setLayout(new GridBagLayout());

		JButton btnEinzelspieler = new JButton("Einzelspieler");
		JButton btnMehrspieler = new JButton("Mehrspieler");
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
		screen.getContentPane().add(btnExit, c);

		btnEinzelspieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Starte Einzelspieler
				Spiel.prepareGUI();
			}
		});
	}
}
