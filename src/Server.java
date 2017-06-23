import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.io.File;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server implements MemoryInterface {
	ArrayList<File> bilder = new ArrayList<File>();

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

			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Bilder", stub);

			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}