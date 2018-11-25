
/* Programmer: Julius
 * Date: 09/27/18
 */


 import java.util.*;

public class Activity
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int x, y;
			System.out.print("Enter first no: ");
			x = sc.nextInt();
			System.out.print("Enter second no: ");
			y = sc.nextInt();
			int sum = x + y;
			int diff = x - y;
			int pro = x * y;
			float qou = (float) x / y;
			System.out.println("The sum of " + x + " and " + y +" is = " + sum);
			System.out.println("The difference of " + x + " and " + y +" is = " + diff);
			System.out.println("The product of " + x + " and " + y +" is = " + pro);
			System.out.printf("The qoutient of %d and %d is %.2f", x, y, qou);
		}
}