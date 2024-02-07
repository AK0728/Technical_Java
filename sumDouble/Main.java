//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
import java.util.Scanner;

public class Main
{
    static int sumDouble(int x, int y){
        return x != y ? x+y : 2*(x+y);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sumDouble(a, b);
        System.out.println("The Result is = "+result);
        sc.close();
    }
}