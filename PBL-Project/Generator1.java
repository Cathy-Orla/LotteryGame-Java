/* Author Catherine Lane x17118832, 11/12/2017.
*/

import java.util.Random;


	public class Generator {

		public static void main(String[] args) {

		    int[] lottery = new int[6]; //declaring the 1 day array of size 6.
		    int secret;					//declaring variables
		    String message;

			Scanner in = new Scanner(System.in);

		    for (int i = 0; i < 6; i++) {		//loop from index 0 so long as index is less than 6 = increment by 1 (fills 6 numbers).
				Random r = new Random();		//declaring the random class
				secret = r.nextInt(40);			//secret is the next random number, max number is 40.
				secret = secret +1;				//ensures secret is not 0

		        for (int lot = 0; lot < i; lot++) {		//nested loop
		            	if (lottery[lot] == secret) // if the array lottery number is the same as the generated secret....
		           		 {
		                	secret = r.nextInt(40);
							secret = secret +1;				// another number generated.
		                	lot = -1; 						// restart the loop from the beginning
		           		 }

		       		 }

		        lottery[i] = secret; //lottery number is the next secret number (fills until index 5).
		    }

			System.out.println("The lottery numbers are: ");
		    for (int i = 0; i < lottery.length; i++)    	//prints the 6 numbers (length)
		        System.out.println(lottery[i] + " ");

			public int getSecret(){
			return lottery[i];
			}

		}
}