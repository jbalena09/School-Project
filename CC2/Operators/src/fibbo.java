
public class fibbo {
  public static void main(String[] args)
  {
      int num = 5;
      int x = 0;
      int y = 1;
      int z;
      
      for(int i = num; i >= 0; i--)
      {
          z = x + y;
            System.out.println(x);
          x = y;
          y = z;
      }

  }  
}
