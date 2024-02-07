//Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
import java.util.Scanner;

public class Main
{
static boolean makes10(int a, int b){
    return (a == 10)||(b == 10)||(a + b == 10)? true: false;
    }
 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter 1st integer: ");
       int a= sc.nextInt();
       System.out.print("Enter 2nd integer: ");
       int b= sc.nextInt();
    
       System.out.println(makes10(a,b));
       sc.close();

    }

}