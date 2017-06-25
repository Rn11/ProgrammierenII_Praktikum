import java.io.File;
import java.rmi.Remote;
import java.util.ArrayList;

public interface MemoryInterface extends Remote {
	public void setBilder(ArrayList<File> bilder);

	public ArrayList<File> getBilder();
}