import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args)throws IOException  {
		File f=new File("C:\\Users\\SCARE\\OneDrive\\Pictures\\ReadFile.txt");
		try (Scanner sc = new Scanner(f)) {
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		
		}

}
