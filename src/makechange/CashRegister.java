package makechange;


import java.util.Scanner;

public class CashRegister {

		
		public static void main(String[] args) {

			int twentyCount = 0;
			int tenCount = 0;
			int fiveCount = 0; 
			int oneCount = 0;
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;
			
				Scanner scan = new Scanner(System.in);
				System.out.print("Please enter the price? ");
				double price = scan.nextDouble();

				System.out.print("How much do you have? ");
				double tender = scan.nextDouble();
				
				double fullDiff = tender - price;
				double changeCalc = fullDiff;
				
				if (fullDiff < 0) {
				System.out.println("This item appears to be beyond your budget.");
				}
				else if (fullDiff == 0)  {
					System.out.println("Thank for providing the exact amount!");
				}
				
				else {
				// Calculate the bills
					System.out.println();
					System.out.println("The change due is:");

				if (changeCalc - 20 > 0 ){
					twentyCount +=  1;
	                changeCalc -= 20; 	
				}	
				
				if (changeCalc - 10 > 0 ){
					tenCount +=  1;
					changeCalc -= 10; 	
				}	
				
				if (changeCalc - 5 > 0 ){
					fiveCount +=  1;
					changeCalc -= 5; 	
				}
				
				while (changeCalc >= 1 ){
					changeCalc -= 1; 	
					oneCount +=  1;
				}
				// Calculate the coinage
				
				while (changeCalc - .25  >= 0 ){
					quarters +=  1;
	                changeCalc -= .25; 	
				}	
				while (changeCalc - .10 >= 0 ){
					dimes +=  1;
					changeCalc -= .10; 	
				}	
				if (changeCalc - .05 >= 0 ){
					nickels +=  1;
					changeCalc -= .05; 	
				}
				while (changeCalc - .009 >= 0.00 ){
				
					pennies += 1; 	
					changeCalc -=  .01;
			
				}

			}
			
				if (twentyCount > 1) {	
					System.out.println(twentyCount + "\ttwenty dollar bill");
				} else if (twentyCount ==1) {
					System.out.println(twentyCount + "\ttwenty dollar bill");
				}
				if (tenCount >= 1){
					System.out.println(tenCount + "\tten dollar bill ");}

				if (fiveCount >=1) {
					System.out.println(fiveCount + "\tfive dollar bill ");
				}
				if (oneCount == 1) {
					System.out.println(oneCount + "\tone dollar bill ");
				}
					else if (oneCount >1) {
					System.out.println(oneCount + "\tone dollar bills ");

					}
					
				if (quarters > 1) {	
					System.out.println(quarters + "\tquarters");
				} else if (quarters ==1) {
					System.out.println(quarters + "\tquarter");
				}
				if (dimes == 1){
					System.out.println(dimes + "\tdime ");}
				else if (dimes > 1) {
					System.out.println(dimes + "\tdimes ");}

				if (nickels >=1) {
					System.out.println(nickels + "\tnickle ");
				}
				if (pennies == 1) {
					System.out.println(pennies + "\tpenny ");
							}
					else if (pennies >1) {
					System.out.println(pennies + "\tpennies ");

					}
			
				scan.close();
		
		}
}

