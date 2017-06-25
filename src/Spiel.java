import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

public class Spiel {
	private static JFrame screen;
	// ArrayList vom Typ file, beinhaltet die Pfade zu den Dateien zu den
	// Bildern
	// Wird benutzt, um Bilder zu vergleichen
	private static ArrayList<File> gemischt = new ArrayList<File>();
	// ArrayList vom Typ JButton, beinhaltet alle JButtons
	private static ArrayList<JButton> buttons = new ArrayList<JButton>();
	// ArrayList vom Typ ImageIcon, beinhaltet alle Bilder (zum Skalieren
	// mithilfe einer for-Schleife)
	private static ArrayList<ImageIcon> bilder = new ArrayList<ImageIcon>();
	// Zwischenspeicher für IDs
	private static int tmpID_a = 0;
	private static int tmpID_b = 0;
	private static String path = "";
	// Zaehlervariable fuer Klicks
	private static int klick = 0;
	private static int resized = 0;

	// Getter & Setter fuer klick
	public static int getKlick() {
		return klick;
	}

	public static void setKlick(int klick) {
		Spiel.klick = klick;
	}

	// Getter & Setter fuer die gemischten Pfade der Bilder
	public static ArrayList<File> getGemischt() {
		return gemischt;
	}

	public static void setGemischt(ArrayList<File> gemischt) {
		Spiel.gemischt = gemischt;
	}

	// Getter & Setter fuer path
	public static String getPath() {
		return path;
	}

	public static void setPath(String path) {
		Spiel.path = path;
	}

	// Getter & Setter fuer tmpIDs
	public static int getTmpID_a() {
		return tmpID_a;
	}

	public static void setTmpID_a(int tmpID_a) {
		Spiel.tmpID_a = tmpID_a;
	}

	public static int getTmpID_b() {
		return tmpID_b;
	}

	public static void setTmpID_b(int tmpID_b) {
		Spiel.tmpID_b = tmpID_b;
	}

	// Logik-Bereich

	// Pruefung, ob 2 Buttons das gleiche Bild haben
	public static boolean checkCards(String path1, String path2) {
		if (path1 == path2) {
			System.out.println("Ein Päärchen, schön!");
			klick = 0;
		} else {
			// Wenn 2 unterschiedliche Bilder
			klick = 0;
			// Wartezeit bis Buttons "umgedreht" werden
			t.start();
			return true;
		}
		return false;
	}

	static Timer t = new Timer(750, new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			System.out.println("Pech gehabt...");
			buttons.get(tmpID_a).setIcon(null);
			buttons.get(tmpID_b).setIcon(null);
			buttons.get(tmpID_a).setEnabled(true);
			t.stop();
		}
	});

	static void prepareGUI(int h, int b) {

		screen = new JFrame("Memory");
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// screengroesse 1024, 768
		screen.setSize(h, b);

		// 2x2 Raster erstellen
		screen.setLayout(new GridLayout(4, 4, 10, 10));

		// Mischen der Bilder
		try {

			gemischt = Mischen.mischen();

		} catch (IOException e1) {
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

		bilder.add(bild1);
		bilder.add(bild2);
		bilder.add(bild3);
		bilder.add(bild4);
		bilder.add(bild5);
		bilder.add(bild6);
		bilder.add(bild7);
		bilder.add(bild8);
		bilder.add(bild9);
		bilder.add(bild10);
		bilder.add(bild11);
		bilder.add(bild12);
		bilder.add(bild13);
		bilder.add(bild14);
		bilder.add(bild15);
		bilder.add(bild16);
		bilder.add(bild17);
		bilder.add(bild18);
		bilder.add(bild19);
		bilder.add(bild20);
		bilder.add(bild21);
		bilder.add(bild22);
		bilder.add(bild23);
		bilder.add(bild24);

		// buttons erstellen
		Button button1 = new Button(0, gemischt.get(0).toString());
		Button button2 = new Button(1, gemischt.get(1).toString());
		Button button3 = new Button(2, gemischt.get(2).toString());
		Button button4 = new Button(3, gemischt.get(3).toString());
		Button button5 = new Button(4, gemischt.get(4).toString());
		Button button6 = new Button(5, gemischt.get(5).toString());
		Button button7 = new Button(6, gemischt.get(6).toString());
		Button button8 = new Button(7, gemischt.get(7).toString());
		Button button9 = new Button(8, gemischt.get(8).toString());
		Button button10 = new Button(9, gemischt.get(9).toString());
		Button button11 = new Button(10, gemischt.get(10).toString());
		Button button12 = new Button(11, gemischt.get(11).toString());
		Button button13 = new Button(12, gemischt.get(12).toString());
		Button button14 = new Button(13, gemischt.get(13).toString());
		Button button15 = new Button(14, gemischt.get(14).toString());
		Button button16 = new Button(15, gemischt.get(15).toString());
		Button button17 = new Button(16, gemischt.get(16).toString());
		Button button18 = new Button(17, gemischt.get(17).toString());
		Button button19 = new Button(18, gemischt.get(18).toString());
		Button button20 = new Button(19, gemischt.get(19).toString());
		Button button21 = new Button(20, gemischt.get(20).toString());
		Button button22 = new Button(21, gemischt.get(21).toString());
		Button button23 = new Button(22, gemischt.get(22).toString());
		Button button24 = new Button(23, gemischt.get(23).toString());

		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		buttons.add(button5);
		buttons.add(button6);
		buttons.add(button7);
		buttons.add(button8);
		buttons.add(button9);
		buttons.add(button10);
		buttons.add(button11);
		buttons.add(button12);
		buttons.add(button13);
		buttons.add(button14);
		buttons.add(button15);
		buttons.add(button16);
		buttons.add(button17);
		buttons.add(button18);
		buttons.add(button19);
		buttons.add(button20);
		buttons.add(button21);
		buttons.add(button22);
		buttons.add(button23);
		buttons.add(button24);

		for (int i = 0; i < 24; i++) {

			screen.getContentPane().add(buttons.get(i));
		}

		screen.setVisible(true);

		// event listener
		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				button1.klick(bild1);
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.klick(bild2);
			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3.klick(bild3);
			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4.klick(bild4);
			}
		});

		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button5.klick(bild5);
			}
		});

		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button6.klick(bild6);
			}
		});

		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button7.klick(bild7);
			}
		});

		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button8.klick(bild8);
			}
		});

		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button9.klick(bild9);
			}
		});

		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button10.klick(bild10);
			}
		});

		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button11.klick(bild11);
			}
		});

		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button12.klick(bild12);
			}
		});

		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button13.klick(bild13);
			}
		});

		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button14.klick(bild14);
			}
		});

		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button15.klick(bild15);
			}
		});

		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button16.klick(bild16);
			}
		});

		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button17.klick(bild17);
			}
		});

		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button18.klick(bild18);
			}
		});

		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button19.klick(bild19);
			}
		});

		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button20.klick(bild20);
			}
		});

		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button21.klick(bild21);
			}
		});

		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button22.klick(bild22);
			}
		});

		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button23.klick(bild23);
			}
		});

		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button24.klick(bilder.get(23));
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
				for (int i = 0; i < gemischt.size(); i++) {
					ImageIcon tmpIcon = new ImageIcon(gemischt.get(i).toString());
					tmpIcon.getImage().getScaledInstance(button1.getHeight(), button1.getWidth(), Image.SCALE_FAST);

					if (buttons.get(i).getIcon() != null) {
						buttons.get(i).setIcon(tmpIcon);
					}
					bilder.set(i, tmpIcon);
				}
			}
		});
	}
}