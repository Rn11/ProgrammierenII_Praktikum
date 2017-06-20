import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

public class Spiel {
	static JFrame screen;

	static void prepareGUI() {
		screen = new JFrame("Memory");
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// screengroesse 600x600
		screen.setSize(1024, 768);

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
		JButton button17 = new JButton("17");
		JButton button18 = new JButton("18");
		JButton button19 = new JButton("19");
		JButton button20 = new JButton("20");
		JButton button21 = new JButton("21");
		JButton button22 = new JButton("22");
		JButton button23 = new JButton("23");
		JButton button24 = new JButton("24");

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
		screen.getContentPane().add(button17);
		screen.getContentPane().add(button18);
		screen.getContentPane().add(button19);
		screen.getContentPane().add(button20);
		screen.getContentPane().add(button21);
		screen.getContentPane().add(button22);
		screen.getContentPane().add(button23);
		screen.getContentPane().add(button24);

		screen.setVisible(true);

		ArrayList<File> gemischt = new ArrayList<File>();
		try {

			gemischt = Mischen.mischen();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Icons werden nun seperat angelegt, damit bei den action listenern die
		// icons per Referenz manipuliert werden koennen
		ImageIcon bild1 = new ImageIcon(gemischt.get(0).toString());
		ImageIcon bild2 = new ImageIcon(gemischt.get(1).toString());
		ImageIcon bild3 = new ImageIcon(gemischt.get(2).toString());
		ImageIcon bild4 = new ImageIcon(gemischt.get(3).toString());
		ImageIcon bild5 = new ImageIcon(gemischt.get(4).toString());
		ImageIcon bild6 = new ImageIcon(gemischt.get(5).toString());
		ImageIcon bild7 = new ImageIcon(gemischt.get(6).toString());
		ImageIcon bild8 = new ImageIcon(gemischt.get(7).toString());
		ImageIcon bild9 = new ImageIcon(gemischt.get(8).toString());
		ImageIcon bild10 = new ImageIcon(gemischt.get(9).toString());
		ImageIcon bild11 = new ImageIcon(gemischt.get(10).toString());
		ImageIcon bild12 = new ImageIcon(gemischt.get(11).toString());
		ImageIcon bild13 = new ImageIcon(gemischt.get(12).toString());
		ImageIcon bild14 = new ImageIcon(gemischt.get(13).toString());
		ImageIcon bild15 = new ImageIcon(gemischt.get(14).toString());
		ImageIcon bild16 = new ImageIcon(gemischt.get(15).toString());
		ImageIcon bild17 = new ImageIcon(gemischt.get(16).toString());
		ImageIcon bild18 = new ImageIcon(gemischt.get(17).toString());
		ImageIcon bild19 = new ImageIcon(gemischt.get(18).toString());
		ImageIcon bild20 = new ImageIcon(gemischt.get(19).toString());
		ImageIcon bild21 = new ImageIcon(gemischt.get(20).toString());
		ImageIcon bild22 = new ImageIcon(gemischt.get(21).toString());
		ImageIcon bild23 = new ImageIcon(gemischt.get(22).toString());
		ImageIcon bild24 = new ImageIcon(gemischt.get(23).toString());

		// event listener
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setIcon(bild1);
				button1.setText("");
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setIcon(bild2);
				button2.setText("");

			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3.setIcon(bild3);
				button3.setText("");
			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4.setIcon(bild4);
				button4.setText("");
			}
		});

		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button5.setIcon(bild5);
				button5.setText("");
			}
		});

		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button6.setIcon(bild6);
				button6.setText("");
			}
		});

		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button7.setIcon(bild7);
				button7.setText("");
			}
		});

		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button8.setIcon(bild8);
				button8.setText("");
			}
		});

		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button9.setIcon(bild9);
				button9.setText("");
			}
		});

		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button10.setIcon(bild10);
				button10.setText("");
			}
		});

		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button11.setIcon(bild11);
				button11.setText("");
			}
		});

		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button12.setIcon(bild12);
				button12.setText("");
			}
		});

		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button13.setIcon(bild13);
				button13.setText("");

			}
		});

		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button14.setIcon(bild14);
				button14.setText("");
			}
		});

		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button15.setIcon(bild15);
				button15.setText("");
			}
		});

		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button16.setIcon(bild16);
				button5.setText("");
			}
		});

		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button17.setIcon(bild17);
				button17.setText("");
			}
		});

		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button18.setIcon(bild18);
				button18.setText("");
			}
		});

		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button19.setIcon(bild19);
				button19.setText("");
			}
		});

		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button20.setIcon(bild20);
				button20.setText("");
			}
		});

		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button21.setIcon(bild21);
				button21.setText("");
			}
		});

		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button22.setIcon(bild22);
				button22.setText("");
			}
		});

		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button23.setIcon(bild23);
				button23.setText("");
			}
		});

		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button24.setIcon(bild24);
				button24.setText("");
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
			/*	auto.setImage(
						auto.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				ball.setImage(
						ball.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				weizen.setImage(
						weizen.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				fler.setImage(
						fler.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				kaffee.setImage(
						kaffee.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				kaffee.setImage(
						kaffee.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				marlene.setImage(marlene.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(),
						Image.SCALE_FAST));
				zebras.setImage(
						zebras.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				pils.setImage(
						pils.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				maske.setImage(
						maske.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				stop.setImage(
						stop.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				katze.setImage(
						katze.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));
				kreuz.setImage(
						kreuz.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST));*/
			}
		});
	}
	/*
	 * Known bugs: neuen Bilder werden nicht angezeigt
	 */
}