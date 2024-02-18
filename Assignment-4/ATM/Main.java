import java.util.Scanner;

public class Main {
    static int pin = 1234;
    static int balance = 0;
    static void deposite(Scanner sc){
        System.out.print("Enter the amount to deposite: ");
        int amt = sc.nextInt();
        balance = amt;
        System.out.println("\nAmount deposited successfully... ");
        System.out.println("The available balance is "+balance+"\n\n");
    }

    static void withdraw(Scanner sc){
        System.out.print("Enter the amount to withdraw: ");
        int amt = sc.nextInt();
        if(amt < balance){
            balance -= amt;
            System.out.println("\nPlease Collect your cash!!!");
            System.out.println("The available balance is "+balance+"\n\n");
        }
        else
            System.out.println("Insufficient balance!!!!!!!\n\n");
    }

    static void balEnquiry(){
        System.out.println("Your account balance is "+balance+"\n\n");
    }

    static void pinChange(Scanner sc){
        System.out.println("Enter new PIN: ");
        int newPin = sc.nextInt();
        System.out.println("Confirm your new PIN");
        int confPin = sc.nextInt();
        if(newPin == confPin){
            System.out.println("PIN changed successfully!!!!!\n\n");
            pin = newPin;
        }
        else
            System.out.println("PIN change failed....\n\n");
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN");
        int entered_pin = sc.nextInt();
        if(pin != entered_pin ){
            System.out.println("Incorrect PIN !!!");
            return;
        }
        while(true){
            System.out.println("********MENU**********");
            System.out.println("* 1.Deposit          *");
            System.out.println("* 2.Withdraw         *");
            System.out.println("* 3.Balance enquiry  *");
            System.out.println("* 4.PIN change       *");
            System.out.println("* 5.Exit             *");
            System.out.println("**********************");
            System.out.println("Please select an option ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 : deposite(sc);
                         break;
                case 2 : withdraw(sc);
                         break;
                case 3 : balEnquiry();
                         break;
                case 4 : pinChange(sc);
                         break;
                case 5 : System.exit(0);

                default : System.out.println("Invalid input");
                          break;
            }

        }
    }
    
}
