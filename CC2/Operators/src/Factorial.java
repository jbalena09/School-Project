public class Factorial {
    public static void main(String[] args)
    {
        System.out.println(fib(7));
    }
    public static int fib(int x)
    {
        if (x <=1){
            return x;
        }else{
            return fib(x-1) + fib(x-2);
        }
    }
}