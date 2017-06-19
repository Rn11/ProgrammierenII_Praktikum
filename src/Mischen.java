import java.io.File;
import java.util.*;

public class Mischen {
	public static ArrayList<File> mischen() {
		Random rn = new Random();
		ArrayList<File> unsortiert = new ArrayList<File>();
		ArrayList<File> bilder = new ArrayList<File>();
		
		while (0 < unsortiert.size()) {
			int random = rn.nextInt(unsortiert.size()); 
			bilder.add(unsortiert.get(random));
			unsortiert.remove(random);
			unsortiert.trimToSize();
		}
		return bilder;
	}
}
/*
 * import java.io.File; import java.util.ArrayList;
 * 
 * public class Mischen { public static ArrayList<File> getFiles(File dir) {
 * File[] bilder = dir.listFiles(); ArrayList<File> matches = new
 * ArrayList<File>(); if (bilder != null) { for (int i = 0; i < bilder.length;
 * i++) { if (bilder[i].isDirectory()) {
 * System.out.println(bilder[i].getAbsolutePath());
 * matches.addAll(getFiles(bilder[i])); } else { matches.add(bilder[i]); } } }
 * return matches; } } arraylist(bild), wird 2x durchlaufen. beim 1. mal
 * verzeichnisse hinzufügen, beim 2. mal position zufällig setzen. danach
 * meinBild.sort(); ,
 */
