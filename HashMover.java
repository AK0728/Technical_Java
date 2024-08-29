import java.util.Scanner;

public class HashMover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println(moveHash(str));
        sc.close();
    }

    public static String moveHash(String s){
        int hcount=0;
        StringBuilder nohash =new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '#'){
                hcount++;
            }
            else{
                nohash.append(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i=0; i<hcount; i++){
            result.append('#');
        }

        result.append(nohash);
        return result.toString();
    }
}
