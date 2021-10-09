
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/** Shows how to read from a file and how to write to a file in Java */
public class FileIOExample {

	/** Reads lines from the input file and prints them to the console */
	public static void readFromFile(String input) {

		try (FileReader f = new FileReader(input)) { // using try with resources
			BufferedReader br = new BufferedReader(f);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}	
			
		} catch (IOException e) {
			System.out.println(e);
				
		}
	

	}

	/** Reads lines from the input file and writes them to the output file */
	public static void readAndPrint(String input, String output) {
		try (FileReader f = new FileReader(input); PrintWriter writer = new PrintWriter(output)) {
			BufferedReader br = new BufferedReader(f);
			String line;
			while ((line = br.readLine()) != null) {
				writer.println(line);

			}
			writer.flush();
		} catch (IOException e) {
			System.out.println("IOException occured" + e);
		}


		// no need to close FileReader, BufferedReader or PrintWriter because
		// we used try with resources -> they will be closed automatically.
	}

	public static void main(String[] args) {
		// Read the name of the file from the command line argument 
		if (args.length >= 1) {
			readFromFile(args[0]); // you need to type java FileIOExample song.txt 
			//readAndPrint(args[0], "out.txt");
		}

	}

}
