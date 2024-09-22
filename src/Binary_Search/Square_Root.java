package Binary_Search;
import java.util.*;

public class Square_Root {
	static int sqrt(int n) {
		int l =1,h=n/2,m=0;
		int res=0;
		if(n==0||n==1)return n;
		while(l<=h) { 
			m=(l+h)/2;
			if(m*m==n) return m;
			else if(m*m>n) {
				h=m-1;
			}
			else {
				l=m+1;
				res=m;
			}
		}
		return res;
	}
    public static void main(String[] args) {
		
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	System.out.println(sqrt(n)); 
    	
	}
}
