
package fibonaccirecursion;

import java.util.Scanner;


public class FibonacciRecursion {

    static int fib(int n) {
      
    int fibo[]=new int[n+2];
    
    fibo[0]=0; 
    fibo[1]=1; 
      
    for(int i=2;i<=n;i++) 
    { 
        fibo[i]=fibo[i-1]+fibo[i-2]; 
    } 
         return fibo[n]; 
    } 
    
  
    public static void main(String[] args) {
        int n; 
         Scanner input= new  Scanner(System.in);
         n= input.nextInt();
        System.out.println(fib(n));
    }
    
}
