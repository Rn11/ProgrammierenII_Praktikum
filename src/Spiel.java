import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

public class Spiel {
	static JFrame screen;
	static ArrayList<File> gemischt = new ArrayList<File>();
	static ArrayList<JButton> buttons = new ArrayList<JButton>();
	static int tmpID_a = 0;
	static int tmpID_b = 0;
	static int klick = 0;
	static String path = "";
	public static Icon defaultIcon;

	public static boolean checkCards(String path1, String path2) {

		if (path1 == path2) {
			System.out.println("Ein Päärchen, schön!");
			klick = 0;
		} else {
			klick = 0;
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
				button1.setIcon(bild1);

				button1.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button1.getPath(), path)) {
						tmpID_b = button1.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button1.getPath();
					tmpID_a = button1.getId();
					button1.setEnabled(true);
				}
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setIcon(bild2);
				button2.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button2.getPath(), path)) {
						tmpID_b = button2.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button2.getPath();
					tmpID_a = button2.getId();
					button2.setEnabled(true);
				}
			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3.setIcon(bild3);
				button3.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button3.getPath(), path)) {
						tmpID_b = button3.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button3.getPath();
					tmpID_a = button3.getId();
					button3.setEnabled(true);
				}
			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4.setIcon(bild4);
				button4.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button4.getPath(), path)) {
						tmpID_b = button4.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button4.getPath();
					tmpID_a = button4.getId();
					button4.setEnabled(true);
				}
			}
		});

		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button5.setIcon(bild5);
				button5.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button5.getPath(), path)) {
						tmpID_b = button5.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button5.getPath();
					tmpID_a = button5.getId();
					button5.setEnabled(true);
				}
			}
		});

		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button6.setIcon(bild6);
				button6.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button6.getPath(), path)) {
						tmpID_b = button6.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button6.getPath();
					tmpID_a = button6.getId();
					button6.setEnabled(true);
				}
			}
		});

		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button7.setIcon(bild7);
				button7.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button7.getPath(), path)) {
						tmpID_b = button7.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button7.getPath();
					tmpID_a = button7.getId();
					button7.setEnabled(true);
				}
			}
		});

		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button8.setIcon(bild8);
				button8.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button8.getPath(), path)) {
						tmpID_b = button8.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button8.getPath();
					tmpID_a = button8.getId();
					button8.setEnabled(true);
				}

			}
		});

		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button9.setIcon(bild9);
				button9.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button9.getPath(), path)) {
						tmpID_b = button9.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button9.getPath();
					tmpID_a = button9.getId();
					button9.setEnabled(true);
				}
			}
		});

		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button10.setIcon(bild10);
				button10.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button10.getPath(), path)) {
						tmpID_b = button10.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button10.getPath();
					tmpID_a = button10.getId();
					button10.setEnabled(true);
				}
			}
		});

		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button11.setIcon(bild11);
				button11.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button11.getPath(), path)) {
						tmpID_b = button11.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button11.getPath();
					tmpID_a = button11.getId();
					button11.setEnabled(true);
				}
			}

		});

		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button12.setIcon(bild12);
				button12.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button12.getPath(), path)) {
						tmpID_b = button12.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button12.getPath();
					tmpID_a = button12.getId();
					button12.setEnabled(true);
				}
			}
		});

		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button13.setIcon(bild13);
				button13.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button13.getPath(), path)) {
						tmpID_b = button13.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button13.getPath();
					tmpID_a = button13.getId();
					button13.setEnabled(true);
				}

			}
		});

		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button14.setIcon(bild14);
				button14.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button14.getPath(), path)) {
						tmpID_b = button14.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button14.getPath();
					tmpID_a = button14.getId();
					button14.setEnabled(true);
				}
			}
		});

		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button15.setIcon(bild15);
				button15.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button15.getPath(), path)) {
						tmpID_b = button15.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button15.getPath();
					tmpID_a = button15.getId();
					button15.setEnabled(true);
				}
			}
		});

		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button16.setIcon(bild16);
				button16.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button16.getPath(), path)) {
						tmpID_b = button16.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button16.getPath();
					tmpID_a = button16.getId();
					button16.setEnabled(true);
				}
			}
		});

		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button17.setIcon(bild17);
				button17.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button17.getPath(), path)) {
						tmpID_b = button17.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button17.getPath();
					tmpID_a = button17.getId();
					button17.setEnabled(true);
				}
			}
		});

		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button18.setIcon(bild18);
				button18.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button18.getPath(), path)) {
						tmpID_b = button18.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button18.getPath();
					tmpID_a = button18.getId();
					button18.setEnabled(true);
				}
			}
		});

		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button19.setIcon(bild19);
				button19.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button19.getPath(), path)) {
						tmpID_b = button19.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button19.getPath();
					tmpID_a = button19.getId();
					button19.setEnabled(true);
				}
			}
		});

		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button20.setIcon(bild20);
				button20.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button20.getPath(), path)) {
						tmpID_b = button20.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button20.getPath();
					tmpID_a = button20.getId();
					button20.setEnabled(true);
				}
			}
		});

		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button21.setIcon(bild21);
				button21.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button21.getPath(), path)) {
						tmpID_b = button21.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button21.getPath();
					tmpID_a = button21.getId();
					button21.setEnabled(true);
				}
			}
		});

		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button22.setIcon(bild22);
				button22.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button22.getPath(), path)) {
						tmpID_b = button22.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button22.getPath();
					tmpID_a = button22.getId();
					button22.setEnabled(true);
				}
			}
		});

		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button23.setIcon(bild23);
				button23.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button23.getPath(), path)) {
						tmpID_b = button23.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button23.getPath();
					tmpID_a = button23.getId();
					button23.setEnabled(true);
				}
			}
		});

		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button24.setIcon(bild24);
				button24.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button24.getPath(), path)) {
						tmpID_b = button24.getId();
						t.start();
					}
				} else if (klick == 1) {
					path = button24.getPath();
					tmpID_a = button24.getId();
					button24.setEnabled(true);
				}
			}
		});

	}
}
