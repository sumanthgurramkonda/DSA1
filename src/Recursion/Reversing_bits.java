package Recursion;
import java.util.*;

public class Reversing_bits {
     public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
	   int  n = scan.nextInt();
	   System.out.println(Integer.toBinaryString(n));
	   int f=31;
	   int l =0;
	   int rev = 0;
	   while(f>l) {
		   if((n &(1<<f))!=0) rev=rev|(1<<l);
		   if((n &(1<<l))!=0) rev=rev|(1<<f);   
		   l++;
		   f--;
	   }
	   System.out.println(Integer.toBinaryString(rev));
		
     }
}
