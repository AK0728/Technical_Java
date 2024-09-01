import java.util.Scanner;

public class BookSeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of seats");
        int seat = sc.nextInt();
        char[] status =new char[seat];
        System.out.println("Enter the Status of the seats [S is available, X is booked]");
        for(int i=0; i < seat; i++){
            status[i] = sc.next().charAt(0);
        }
        System.out.println("Maximum seats that can be booked in a sequence are "+availableSeat(status));
        sc.close();

    }

    public static int availableSeat(char[] arr){
        int max_avail = 0;
        int avail_seat = 1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'S'){
                avail_seat++;
            }
            else{
                avail_seat =0;
            }
            if(max_avail < avail_seat){
                    max_avail = avail_seat;
                }
    
        }
        return max_avail;
    }
}
