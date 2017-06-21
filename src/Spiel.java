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

	static void prepareGUI() {

		screen = new JFrame("Memory");
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// screengroesse 600x600
		screen.setSize(1024, 768);

		// 2x2 Raster erstellen
		screen.setLayout(new GridLayout(4, 4, 10, 10));

		// buttons erstellen
		Button button1 = new Button(0);
		Button button2 = new Button(1);
		Button button3 = new Button(2);
		Button button4 = new Button(3);
		Button button5 = new Button(4);
		Button button6 = new Button(5);
		Button button7 = new Button(6);
		Button button8 = new Button(7);
		Button button9 = new Button(8);
		Button button10 = new Button(9);
		Button button11 = new Button(10);
		Button button12 = new Button(11);
		Button button13 = new Button(12);
		Button button14 = new Button(13);
		Button button15 = new Button(14);
		Button button16 = new Button(15);
		Button button17 = new Button(16);
		Button button18 = new Button(17);
		Button button19 = new Button(18);
		Button button20 = new Button(19);
		Button button21 = new Button(20);
		Button button22 = new Button(21);
		Button button23 = new Button(22);
		Button button24 = new Button(23);

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
				klick++;
				if (klick == 2) {
					if (checkCards(button1.path = gemischt.get(0).toString(), path)) {
						tmpID_b = button1.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button1.path = gemischt.get(0).toString();
					tmpID_a = button1.id;
					button1.setEnabled(false);
				}
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setIcon(bild2);
				button2.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button2.path = gemischt.get(1).toString(), path)) {
						tmpID_b = button2.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button2.path = gemischt.get(1).toString();
					tmpID_a = button2.id;
					button2.setEnabled(false);
				}
			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3.setIcon(bild3);
				button3.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button3.path = gemischt.get(2).toString(), path)) {
						tmpID_b = button3.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button3.path = gemischt.get(2).toString();
					tmpID_a = button3.id;
					button3.setEnabled(false);
				}
			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4.setIcon(bild4);
				button4.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button4.path = gemischt.get(3).toString(), path)) {
						tmpID_b = button4.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button4.path = gemischt.get(3).toString();
					tmpID_a = button4.id;
					button4.setEnabled(false);
				}
			}
		});

		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button5.setIcon(bild5);
				button5.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button5.path = gemischt.get(4).toString(), path)) {
						tmpID_b = button5.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button5.path = gemischt.get(4).toString();
					tmpID_a = button5.id;
					button5.setEnabled(false);
				}
			}
		});

		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button6.setIcon(bild6);
				button6.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button6.path = gemischt.get(5).toString(), path)) {
						tmpID_b = button6.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button6.path = gemischt.get(5).toString();
					tmpID_a = button6.id;
					button6.setEnabled(false);
				}
			}
		});

		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button7.setIcon(bild7);
				button7.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button7.path = gemischt.get(6).toString(), path)) {
						tmpID_b = button7.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button7.path = gemischt.get(6).toString();
					tmpID_a = button7.id;
					button7.setEnabled(false);
				}
			}
		});

		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button8.setIcon(bild8);
				button8.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button8.path = gemischt.get(7).toString(), path)) {
						tmpID_b = button8.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button8.path = gemischt.get(7).toString();
					tmpID_a = button8.id;
					button8.setEnabled(false);
				}

			}
		});

		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button9.setIcon(bild9);
				button9.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button9.path = gemischt.get(8).toString(), path)) {
						tmpID_b = button9.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button9.path = gemischt.get(8).toString();
					tmpID_a = button9.id;
					button9.setEnabled(false);
				}
			}
		});

		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button10.setIcon(bild10);
				button10.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button10.path = gemischt.get(9).toString(), path)) {
						tmpID_b = button10.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button10.path = gemischt.get(9).toString();
					tmpID_a = button10.id;
					button10.setEnabled(false);
				}
			}
		});

		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button11.setIcon(bild11);
				button11.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button11.path = gemischt.get(10).toString(), path)) {
						tmpID_b = button11.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button11.path = gemischt.get(10).toString();
					tmpID_a = button11.id;
					button11.setEnabled(false);
				}
			}

		});

		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button12.setIcon(bild12);
				button12.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button12.path = gemischt.get(11).toString(), path)) {
						tmpID_b = button12.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button12.path = gemischt.get(11).toString();
					tmpID_a = button12.id;
					button12.setEnabled(false);
				}
			}
		});

		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button13.setIcon(bild13);
				button13.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button13.path = gemischt.get(12).toString(), path)) {
						tmpID_b = button13.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button13.path = gemischt.get(12).toString();
					tmpID_a = button13.id;
					button13.setEnabled(false);
				}

			}
		});

		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button14.setIcon(bild14);
				button14.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button14.path = gemischt.get(13).toString(), path)) {
						tmpID_b = button14.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button14.path = gemischt.get(13).toString();
					tmpID_a = button14.id;
					button14.setEnabled(false);
				}
			}
		});

		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button15.setIcon(bild15);
				button15.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button15.path = gemischt.get(14).toString(), path)) {
						tmpID_b = button15.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button15.path = gemischt.get(14).toString();
					tmpID_a = button15.id;
					button15.setEnabled(false);
				}
			}
		});

		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button16.setIcon(bild16);
				button16.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button16.path = gemischt.get(15).toString(), path)) {
						tmpID_b = button16.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button16.path = gemischt.get(15).toString();
					tmpID_a = button16.id;
					button16.setEnabled(false);
				}
			}
		});

		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button17.setIcon(bild17);
				button17.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button17.path = gemischt.get(16).toString(), path)) {
						tmpID_b = button17.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button17.path = gemischt.get(16).toString();
					tmpID_a = button17.id;
					button17.setEnabled(false);
				}
			}
		});

		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button18.setIcon(bild18);
				button18.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button18.path = gemischt.get(17).toString(), path)) {
						tmpID_b = button18.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button18.path = gemischt.get(17).toString();
					tmpID_a = button18.id;
					button18.setEnabled(false);
				}
			}
		});

		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button19.setIcon(bild19);
				button19.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button19.path = gemischt.get(18).toString(), path)) {
						tmpID_b = button19.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button19.path = gemischt.get(18).toString();
					tmpID_a = button19.id;
					button19.setEnabled(false);
				}
			}
		});

		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button20.setIcon(bild20);
				button20.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button20.path = gemischt.get(19).toString(), path)) {
						tmpID_b = button20.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button20.path = gemischt.get(19).toString();
					tmpID_a = button20.id;
					button20.setEnabled(false);
				}
			}
		});

		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button21.setIcon(bild21);
				button21.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button21.path = gemischt.get(20).toString(), path)) {
						tmpID_b = button21.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button21.path = gemischt.get(20).toString();
					tmpID_a = button21.id;
					button21.setEnabled(false);
				}
			}
		});

		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button22.setIcon(bild22);
				button22.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button22.path = gemischt.get(21).toString(), path)) {
						tmpID_b = button22.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button22.path = gemischt.get(21).toString();
					tmpID_a = button22.id;
					button22.setEnabled(false);
				}
			}
		});

		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button23.setIcon(bild23);
				button23.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button23.path = gemischt.get(22).toString(), path)) {
						tmpID_b = button23.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button23.path = gemischt.get(22).toString();
					tmpID_a = button23.id;
					button23.setEnabled(false);
				}
			}
		});

		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button24.setIcon(bild24);
				button24.setText("");
				klick++;
				if (klick == 2) {
					if (checkCards(button24.path = gemischt.get(23).toString(), path)) {
						tmpID_b = button24.id;
						t.start();
					}
				} else if (klick == 1) {
					path = button24.path = gemischt.get(23).toString();
					tmpID_a = button24.id;
					button24.setEnabled(false);
				}
			}
		});

	}
}
