import java.util.Scanner;

public class Main {
    static void pos(int n){
        for(int i=n-1; i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void neg(int n){
        for(int i=n; i<=0;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        if(num == 0){
            System.out.println("It is already zero.");
        }
        else if(num > 0){
            pos(num);
        }
        else{
            neg(num);
        }
    }
    
}
