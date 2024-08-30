import java.util.Scanner;

public class ShortString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        System.out.println("The new short string is "+shortenString(str));

        sc.close();

    }
    public static String shortenString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int count = 1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;              
                }
                else
                    break;
            }
            
            sb.append(s.charAt(i));
            if(count >1){
                sb.append(count);
            }
            i = i+count-1;
        }
        return sb.toString();
    }
}
