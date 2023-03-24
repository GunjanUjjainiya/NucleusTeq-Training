import java.util.Scanner;
public class Throwkey {
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Please enter your roll number");
	        int roll = sc.nextInt();

	        if (roll <=0) {
	            throw new ArithmeticException("Roll number can't be negative Or zero");
	        } else {
	            System.out.println("Valid roll number");
	        }
	    }
	}


