import java.util.Scanner;

public class Cruise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time limit(in hrs) :");
        int time = sc.nextInt();
        System.out.println("Enter the Number of guests arrived ");
        int[] enter = new int[time];
        for(int i=0; i < time; i++){
            System.out.print("In time t="+(i+1)+" :");
            enter[i] = sc.nextInt();
        }
        
        System.out.println("Enter the Number of guests left ");
        int[] leave = new int[time];
        for(int i=0; i < time; i++){
            System.out.print("In time t="+(i+1)+" :");
            leave[i] = sc.nextInt();
        }

        System.out.println("The maximum guests: "+guestPresent(enter, leave, time));
        sc.close();

    }

    public static int guestPresent(int[] e, int[] l, int t){
        int guest = 0;
        int max = 0;
        for(int i=0; i < t; i++ ){
           guest = guest + e[i] -l[i];
           if(max<guest){
            max = guest;
           }
        }
        return max;
    }
}
