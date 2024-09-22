import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
	
	public static void generateBinaryNum(int n) {
		Queue<String> q = new LinkedList<String>();
		q.offer("1");
		for(int i=0;i<n;i++) {
			String s = q.poll();
			System.out.println(s+" ");
			q.offer(s+"0");
			q.offer(s+"1");
		}
	}
	public static void main(String[] args) {
		
		generateBinaryNum(10);
		
	}
}
