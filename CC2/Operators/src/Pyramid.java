
public class Pyramid {
   public static void main(String[] args)
   {
       int space = 5,hash = 0,row = 5;
       for(int i = 0;i <=5; i++){
           for(int j = row - i;j <= 0;j-- ){
               System.out.print(" ");
           }
           for(int k = 0; k <= hash + i; k++ ){
               System.out.print("#");
           }
           System.out.println("");
       }
   }
}
