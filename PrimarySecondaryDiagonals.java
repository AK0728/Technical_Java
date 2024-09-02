import java.util.Scanner;
public class PrimarySecondaryDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m value");
        int m = sc.nextInt();
        System.out.println("Enter n value");
        int n = sc.nextInt();
        if(m == n){
            
            int[][] arr = new int[m][n];
            System.out.println("Enter the elements for:");
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.print("Element in m = "+i+" and n = "+j+" : ");
                    arr[i][j] = sc.nextInt();
                }
            }

            diagonalsPrimarySecondary(arr, m);
        }
        else
            System.out.println("Not a square matrix!!!!!");
        sc.close();
    }

    public static void diagonalsPrimarySecondary(int[][] arr, int m){
        int primarySum = 0;
        int secSum = 0; 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(i == j){
                    primarySum += arr[i][j];
                }
                if((i + j) == (m - 1)){
                    secSum += arr[i][j];
                }

            }
        }
        System.out.println("The primary sum is "+primarySum);
        System.out.println("The secondary sum is "+secSum);
        System.out.println("The sum of both the diagonals is "+(primarySum + secSum));

    }
}
