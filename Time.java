import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds to convert");
        int in_sec = sc.nextInt();
        convertTime(in_sec);

        sc.close();
        
    }

    public static void convertTime(int x){
        int day = 0;
        int hr = 0;
        int min = 0;

        day = x/86400;
        x = x%86400;

        hr = x/3600;
        x = x%3600;

        min = x/60;
        x = x%60;
        
        System.out.println("The converted time is : "+day+" DAYS : "+hr+" HRS : "+min+" MINS : "+x+" SECS");
    }
}
