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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FibonacciCalc fib = new FibonacciCalc();
        switch (Integer.parseInt(args[0])) {
            case 1:
                System.out.println(fib.fibo1(Integer.parseInt(args[1])));
                break;
            case 2:
                System.out.println(fib.fibo2(Integer.parseInt(args[1])));
                break;
            default:
                System.out.println(fib.fibo3(Integer.parseInt(args[1])));
                break;
        }
    }
    
}
