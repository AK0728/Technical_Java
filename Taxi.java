import java.util.Scanner;

public class Taxi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        double dist = sc.nextDouble();
        System.out.println("The amount to be paid : ");
        System.out.println(taxiFare(dist));
        sc.close();
    }

    public static double taxiFare(double x){
        if(x <= 1.5)
            return 35;
        else{
            double addFare = 35 + Math.ceil(x - 1.5)*25;
             return addFare;
        }
    }

}
