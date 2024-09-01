import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coins:");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter the coins");
        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
        }
        System.out.print("Enter the amount to give change:");
        int amt = sc.nextInt();
        int output = change(coins, amt);
        System.out.println("No of Change:" + output);
        sc.close();
    }

    public static int change(int[] arr, int amt){
        int count = 0;
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            while(amt >= arr[i]){
                amt = amt - arr[i];
                count++;
            }
        }
        return count;
    }
}
