import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mischen {
	public static ArrayList<File> mischen() throws IOException {
		// Random integer wird benoetigt
		Random rn = new Random();
		// ArrayList vom Typ File welches die eingelesenen Pfade der Bilder
		// beinhaltet
		ArrayList<File> eingelesen = new ArrayList<File>();
		// ArrayList vom Typ File welches die gemischten Pfade der Bilder
		// beinhaltet
		ArrayList<File> gemischt = new ArrayList<File>();
		int position = 0;

		// Bilder werden eingelesen
		try (Stream<Path> filePathStream = Files.walk(Paths.get("src/bilder/"))) {
			filePathStream.forEach(filePath -> {
				if (Files.isRegularFile(filePath)) {
					eingelesen.add(filePath.toFile());
				}
			});
		}

		// Bilder werden aus der ArrayList 'eingelesen' hinten an 'eingelesen'
		// angefuegt
		position = eingelesen.size();
		for (int i = 0; i < position; i++) {
			eingelesen.add(eingelesen.get(i));
		}

		// Mische Eintraege solange "eingelesen" noch Elemente hat
		while (0 < eingelesen.size()) {
			// Generiere eine Zufallszahl zwischen 0 und der Groesse der
			// "eingelesen" ArrayList
			int random = rn.nextInt(eingelesen.size());
			// Ein Eintrag aus "eingelesen" wird nun mit der Zufallszahl
			// ausgelesen und zu gemischt hinzugefuegt
			gemischt.add(eingelesen.get(random));
			// Anschliessend wird dieser Eintrag aus "eingelesen" entfernt
			eingelesen.remove(random);
			// "eingelesen" wird gekuerzt
			eingelesen.trimToSize();
		}

		return gemischt;
	}
}
