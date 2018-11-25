/* Programmer: Julius
 * Date: 11/19/18
 */


import java.util.Scanner;
public class MagicSquare{
	public static void main(String[] args){
		int x = 0, rowSum = 0,
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an odd number (except \"1\"): ");
		x = input.nextInt();
		int magic[][] = new int [x][x];
		if(x % 2 == 0){
			System.out.println("You entered an even or number \"1\"");
			System.exit(0);
		}
		for(int i = 0; i < x; i++){
			for(int j = 0; j < x; j++){
				System.out.print("Enter the value of magic[" + i + "][" + j + "]: ");
				magic[i][j] = input.nextInt();
			}
		}
		System.out.println();
		for(int i = 0; i <x; i++){
			row
			for (int j = 0; j < x; j++){
				System.out.print("\t" + magic[i][j]);
			}
			System.out.println();
		}
	}
}