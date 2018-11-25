
/* Programmer: Julius
 * Date: 11/19/18
 */


import java.util.*;
public class CalculatorMethod
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int x, y, sum, diff, pro;
			float quo;
			System.out.print("Enter first no: ");
			x = sc.nextInt();
			System.out.print("Enter second no: ");
			y = sc.nextInt();
			System.out.printf("The sum of %d and %d is = %d\n" +
				"The difference of %d and %d is = %d\n" +
				"The product of %d and %d is = %d\n" +
				"The qoutient of %d and %d is = %.2f\n",x,y,computeSum(x,y),x,y,computeDiff(x,y),x,y,computePro(x,y),x,y,computeQou(x,y));
		}

	public static int computeSum(int a, int b){
		int sum = a + b;
		return sum;
	}
	public static int computeDiff(int a, int b){
		int diff = a - b;
		return diff;
	}
	public static int computePro(int a, int b){
		int pro = a * b;
		return pro;
	}
	public static float computeQou(int a, int b){
		float qou = (float) a/b;
		return qou;
	}
}