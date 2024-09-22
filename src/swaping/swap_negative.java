package swaping;

import java.util.Scanner;

public class swap_negative {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		arr[i]=scan.nextInt();
		}
		int temp ;
		int j=1;
		int k=0;
		for(int i=0;i<n;i+=2){
		    if(arr[i]<0){
		    	while(arr[k]<0)k++;
		    	temp = arr[i];
		        arr[i]=arr[k];
		        arr[k]=arr[j];
		        arr[j]=temp;
		        j+=2;
		        k++;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]);
		}		
		
	}
}
