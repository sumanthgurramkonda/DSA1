package com.dynamic_programming;

public class Fib_Series {
	public static int fib(int n) {
		
//		Bottom up approach
//		int temp[] = new int[n+1];
//		 temp[0]=0;
//		 temp[1]=1;
//		for(int i=2;i<=n;i++) {
//			temp[i]=temp[i-1]+temp[i-2];
//		}
		
//		Recursive Approach
//		if(n==0)return 0;
//		if(n==1)return 1;
//		int left=fib(n-1);
//		int right=fib(n-2);
//		return left+right;
//		return temp[n];
		return fibTopDown(n, new int[n+1]);
	}
	public static int fibTopDown(int n,int temp[]) {
		if(temp[n]==0) {
			if(n<2)
			temp[n]=n;
			else temp[n]=fibTopDown(n-1,temp)+fibTopDown(n-2,temp);
		}
		return temp[n];
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(fib(6));
	}
}









