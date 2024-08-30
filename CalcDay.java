import java.util.ArrayList;
import java.util.Scanner;
public class CalcDay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter today is which day(First letter should be capital)");
        String today = sc.nextLine();
        System.out.println("Enter the number of days from today to predict the day");
        int num = sc.nextInt();
        System.out.println("It will be "+dayPredict(today,num)+" after "+num+" days");
        sc.close();
    }
    public static String dayPredict(String today, int num){
	    ArrayList<String> dys= new ArrayList<String>();
        dys.add("Monday");
	    dys.add("Tuesday");
        dys.add("Wednesday");
        dys.add("Thursday");
        dys.add("Friday");
        dys.add("Saturday");
        dys.add("Sunday");
	    
	    int start = dys.indexOf(today);
        int end = num;

        int resultIndex = (start + end) % 7;
        
        return dys.get(resultIndex).toUpperCase();
            
       
    }
	    
	
	
}
