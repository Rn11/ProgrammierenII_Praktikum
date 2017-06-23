import java.io.File;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Client {

	private Client() {
	}

	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			MemoryInterface stub = (MemoryInterface) registry.lookup("Bilder");
			ArrayList<File> response = Spiel.getGemischt();
			System.out.println("response: " + response);
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}