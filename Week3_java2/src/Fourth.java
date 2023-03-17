import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x= Math.max(a, b);
        int y=Math.max(x, c);
         System.out.println(y);
         }

}
