import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Einstellungen {

	public static void einstellungen() {

		// Erstellung des Fensters "Einstellung"
		JFrame eFenster = new JFrame("Einstellungen");
		eFenster.setLayout(new GridBagLayout());
		//Deklarierung von Button und Label
		JLabel beschreibung = new JLabel("Memory Größe:");
		JLabel groesse = new JLabel("Fenster Größe:");
		JLabel funktion = new JLabel ("EINSTELLUNGEN WERDEN NOCH IMPLEMENTIERT");
		JButton zurueck = new JButton ("Zurück");
		
		//Einstellung der Größe
		eFenster.setSize(400, 400);
		eFenster.setVisible(true);
		eFenster.setLocationRelativeTo(null);
		
		//Erstellung des GridBagConstraints
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(1, 1, 1, 1);
		c.gridx = 0;
		c.gridy = 0;

		//Implementierung des bildSliders
		JSlider bildSlider = new JSlider();
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		bildSlider.setMinimum(2);
		bildSlider.setMaximum(16);
		bildSlider.setValue(2);
		bildSlider.setPaintTicks(true);
		eFenster.getContentPane().add(bildSlider, c);
		
		//Implementierung des größenSliders
		JSlider groeßeSlider = new JSlider();
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth = 1;
		eFenster.getContentPane().add(beschreibung, c);
		groeßeSlider.setMinimum(2);
		groeßeSlider.setMaximum(16);
		groeßeSlider.setValue(2);
		groeßeSlider.setPaintTicks(true);
		eFenster.getContentPane().add(groeßeSlider, c);
		
		//positionierung des Labels "beschreibung"
		c.gridx = 0;
		c.gridy = 1;
		eFenster.getContentPane().add(beschreibung, c);
		beschreibung.setVisible(true);
		
		//positionierung des Labels "groesse"
		c.gridx = 0;
		c.gridy = 3;
		eFenster.getContentPane().add(groesse, c);
		groesse.setVisible(true);
		
		//positionierung des "zurueck button"
		c.gridx = 1;
		c.gridy = 6;
		c.gridwidth = 2;
		eFenster.getContentPane().add(zurueck, c);
		zurueck.setVisible(true);
		
		c.gridx = 0;
		c.gridy = 0;
		eFenster.getContentPane().add(funktion, c);
		beschreibung.setVisible(true);

	//
	//ActionListener für zurückButton
	zurueck.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// Schliesse Applikation
			eFenster.dispose();
		}
	});
}
}