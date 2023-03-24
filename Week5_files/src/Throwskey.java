	import java.io.*;
public class Throwskey {

	
	  public static void findFile() throws IOException {
	    // code that may produce IOException
	    File f=new File("test.txt");
	    FileInputStream stream=new FileInputStream(f);
	  }

	  public static void main(String[] args) {
	    try{
	      findFile();
	    } catch(IOException e){
	      System.out.println(e);
	    }
	  }
	}

