import java.util.Scanner;

public class MaxArrProduct {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Maximum product in the array is "+maxProduct(arr));
        sc.close();
    }

    public static int maxProduct(int[] arr){
        int maxProd = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                int product = arr[i] * arr[j];
                if(product > maxProd){
                    maxProd = product;
                }
            }

        }
        return maxProd;
    }
}
