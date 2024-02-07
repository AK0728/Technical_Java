// Given one integer n and return true if it is an even number else return false.
import java.util.Scanner;

public class Main
{
    static boolean Even(int n){
        return n % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        System.out.println(Even(num) ? "True" : "False");
        sc.close();

    }
}