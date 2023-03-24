import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Queue1 {
	static Queue<Integer> qu;
	static void reverseQueueFirstKElements(int k)
	{
		if (qu.isEmpty() == true || k > qu.size())
			return;
		if (k <= 0)
			return;
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < k; i++) {
		            st.push(qu.peek());
		            qu.remove();
		        }
		 
		      
		        while (!st.empty()) {
		            qu.add(st.peek());
		            st.pop();
		        }
		   for (int i = 0; i < qu.size() - k; i++) {
		            qu.add(qu.peek());
		            qu.remove();
		        }
		    }
		 
		    static void Print()
		    {
		        while (!qu.isEmpty()) {
		            System.out.print(qu.peek() + " ");
		            qu.remove();
		        }
		    }
		 
		    public static void main(String args[])
		    {
		        qu = new LinkedList<Integer>();
		        qu.add(1);
		        qu.add(2);
		        qu.add(3);
		        qu.add(4);
		        qu.add(5);
		        int k = 4;
		        reverseQueueFirstKElements(k);
		        Print();
		    }
		
	}


