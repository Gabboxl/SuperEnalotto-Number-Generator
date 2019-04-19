import java.util.Random;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			while(true) {
				String n;
				
			
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("How many numbers do you want? (enter a number or write 'exit' to close the program): ");
			 n = reader.nextLine(); // Scans the next token of the input as an int.
			 
			 
			 if(n.equals("exit")) {
			 	System.out.println("\n Thx for using SuperEnalotto Number Generator - ");
				 reader.close();
				 System.exit(0);
			}
			
			try {
			int asd = Integer.parseInt(n);

			Random randomGenerator = new Random();
		    for (int idx = 1; idx <= asd; ++idx){
		      int randomInt = randomGenerator.nextInt(90);
		      System.out.println("Generated --> " + randomInt);
		    }
			
			System.out.println("\n");
			} catch(java.lang.NumberFormatException e) {
				System.out.println("\n Insert a number thx \n");
			}
			
		}
			
	}
			
}


