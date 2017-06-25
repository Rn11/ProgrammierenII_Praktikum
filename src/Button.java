import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
// Klasse fuer Buttons
// Button erbt von JButton
public class Button extends JButton {
	// path soll ein Attribut sein, welches den Pfad des gesetzten Bildes
	// speichern soll. Dies ist noetig um die Buttons zu vergleichen
	private String path = "";
	// Buttons sollen eine ID bekommen
	private int id;

	// Getter & Setter
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Konstruktoren
	public Button(int id) {
		this.id = id;
	}

	public Button(int id, String path) {
		this.id = id;
		this.path = path;
	}

	public void klick(ImageIcon ic) {
		this.setIcon(ic);
		this.setText("");
		Spiel.setKlick(Spiel.getKlick() + 1);
		if (Spiel.getKlick() == 2) {
			if (Spiel.checkCards(this.getPath(), Spiel.getPath())) {
				Spiel.setTmpID_b(this.getId());
				Spiel.t.start();
			}
		} else if (Spiel.getKlick() == 1) {
			Spiel.setPath(this.getPath());
			Spiel.setTmpID_a(this.getId());
			this.setEnabled(true);
		}
	}
}
