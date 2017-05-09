import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MemoryMain {
	static JFrame screen;

	public static void main(String[] args) {
		prepareGUI();
	}

	static void prepareGUI() {
		screen = new JFrame("Memory");
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// screengroesse 600x600
		screen.setSize(600, 600);
		screen.setVisible(true);

		// 2x2 Raster erstellen
		screen.setLayout(new GridLayout(2, 2));

		// buttons erstellen
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");

		screen.getContentPane().add(button1);
		screen.getContentPane().add(button2);
		screen.getContentPane().add(button3);
		screen.getContentPane().add(button4);

		// event listener
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// aendere hintergrundfarbe
				button1.setBackground(Color.red);
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
}
