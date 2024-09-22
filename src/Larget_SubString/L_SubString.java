package Larget_SubString;

import java.util.*;
import java.util.Scanner;

public class L_SubString {
	static String LString(String str) {
		int n=str.length();
		int max=0;
		String substr="",palimstr="";
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				substr=str.substring(i,j);
				if(ispalindrome(substr) && substr.length()>max) {
					max=substr.length();
					palimstr=substr;
				}
			}
		}
		return palimstr;
	}
	static boolean ispalindrome(String substr) {
		int i=0,j=substr.length()-1;
		while(i<j) {
			if(substr.charAt(i)!=substr.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
///////////	///////////////////////////////////////////////////////////////////////////////////
    static String L_substring(String str) {
		
		int start=0,end=0;
		
		for(int i=0;i++<str.length();) {
			
			int len1 = isPalimdrone(str,i,i);
			int len2 = isPalimdrone(str, i, i+1);
			int len = Math.max(len1, len2);
			if(len>(end-start)) {
               start = i-(len-1)/2;
               end = i+len/2;
			}
		}
		return str.substring(start,end+1);
	}
    static int isPalimdrone(String str, int first, int last) {
	
	   while(first>=0 && last<str.length() && str.charAt(first)==str.charAt(last)) {
		   first--;
		   last++;
	   }
		return last-first-1;
	}
   
    static  public boolean isprime(int a) {

	   for(int i=2;i*i<=a;i++) {
		   if(a%i==0)return false;
	   }
	   return true;   
   }
    static public int lengthOfLongestSubstring(String str) {
        int count =0;
        int check[] = new int[26];
        int l=0,h=0;
        int max =1;
        str=str.toLowerCase();
        if(str.isEmpty())return 0;
        else if(str.length()==1)return 1;

        for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        count++;
        if(ch>='a'&&ch<='z'){
        while(check[ch -'a']<count){
            i++;
            check[ch-'a']++;
            if(i<str.length())ch = str.charAt(i);
        }
        h=i;
        if((h-l)>max)max=h-l;
        l=h;
        i--;
        }
        }
        return max;
    }
    static public int lengthofLongestsubstring(String str) {
    	int max=0;
    	String s="";
    	for(int i=0;i<str.length();i++) {
    		String c =str.valueOf(str.charAt(i));
    		if(s.contains(c)) {
    			s=s.substring(s.indexOf(c)+1);
    		}
    		s=s+c;
//    		System.out.println(s);
    		max = Math.max(s.length(), max);
    	}
    	return max;
    }
    public static void main(String[] args) {
      
	     int n = Integer.MAX_VALUE;
	     System.out.println(n);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.nextLine();
		System.out.println(lengthofLongestsubstring(str));
//		if(str==null||str.length()<1) System.out.println("null");
//		else System.out.println(L_substring(str));
//		System.out.println(LString(str));
//		10
//		2 3 5 7 
//		
//		int a =scan.nextInt();
//		for(int  i=2;i<a;i++) {
//			if(isprime(i))System.out.println(i);
//		}
		
		//wwwnnsyddeers
		//w3n2syd2e2rs
		
//		String s = "";
//		for (int i = 0; i < str.length()-1; i++) {
//			int count =1;
//			while(str.charAt(i)==str.charAt(i+1)) {
//				count ++;
//				i++;
//			}
//			System.out.println(str.charAt(i-1) +" "+ count );
//			if(count>1)s+=str.charAt(i-1)+count;
//			else s+=str.charAt(i);
//		}
//		System.out.println(s);
//			if(str.charAt(i)==str.charAt(i+1)) {
//				count++;
//			}
//			else if(count >1){
//					s = s + str.charAt(i)+count;
//					count=1;
//				}
//				else {
//					s = s + str.charAt(i);
//				
//				}
//		}if(count ==1) {
//			s = s + str.charAt(str.length()-1);
//			
//		}else {
//			
//			s = s + str.charAt(str.length()-1)+count;
//		}
//		
	}
}






