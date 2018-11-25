/* Programmer: Julius
 * Date: 11/15/18
 */

import java.io.*;
	public class Table3x4Modified{
		public static void main(String[] args){
			int table[][] = new int[3][5];
			int i, j, sum = 0, num;
			String input = " ", ditoMuna = "";
			BufferedReader in = new BufferedReader(new
			InputStreamReader(System.in));
			// Initialize table to zero
			for(i = 0; i < 3; i++){
				for(j = 0; j < 5; j++){
					table[i][j] = 0;
				}
			}
			// Input values
			for(i = 0; i < 3; i++){
				for(j = 0; j < 5; j++) {
					System.out.print("Input table [" + i + "]["+ j + "] = ");
						try{
							input = in.readLine();
						}catch(IOException e){
							System.out.println("Error!");
						}
					num = Integer.parseInt(input);
					table[i][j] = num;
				}
			}
			// computing the sum
			for(i = 0; i < 3; i++){
				for(j = 0; j < 5; j++){
					sum = sum + table[i][j];
				}
			}
			// print table in matrix format
			for(i = 0; i < 3; i++){
				for(j = 0; j < 5; j++){
					System.out.print("\t" + table[i][j]);
				}
				System.out.println();
			}
			System.out.println("Sum = " + sum);

			for(i = 0; i < 3; i++){
				for(j = 0; j < 5; j++){
					if (table[i][j] > 9 && table[i][j] < 100){
						ditoMuna = ditoMuna + table[i][j] + " ";
					}
				}
			System.out.print(ditoMuna);
			}
		}
	}