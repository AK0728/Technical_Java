import java.util.Scanner;

public class FibbDP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms ");
        int n = sc.nextInt(); 
        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }


    public static int fibonacci(int n) {
        if (n == 0) 
            return 0;
        if (n == 1) 
            return 1;
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
    
}