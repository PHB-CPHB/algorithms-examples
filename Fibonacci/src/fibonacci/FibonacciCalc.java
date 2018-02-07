/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author philliphbrink
 */
public class FibonacciCalc {

    // Constructur
    public FibonacciCalc(){
        
    }
    public FibonacciCalc(int selection, int limit){
        if(selection == 1) System.out.println("Fibonacci number " + limit + " = " + fibo1(limit));
        if(selection == 2) System.out.println("Fibonacci number " + limit + " = " + fibo2(limit));
        if(selection == 3) System.out.println("Fibonacci number " + limit + " = " + fibo3(limit));
    }

    // Recursion --> Time : O(2^N) - Memory : O(2^N)
    public int fibo1(int n){
        if(n==1) return 1;
        if(n==2) return 1;
        return fibo1(n-1) + fibo1(n-2);
    }

    // Array --> Time : O(N) - Memory : O(N)
    public int fibo2(int n){
        int[] f = new int[n];
        f[0] = 1;
        f[1] = 2;
        for(int i=2; i<n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n-1];
    }

    // Single numbers --> Time : O(N) - Memory : O(1)
    public int fibo3(int n){
        int f = -1;
        int old = 1;
        int older = 1;
        for(int i =2; i<n; i++){
            f = old + older;
            older = old;
            old = f; 
        }
        return f;
    }

}

