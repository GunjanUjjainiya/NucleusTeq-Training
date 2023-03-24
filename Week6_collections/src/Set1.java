import java.util.HashSet;

public class Set1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3,3,3,3};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println(hs);

	}

}
