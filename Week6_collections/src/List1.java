import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class List1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		HashSet<Integer>hs=new HashSet<Integer>();
            a1.add(1);
            a1.add(2);
            a1.add(1);
            a1.add(2);
            a1.add(1);
            a1.add(2);
            a1.add(2);
            a1.add(1);
            Iterator<Integer>it=a1.iterator();
            while(it.hasNext())
            {
            	hs.add(it.next());
          	
            }
            System.out.println(hs);
           
	        }
	}


