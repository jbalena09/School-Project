/* Programmer: Julius
 * Date: 10/18/18
 */

import java.io.*;

public class SumPositiveNegative{
	public static void main (String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		char ans;
		do{
			int numE = 0, ctr = 1, sumP = 0, sumN = 0, num = 0;
			try{
				System.out.print("Enter no of elements: ");
				numE = Integer.parseInt(input.readLine()); // the object readLine() gets the value of a String which gets converted by Integer.parseInt then stores it into variable numE.
			}catch(IOException e){
				System.out.println("Invalid Input. Numerical values only.");
			}
			while(ctr <= numE){
				System.out.println("Input " + ctr + " of " + numE + ":");
				num = Integer.parseInt(input.readLine());
				if (num >= 0){ // this line checks where the accepted value is greater than or equal to 0. if it is true then it will store the value in sumP then adds the values.
					sumP = sumP + num;
				}else{
					sumN = sumN + num;
				}
				ctr = ctr + 1;
			}
			System.out.println("Sum of positive numbers: " + sumP + "\nSum of negative numbers: " + sumN);
			System.out.print("Do you want to try again?(Y/N): ");
			ans = input.readLine().charAt(0);
		}while(ans == 'Y' || ans == 'y'); // this checks whether the user wants to continue the program. The user should answer y or Y to continue otherwise it will end.
	}
}