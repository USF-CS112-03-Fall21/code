
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/** Shows how to read from a file and how to write to a file in Java */
public class TryBlockDemo {

	/** Reads lines from the input file and prints them to the console. Does NOT use try with resources */
	public static void readFromFileRegularTry(String input) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(input);  
			BufferedReader br = new BufferedReader(fileReader);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}	
			
		} catch (IOException e) {
			System.out.println(e);
				
		}
		finally {
			if (fileReader != null) {
				// fileReader.close();
				/*try {
					fileReader.close();
				}
				catch (IOException exception) {
					System.out.println(exception);
				} */
			}
		}
	

	}

	public static void readFromFileTryWithResources(String input) {

		try(FileReader f = new FileReader(input))  { // using try with resources
			BufferedReader br = new BufferedReader(f);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}	
			
		} catch (IOException e) {
			System.out.println(e);
				
		}
	
		
	}

	public static void main(String[] args) {
		// Read the name of the file from the command line argument 
		if (args.length >= 1) {
			readFromFileRegularTry(args[0]); // you need to type java FileIOExample song.txt 
			//areadFromFileTryWithResources(args[0]);
		}

	}

}
