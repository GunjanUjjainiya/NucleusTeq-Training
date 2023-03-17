import java.util.Scanner;

public class Third {

        public static void main(String[] args) {
	        
        	Scanner sc = new Scanner(System.in);
            System.out.println("1 Dollar");
	        System.out.println("2 Euro");
	        System.out.println("Choose the currency in which you want to convert rupee in");

	        int choice = sc.nextInt();
	        System.out.println("Enter the amount");
	        double amount = sc.nextDouble();
           
	        switch (choice) {
	            case 1:
	            	 System.out.println("1 Ruppe = " + 0.0122 + " Dollar");
	                 System.out.println(amount+" Ruppe = " + (amount*0.0122) + "$");
	     	        break;

	               
	            case 2:
	            	  System.out.println("1 Ruppe = " + 0.012 + " Euro");
	                   System.out.println(amount+" Ruppe = " + (amount*0.012) + "€");
	      	        break;
	            
	            default:
	                System. out.println("Invalid choice");
	        }

	    
	  
	}

}
