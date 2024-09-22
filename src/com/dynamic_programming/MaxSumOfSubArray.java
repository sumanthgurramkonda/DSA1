package com.dynamic_programming;

public class MaxSumOfSubArray {
	public static void main(String[] args) {
		int ar[] = {4,3,-2,6,-12,7,-1,6};
		int sum=ar[0],maxsum=ar[0];
		for(int i=1;i<ar.length;i++) {
			sum+=ar[i];
			if(sum<ar[i]) {
				sum=ar[i];
			}
			if(maxsum<sum)maxsum=sum;
		}
		System.out.println(maxsum);
	}

}
