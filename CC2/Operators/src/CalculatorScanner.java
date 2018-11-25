
import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();
        int sum = x + y , diff = x - y;
        float qou = (float) x / y;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + x * y);
        System.out.printf("Quotient: %.2f\n", qou);
        
    }
}
