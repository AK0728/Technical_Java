import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Reversed string: "+reverseStr(str));
        sc.close();
    }
    
    public static String reverseStr(String str){
        StringBuilder rev = new StringBuilder();
        rev.append(str);
        rev.reverse();
        return rev.toString();
    }
}
