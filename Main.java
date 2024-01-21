/*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.*/

import java.util.Scanner;

public class Main
{
    static boolean lastDigit(int a, int b){
        boolean x = (a%10 == b%10) ? true : false;
        return x;
        
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.print("Enter the 1st non-negative integer: ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd non-negative integer: ");
		int b = sc.nextInt();
		
		boolean result = lastDigit(a,b);
		System.out.print("The integers have same last digit : "+result);
		
		
	}
}
