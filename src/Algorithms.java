
import java.util.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;


public class Algorithms {
	
	public static int[] twoSumExists(int ar[],int target) throws IllegalAccessException {
		int res[]=new int[2];
		Map map = new HashMap();
	    for(int i=0;i<ar.length;i++) {
	    	if(!map.containsKey(target-ar[i])){
	    		map.put(ar[i], i);
	    	}
	    	else {
	    		res[1]=i;
	    		res[0]=(int) map.get(target-ar[i]);
	    		return res;
	    	}
	    }
	    throw new IllegalAccessException("No such pair Exists");
	}
	public static int[] twoSum(int num[],int target) {
		int res[]=new int[2];
		
		Arrays.sort(num);
		int low=0,high=num.length-1;
				while(low<high) {
					if(target==num[high]+num[low]) {
						res[0]=low;
						res[1]=high;
					}
					if(target>num[high]-num[high])high--;
					else if(target<num[high]-num[low])low--;
				}
        return res;
	}
	public static boolean validSequence(String s1,String s2) {
		
		    int j=0;
		    int i=0;
			while(i<s1.length()&&j<s2.length()) {
				char c1=s1.charAt(i);
				char c2=s2.charAt(j);
				System.out.println(i+" "+j);
				if(c1==c2) {
					i++;
				}
				j++;
			}
		return i==s1.length();
	}
	public static int firstNonRepeatingChar(String s) {
		Map<Character,Integer> map = new TreeMap<>();
		char[]Char=s.toCharArray();
		for(char c:Char) {
			map.put(c, map.containsKey(c) ? map.get(c)+1:1);
		}
		for(int i=0;i<Char.length;i++) {
			if(map.get(Char[i])==1)return i;
		}
		return -1;
	}
	public static String removeVowels(String s) {
		s.toLowerCase();
		Set<Character> set = Set.of('a','e','i','o','u');
		StringBuilder sb = new StringBuilder();
		for(char c:s.toCharArray()) {
			if(!set.contains(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void threeSum(int[] ar,int target) {
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			int j=i+1;
			int k=ar.length-1;
			while(j<k) {
				int sum = ar[i]+ar[j]+ar[k];
				if(sum==target) {
					System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
					j++;
					k--;
				}
				if(sum>target)k--;
				else j++;
			}
		}
	}
	public static int[] arrayProduct(int ar[]) {
		int res[]=new int[ar.length];
		int temp=1;
		for(int i=0;i<ar.length;i++) {
			res[i]=temp;
			temp*=ar[i];
		}
		temp=1;
		for(int i=ar.length-1;i>=0;i--) {
			res[i]*=temp;
			temp*=ar[i];
		}
		return res;
	}
	public static int [] nextMaxOfSubArray(int ar[],int size) {
		int nge[] = nextGreaterElement(ar);
		int res[]=new int[ar.length-size+1];
		int k=0;
		for(int i=0;i<=ar.length-size;i++) {
			int j=i;
			while(nge[j]<i+size) {
				j=nge[j];
			}
			res[i]=ar[j];
		}
		return res;
		
	}
	public static int[] nextGreaterElement(int ar[]) {
		int res[]=new int[ar.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=ar.length-1;i>=0;i--) {
			if(!stack.isEmpty()) {
				while(!stack.isEmpty()&&ar[stack.peek()]<=ar[i]) {
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				res[i]=-1;
			}
			else res[i]=stack.peek();
			stack.push(i);
		}
		return res;
	}
	public static int maxSubarrSum(int ar[]) {
		int max=0;
		int sum=0;
		for(int i=0;i<ar.length;i++){
		    if(sum+ar[i]>0){
		        sum+=ar[i];
		        if(sum>max)max=sum;
		    }
		}
		return max;
	}
	public static int longestNonRepeatingSubArray(String s) {
		int maxsize=0;
		int start=0;
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				start =Math.max(start,map.get(c)+1);
			}
			map.put(c, i);
			maxsize =Math.max(i+1-start, maxsize);
		}
		return maxsize;
	}
	public static int[] nextGreaterElement1(int nums1[]) {
		Stack<Integer> st = new Stack<>();
        int n=nums1.length;
        int nums2[] = new int[n];
        for(int i=n-1;i>=0;i--){
          if(st.isEmpty()) nums2[i]=-1;
          else{
              while(!st.isEmpty() && nums1[i]>st.peek())st.pop();
              if(!st.isEmpty())nums2[i]=st.peek();
              else nums2[i]=-1;
          }    
          st.push(nums1[i]);
       }
       return nums2;
	}
	public static int longestValidSubstringLength(String s) {
		  
		int len=0;
		Stack<Character> st = new Stack<>();
		for(char c:s.toCharArray()) {
			if(!st.isEmpty() && st.peek()=='(' && c==')') {
				st.pop();
				len++;
			}
			else
			st.push(c);
		}
		return len;
	}
	public static int bracketValidation(String s) {
		Stack<Character> st = new Stack<>();
		for(char c:s.toCharArray()) {
			if(!st.isEmpty() && st.peek()=='{' && c=='}')st.pop();
			else st.push(c);
		}
		
		return st.size();
	}
	public static int maxDepthOfNestedParenthesis(String s) {
		int curr=0;
		int max=0;
		for(char c:s.toCharArray()) {
			if(c=='(')curr++;
			else if(c==')')curr--;
			if(curr>max)max=curr;
		}
		return curr==0 ? max:-1;
	}
	public static void findElement(int ar[]){
	    
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 int num=0;
		 map.put(ar[0],1);
		 
		for(int i=1;i<ar.length;i++){
		    if(map.containsKey(ar[i])){
		       map.put(ar[i],map.get(ar[i])+1);
		    }
		    else map.put(ar[i],1);
		}
		for(int i=0;i<ar.length;i++){
		    if(map.get(ar[i])==1)num=ar[i];
		}
		System.out.println(num);
    }
	public static int[] elements(int digits[]) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
	public static int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        if(target<nums[i])return 0;
        else if(target>nums[j])return j+1;
        while(i<=j){
          int mid=(i+j)/2;
          System.out.println(mid);
          if(nums[mid]==target)return mid;
          else if(nums[mid]<target)i=mid+1;
          else j=mid-1;
        }
        return j+1;
    }
	
	
	public static void main(String[] args) throws IllegalAccessException  {
		
//		System.out.println(searchInsert(new int[] {1,3,5,6},5));
//		int ar[]= {2,11,5,10,7,8};
//		int res[]=twoSum(ar,9);
////		System.out.println(res[0]+" "+res[1]);
//		String s1="ace";
//		String s2="abcde";
////		System.out.println(validSequence(s1,s2));
//		String s="codeforcode";
////		System.out.println(firstNonRepeatingChar(s));
//		String str="What is Your name";
////		System.out.println(removeVowels(str));
//		int ar1[]= {2,4,3,7,1,8,9,0};
////		threeSum(ar1,6);
//		int ar2[]= {2,4,0,3,2,5};
//		int res2[]=arrayProduct(ar2);
////		for(int i:res2)System.out.print(i+" ");
//		
//		int ar3[]= {44,77,33,44,88,11};
////		int res3[]= nextMaxOfSubArray(ar3, 3);
////		for(int i:res3)System.out.print(i+" ");
//		int ar4[]={-2,-3,4,-1,-2,1,5,-2,3,-3};
////		System.out.println(maxSubarrSum(ar4));
////		System.out.println(longestNonRepeatingSubArray("Missindia"));
////		
////		System.out.println(longestValidSubstringLength("()))"));
////		System.out.println(bracketValidation("{{{}}{{"));
//		
//		System.out.println(maxDepthOfNestedParenthesis("(((X))(((Y))))"));
//		
//		int arr[]={2,2,1};
//		findElement(arr);
		
		
	    }

}
