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
			System.out.println(sc.nextLine());
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