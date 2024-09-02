/* Program to generate a pin with 4 input i.e first name, last name, pin and a number n; based on following steps:
 *      1) Compare the first name and last name, the one which is shorter assign it as short_name and the other Long_name. If both are eqal arange according to alphabetic order.
 *      2) Pin is generated using ' first letter of short_name' + 'The complete long_name' + 'The nth number from the pin when counted from left to right' + 'nth number of pin counted from right to left'
 *      3) Toggle the above generated pin, i.e all the uppercase letters are converted to lowercase and vice versa . 
 *  The toggled string is the Generated pin.
 */

import java.util.Scanner;

public class PinGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details:");
        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Pin: ");
        int pin = sc.nextInt();
        System.out.print("Any Number from 0-9: ");
        int n = sc.nextInt();
        System.out.println("The PIN generated : "+generatePin(firstName,lastName,pin,n));

        sc.close();
    }

    public static String generatePin(String input1, String input2, int input3, int input4){
        String shortName;
        String longName;
        if(input1.length() == input2.length()){
            if(input1.charAt(0) < input2.charAt(0)){
                shortName = input1;
                longName = input2;
            }
            else{
                shortName = input2;
                longName = input1;
            }
        }
        else if (input1.length() < input2.length()) {
                shortName = input1;
                longName = input2;
        } else {
                shortName = input2;
                longName = input1;
        }

        String input3Str = Integer.toString(input3);            //Converting input3 to string

        String PIN = shortName.charAt(0) + longName + input3Str.charAt(input4-1) + input3Str.charAt(input3Str.length()-input4);

        StringBuilder sb = new StringBuilder(PIN.length());

        for(int i=0; i < PIN.length(); i++){
            char letter = PIN.charAt(i);
            if(Character.isUpperCase(letter))
                sb.append(Character.toLowerCase(letter));
            else if (Character.isLowerCase(letter)) {
                sb.append(Character.toUpperCase(letter));                
            }
            else
                sb.append(letter);
        }
        

        String finalPin = sb.toString();

        return finalPin;
    }
}
