/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CC1_1L-20
 */
public class NewClass {
public static void main(String[] args)
{
    System.out.println(gcd(21,7));
    
}
public static int gcd(int a , int b)
{
    int temp = b;
    b = a%b;
    a = temp;
    if(b==0)
    {
        return a;
    }else{
        return gcd(a,b);
    }
}
    
    
    
}
