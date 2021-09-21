import java.util.Scanner;
import java.io.*;

public class SongReader {
	
	/** Read the song lyrics from the text file
	* using Scanner
	* @param filename Name of the file
	*/
	public void readLyricsFromFile (String filename) {
		File file = new File(filename);
		try {
			Scanner sc = new Scanner(file);
			String line;

			while(sc.hasNextLine()) {
			   line = sc.nextLine();
			   // System.out.println(line);
			   String[] words = line.split(" ");
			   for (int i = 0; i < words.length; i++) {
			   		System.out.println(words[i]);
			   }
		   } 

		}
		catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		SongReader reader = new SongReader();
		reader.readLyricsFromFile("song.txt");
	}

}