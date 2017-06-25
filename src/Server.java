import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.io.File;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server implements MemoryInterface {
	// Server soll eine ArrayList haben, um Bilder auszutauschen
	private ArrayList<File> bilder = new ArrayList<File>();

	// Getter & Setter der ArrayList
	public ArrayList<File> getBilder() {
		return bilder;
	}

	public void setBilder(ArrayList<File> bilder) {
		this.bilder = bilder;
	}

	public Server() {
	}

	public static void main(String args[]) {

		try {
			Server obj = new Server();
			MemoryInterface stub = (MemoryInterface) UnicastRemoteObject.exportObject(obj, 0);
			// Registry wird angelegt
			Registry registry = LocateRegistry.getRegistry();
			// Stub wird in der registry gebindet
			registry.bind("Bilder", stub);
			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}