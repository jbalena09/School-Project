
/* Programmer: Julius
 * Date: 10/08/18
 */


import java.util.Scanner;

public class assignment {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a character: ");
       try{
            char c = input.next(".").charAt(0);
            if (c >= 97 && c <= 122 || c >= 65 && c <= 90){
            	if(c >= 97 && c <= 122){
            		System.out.printf("%c is a lower-case letter\n",c);
            	}else{
            	    System.out.printf("%c is a upper-case letter\n",c);
            	}
            }else if (c >= '0' && c <= '9'){
                System.out.printf("%c is a digit\n",c);
            }else{
                System.out.printf("%c is a special symbol\n",c);
            }
       }catch (Exception e){
           System.out.println("Error!");
       }
    }
}
