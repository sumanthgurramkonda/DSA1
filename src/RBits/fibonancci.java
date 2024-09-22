package RBits;
import java.util.*;
class fibonanci{
	public static int fibo(int n) {
		if(n==1||n==2) return 1;
		
		return fibo(n-1)+fibo(n-2);
	}
}

public class fibonancci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(fibonanci.fibo(scan.nextInt()));
	}

}
