//Given 2 int values, return true if either of them is in the range 10..20 inclusive.

import java.util.Scanner;

public class Main {
static boolean in1020(int a, int b){
    return (10<=a && a<=20)||(10<=b && b<=20);
}    

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 1st integer: ");
    int x=sc.nextInt();
    System.out.print("Enter 2nd integer: ");
    int y=sc.nextInt();

    System.out.println(in1020(x, y));
    sc.close();
}
}
