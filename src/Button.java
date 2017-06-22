import javax.swing.JButton;

@SuppressWarnings("serial")
public class Button extends JButton {
	private String path = "";
	private int id;

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

	public Button(int id) {
		this.id = id;

	}

	public Button(int id, String path) {
		this.id = id;
		this.path = path;
	}
}
