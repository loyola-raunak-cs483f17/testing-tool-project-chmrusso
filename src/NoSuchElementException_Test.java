import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NoSuchElementException_Test {
	public static void main(String [] args) throws FileNotFoundException {
		
		
		Scanner reader = new Scanner ("Outfile.txt"); 
		
		String phrase = reader.nextLine();
		String nextPhrase = reader.nextLine(); 
		
	}
}
