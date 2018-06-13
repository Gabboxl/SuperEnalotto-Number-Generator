import java.util.Random;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			while(true) {
				String n = null;
				
			
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("How much numbers do you want? (enter a number or write 'exit' to close the program): ");
			 n = reader.nextLine(); // Scans the next token of the input as an int.
			 
			 
			 if(n == "exit") {
				 reader.close();
				 break;
			 }
			
			
			try {
			int icsd = 0;
			int asd = Integer.parseInt(n);;
			

			Random randomGenerator = new Random();
		    for (int idx = 1; idx <= asd; ++idx){
		      int randomInt = randomGenerator.nextInt(99);
		      System.out.println("Generated : " + randomInt);
		    }
			
			System.out.println("");
			} catch(Exception e) {
				
			}
			
		}
			
	}
			
}


