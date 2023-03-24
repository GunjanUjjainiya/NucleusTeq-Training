import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFiles {

	public static void main(String[] args) {
		try {
			PrintWriter pw =new PrintWriter("C:\\Users\\SCARE\\OneDrive\\Pictures\\WriteFile.txt");
			pw.write("A file is a collection of related records placed in a particular area on the disk ");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
