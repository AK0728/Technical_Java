import java.util.Scanner;

public class Main {
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i<=num/2; i++){
            if(num % i==0 ){
                return false;
            }
        }
        return true;
    }

    static boolean sumPrime(int a, int b){
        if(isPrime(a) && isPrime(b)){
            int sum = a + b;
            return isPrime(sum);
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(sumPrime(a, b));
    }
    
}
