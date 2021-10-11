
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class ThrowsClauseDemo {

	/** Reads lines from the input file and prints them to the console. Does not catch IOException. */
	public static void readFromFileNotHandlingException(String input) throws IOException{
		FileReader fileReader = new FileReader(input);  
		BufferedReader br = new BufferedReader(fileReader);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}	
			
		fileReader.close();

	}

	

	public static void main(String[] args) {
		try {
			readFromFileNotHandlingException("file.txt"); 
		}
		catch (IOException e) {
			System.out.println(e);
		}
	
	}

}
