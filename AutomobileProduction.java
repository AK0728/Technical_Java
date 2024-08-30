import java.util.Scanner;

public class AutomobileProduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of vehicles: ");
        int v = sc.nextInt();
        System.out.print("Enter the Number of wheels: ");
        int w = sc.nextInt();

        produce(v, w);
        sc.close();
    }

    public static void produce(int v,int w){
        int four = (w-(2*v))/2;
        int two = v-four;
        if (w >= 2 * v && w <= 4 * v && w % 2 == 0 && four >= 0 && two >= 0){
            System.out.println("Two wheeler is "+ two +" and Four wheeler is "+four);
        }
        else{
            System.out.println("Invlid vehicles and Wheels");
        }

    }

}
