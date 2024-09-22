package Recursion;
import java.util.*;

class R_String{
	public static String R_string(String s,String r,int i) {
	
		if(i<0)return r;
		
		return R_String.R_string(s,r+s.charAt(i),i-1);
	}
}
public class Reverse_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(R_String.R_string(s,"",s.length()-1));
		
	}

}
