import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Einstellungen {

	public static void einstellungen() {

		// Erstellung des Fensters "Einstellung"
		JFrame eFenster = new JFrame("Einstellungen");
		eFenster.setLayout(new GridBagLayout());

		// Erstellung des GridBagConstraints
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(1, 1, 1, 1);
		c.gridx = 0;
		c.gridy = 0;

		// Implementierung des groessenSliders
		JSlider groe�eSlider = new JSlider();
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;

		groe�eSlider.setMinimum(300);
		groe�eSlider.setMaximum(1290);
		groe�eSlider.setValue(1024);
		groe�eSlider.setPaintTicks(true);
		eFenster.getContentPane().add(groe�eSlider, c);

		// Deklarierung von Button und Label
		JLabel txtBreite = new JLabel("Breite:");
		JLabel txtHoehe = new JLabel("H�he:");
		JLabel txtValueB = new JLabel(String.valueOf(groe�eSlider.getValue()));
		JLabel txtValueH = new JLabel(String.valueOf((groe�eSlider.getValue() / 4) * 3));
		JButton btnZurueck = new JButton("Zur�ck");

		// Einstellung der Gr��e
		eFenster.setSize(400, 400);
		eFenster.setVisible(true);
		eFenster.setLocationRelativeTo(null);

		// positionierung des Labels "Hoehe"
		c.gridx = 0;
		c.gridy = 0;
		eFenster.getContentPane().add(txtHoehe, c);

		// positionierung des Labels "Breite"
		c.gridx = 0;
		c.gridy = 1;
		eFenster.getContentPane().add(txtBreite, c);

		// positionierung des "zurueck button"
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 1;
		eFenster.getContentPane().add(btnZurueck, c);

		// positionierung des labes "txtValueH" (hoehe)
		c.gridx = 1;
		c.gridy = 0;
		eFenster.getContentPane().add(txtValueH, c);

		// positionierung des labes "txtValueB" (breite)
		c.gridx = 1;
		c.gridy = 1;
		eFenster.getContentPane().add(txtValueB, c);

		//
		// ActionListener f�r zur�ckButton
		btnZurueck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Setze Aufloesung fuer das Spiel-Fenster
				// setze breite
				Menue.setRes_b(groe�eSlider.getValue());
				// setze hoehe
				Menue.setRes_h(((groe�eSlider.getValue() / 4) * 3));
				// Schliesse Applikation
				eFenster.dispose();
			}
		});

		groe�eSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// passe labels an
				txtValueB.setText(String.valueOf(groe�eSlider.getValue()));
				txtValueH.setText(String.valueOf((groe�eSlider.getValue() / 4) * 3));
			}
		});

	}
}