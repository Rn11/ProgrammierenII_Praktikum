import java.awt.*;
import javax.swing.*;

public class MemoryMain {

	public static void main(String[] args) {
		JFrame fenster = new JFrame("Memory");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// fenstergroesse 600x600
		fenster.setSize(600, 600);
		fenster.setVisible(true);

		// 2x2 Raster erstellen
		fenster.setLayout(new GridLayout(2, 2));
		fenster.getContentPane().add(new JButton("1"));
		fenster.getContentPane().add(new JButton("2"));
		fenster.getContentPane().add(new JButton("3"));
		fenster.getContentPane().add(new JButton("4"));
	}
}
