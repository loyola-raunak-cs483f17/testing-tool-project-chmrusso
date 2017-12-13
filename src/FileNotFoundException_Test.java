import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundException_Test {
	public static void main(String [] args) throws FileNotFoundException {
		File file = new File("File.txt"); 
		BufferedReader reader = new BufferedReader(new FileReader(file)); 
	}
}
