
import java.util.*;
public class Tailing_Zeros {
	   static int tailingZeros(int n) {
		   int count =0;
		   int powerof5 = 5;
		   while(n>=powerof5) {
			   count = count+(n/powerof5);
			   powerof5 = powerof5*5;
		   }
		return count;
	   }
       public static void main(String[] args) {
    	   
    	   Scanner scan = new Scanner(System.in);
    	   int n = scan.nextInt();
    	   int count =0;
    	   System.out.println(tailingZeros(n));
    	
       }
}
