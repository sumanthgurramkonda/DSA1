package swaping;

import java.util.Scanner;

public class Swap_by_offset {
	
   public static void main(String[] args) {
	   
	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
    int temp;
    
    while(k>0) {
        temp = arr[0];
        for(int i=0;i<arr.length-1;i++) arr[i]=arr[i+1];
        arr[arr.length-1] = temp;
        k--;
    }
    for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
	
  }
}
