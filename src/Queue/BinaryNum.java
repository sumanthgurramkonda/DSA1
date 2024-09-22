package Queue;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNum {
	
	public static boolean isBalancedParenthesis(char[]ar) {
        Stack<Character> stack = new Stack<Character>();
		
		for(char c:ar) {
			if(c=='{'||c=='['||c=='(')stack.push(c);
			else {
				if(stack.isEmpty())return false;
				else {
					if(c==')' && stack.peek()=='('
					 ||c==']' && stack.peek()=='['
					 ||c=='}' && stack.peek()=='{')  
						stack.pop();
					else return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static String[] binaryNum(int n) {
		String []res = new String[n];
		Queue<String> q = new LinkedList<String>();
		q.offer("1");
		for(int i=0;i<n;i++) {
			res[i]=q.poll();
			String n1 = res[i]+'0';
			String n2 = res[i]+'1';
			q.offer(n1);
			q.offer(n2);
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		char[]ar = {'{','[','(',')',']','}'};
		System.out.println(isBalancedParenthesis(ar));
		int n=10;
		String[] res= binaryNum(n);
		for(String s:res)
		System.out.println(s);
		
		
		
	}

}
