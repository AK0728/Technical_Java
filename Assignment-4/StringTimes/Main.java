import java.util.Scanner;

public class Main {
    static String stringTimes(String s, int n){
        String finalString = "";
        for(int i=0; i<n; i++){
            finalString += s;
        }
        return finalString;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to repeat");
        int n = sc.nextInt();
        System.out.println(stringTimes("Hi", n));
        
        sc.close();
    }
}
