package Recursion;
import java.util.*;
class josephes{
	public static int Josephes(int n,int k) {
		
		if(n==0)return 0;
		return (Josephes(n-1,k)+k)%n;
	}
}
public class Josephes_problem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int k = scan.nextInt();
		System.out.println(josephes.Josephes(n,k)+1);
	}
}
