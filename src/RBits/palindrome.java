package RBits;
import java.util.*;

class reverse{
	reverse(int n) {
	int f=31;
	   int l =0;
	   int rev = 0;
	   while(f>l) {
		   if((n &(1<<f))!=0) rev=rev|(1<<l);
		   if((n &(1<<l))!=0) rev=rev|(1<<f);   
		   l++;
		   f--;
	   }
	   System.out.println(Integer.toString(n));
	   }
}
class Paldrome{
	Paldrome(int n){
		int l=0;
		int count=0;
		int ele=0;
		int ans=0;
		while(count<n) {
			l++;
			count += (int)Math.pow(2,(l-1)/2);
		}
		count -= Math.pow(2,(l-1)/2);
		ele = n-count-1;
	    ans = 1<<l-1|ele<<(l/2);
	    new reverse(ans);
	}
}

public class palindrome {
     public static void main(String[] args) {
    	 
    	 Scanner scan = new Scanner(System.in);
    	 new Paldrome(scan.nextInt());
     }
}
