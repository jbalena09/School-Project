
/* Programmer: Julius
 * Date: 09/27/18
 */


 import java.io.*;

public class Calculator2
{
	public static void main(String[] args) throws Exception
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // the word BufferedReader calls the object BufferedReader from the java library which the user named as "input".
			int x, y, sum, diff, pro;
			System.out.print("Enter first no: ");
			x = Integer.parseInt(input.readLine());
			System.out.print("Enter second no: ");
			y = Integer.parseInt(input.readLine());
			sum = x + y; // this line adds the value of x and y then stores it at variable sum.
			diff = x - y;
			pro = x * y;
			float quo = (float) x / y; // line divides the value of x and y then typecast(convert) it to float then stores it to quo.
			System.out.printf("The sum of %d and %d is = %d\n" +
				"The difference of %d and %d is = %d\n" +
				"The product of %d and %d is = %d\n" +
				"nThe qoutient of %d and %d is = %.2f\n",x,y,sum,x,y,diff,x,y,pro,x,y,quo);

		}
}