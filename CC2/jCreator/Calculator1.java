
/* Programmer: Julius
 * Date: 09/27/18
 */


 import java.util.*;

public class Calculator1
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int x, y, sum, diff, pro;
			System.out.print("Enter first no: ");
			x = sc.nextInt();
			System.out.print("Enter second no: ");
			y = sc.nextInt();
			sum = x + y;
			diff = x - y;
			pro = x * y;
			float quo = (float) x / y;
			System.out.printf("The sum of %d and %d is = %d\n" +
				"The difference of %d and %d is = %d\n" +
				"The product of %d and %d is = %d\n" +
				"The qoutient of %d and %d is = %.2f\n",x,y,sum,x,y,diff,x,y,pro,x,y,quo);
		}
}