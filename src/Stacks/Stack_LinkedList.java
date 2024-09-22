package Stacks;

import java.util.Scanner;
import java.util.Stack;

class stackUnderFlowException extends Exception{
	public stackUnderFlowException() {
		super("No elements available");
	}
}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class stack{
	  Node top;
	  int Size=0;
	  public stack() {
		  this.top=null;
	  }
	  void push(int e) {
		  Node temp = new Node(e);
		  temp.next=top;
		  top=temp;
		  Size++;
	  }
	  int pop() throws stackUnderFlowException{
		  if(top==null) throw new stackUnderFlowException() ;
		  int a = top.data;
		  top=top.next;
		  Size--;
		  return a;
	  }
	  int size() {
		  return Size;
	  }
	  int peek() {
		  return top.data;
	  }
	  boolean isEmpty() {
		 return top==null;
	  }
}

public class Stack_LinkedList {
	   
	   static boolean balancedParenthesis(String s) throws stackUnderFlowException {
		   stack stack = new stack();
		   char c;
		   for(int i=0;i<s.length();i++) {
			   c=s.charAt(i);
			   if(c=='('||c=='['||c=='{') {
				   stack.push(c);
			   }
			   else if( stack.size()>0 
					   &&c==')'&&stack.peek()=='('
					   ||c==']'&&stack.peek()=='['
					   ||c=='}'&&stack.peek()=='{') {
				   stack.pop();
			   }
			   else return false;
		   }
		   return stack.isEmpty(); 
	   }
	   
	   static void closestSmallest(int ar[]) throws stackUnderFlowException {
		   stack Stack = new stack();
		   
		   for(int i=0;i<ar.length;i++) {
			  while(Stack.top!=null && Stack.peek()>ar[i]) {
				  Stack.pop();
			  }
			  if(Stack.top==null) System.out.println(-1);
			  else System.out.println(Stack.peek());
			  Stack.push(ar[i]);
		   }
		   
	   }

	   static void stockSpan(int ar[]) throws stackUnderFlowException {
		   stack Stack = new stack();

//		   int max = ar[0];
//		   System.out.print(1+" ");
//		   int count =1;
//		   for(int i=1;i<ar.length;i++) {
//			   if(ar[i]>max) {
//				   System.out.print(i+1+" ");
//				   max=ar[i];
//				   count =1;
//			   }
//			   else {
//				   System.out.print(count + " ");
//				   count++;
//			   }
//		   }
		   for(int i=0;i<ar.length;i++) {
			   
			   if(!(Stack.isEmpty()) && ar[i]<ar[Stack.peek()]) {
				   System.out.print(i -Stack.peek() + " ");
			   }
			   else {
				   System.out.print(i+1 +" ");
				   if(Stack.top==null)
				   Stack.push(i);
				   else {
					   Stack.pop();   
					   Stack.push(i);
				   }
			   }
		   }    
	   }
	
	   static String infinixToPostfix(String s) throws stackUnderFlowException {
		   
		   stack Stack = new stack();
		   String res="";
		   
		   for(int i=0;i<s.length();i++) {
			   char c=s.charAt(i);
			   if(Character.isLetter(c))res+=c;
			   else if(c == '(')Stack.push('(');
			   else if(c == ')') {
				   while(Stack.size()>0 && Stack.peek() != '(') {
					  res+=(char)Stack.pop();
				   }
				   Stack.pop();
			   }
			   else {
				   if(Stack.size()>0 && pre(c)> pre((char)Stack.peek())) {
					   Stack.push(c);
				   }
				   else {
					   while(Stack.size()>0 && pre(c) <= pre((char)Stack.peek())) {
						   res+=(char)Stack.pop();
					   }
					   Stack.push(c);
				   }
			   }
		   }
		   while(Stack.top!=null)res+=(char)Stack.pop();
		return res;
	   }
	   static int pre(char ch) {
		   if(ch=='^')return 3;
		   if(ch=='+'||ch=='-') return 1;
		   else if(ch=='*'||ch=='/') return 2;
		   return 0;
	   }
	   
	   static public int evaluatePostfix(String s) {
		   
		   Stack<Integer> st = new Stack<>();
		   int res = 0;
		   for(int i=0;i<s.length();i++) {
			   char c=s.charAt(i);
			   
			   if(c>='0'&&c<='9') {
				   int n = c-'0';
				   st.push(n);
				   
			   }
			   else {
				   if(!st.isEmpty()) {
					   int n1=st.pop();
					   int n2=st.pop();
				      if(c=='+') {
				    	  res=n2+n1;
						  st.push(res);
				      }
				      else if(c=='-') {
					      res=n2-n1;
					      st.push(res);
				      }
				      else if(c=='*') {
					      res=n2*n1;
					      st.push(res);
				      } 
				      else if(c=='/') {
					      res=n2/n1;
					      st.push(res);
				      }
				   }
			   }
		   }
		   return res;
	   }
	   public static int [] stockSpan1(int ar[]) {
		   Stack<Integer> st = new Stack<>();
		   int n=ar.length;
		   int res[]=new int[n];
		   res[0]=1;
		   st.push(0);
		   
		   for(int i=1;i<n;i++) {
			   while(!st.isEmpty()&& ar[st.peek()]<=ar[i])st.pop();
			   res[i]= st.isEmpty() ? i+1 : i-st.peek();
			   st.push(i);
		   }
		   return res;
	   }
	   
	   public static void main(String[] args) throws stackUnderFlowException{
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter Infinix");
//		String s = scan.next();
//		System.out.println(infinixToPostfix(s));
//		System.out.println(evaluatePostfix("24+52*-"));
		
		int ar[]= {100,80,60,70,60,75,85};
		stockSpan(ar);
		System.out.println();
		for(int i:stockSpan1(ar))System.out.print(i+" ");
		
//		int ar[] = {12,14,10,15,6,10};
//		stockSpan(ar);
		
//		int ar[]= {5,7,3,12,9};
//		closestSmallest(ar);
		
//		String str =scan.next();
//		System.out.println(balancedParenthesis(str));
		
//		stack s = new stack();
//		System.out.println(s.isEmpty());
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40); 
//		System.out.println(s.size());
//		System.out.println(s.pop());
//	    System.out.println(s.peek());
//	    System.out.println(s.isEmpty());
//	    
//		System.out.println(s.pop());
	
		
	}

}
