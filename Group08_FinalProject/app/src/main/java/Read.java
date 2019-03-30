import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reads and extracts collision data from collisions.csv and stores each collision as an ADT
 */
public class Read {

	public static Collision[] read() throws IOException {
		
		Collision[] collisions = new Collision[205579]; //Array of collisions ADT
		
		BufferedReader inFile = new BufferedReader(new FileReader("collisions.csv"));

		String read = null;
		
		int count = 0;
		
		read =  inFile.readLine();
		while ((read = inFile.readLine()) != null) {
			String[] splitRead = read.split(",");
			collisions[count] = new Collision(splitRead);
			count += 1;
		}
		
		return collisions;
	}
}
