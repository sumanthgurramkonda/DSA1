package Sorting;

public class Alg {
	public static boolean sortedSearch(int ar[][],int n) {
		int i=0,j= ar.length-1;
		while(i<ar.length&&j>=0) {
			
			if(ar[i][j]==n) return true;
			if(ar[i][j]>n)j--;
			else i++;
		}
		return false;
	}
	public static void spiralForm(int ar1[][]) {
		int top = 0,bottom = ar1.length-1;
		int left = 0, right = ar1.length-1;
		
		while(top<bottom && left<right) {
			for(int i=top;i<=bottom;i++)System.out.print(ar1[top][i]+" ");
			top++;
			for(int i=top;i<=right;i++)System.out.print(ar1[i][bottom]+" ");
			bottom--;
			for(int i=bottom;i>=left;i--)System.out.print(ar1[right][i]+" ");
			right--;
			for(int i=right;i>left;i--)System.out.print(ar1[i][left]+" ");
			left++;
		}
	}
	public static void bubbleSort(int ar[]) {
		
		for(int i=0;i<ar.length-1;i++) {
			boolean issorted =false;
			for(int j=i;j<ar.length-1-i;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					issorted = true;
				}
			}
			if(!issorted)break;
		}
	}
	public static void insertionSort(int ar[]) { //  {6,5,2,9,2,4,3,11,23,33,1};
		
		for(int i=0;i<ar.length;i++) {
			int j=i-1;
			int temp =ar[i];
			while(j>=0&&ar[j]>temp) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		int ar[][] = {
				{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,51}, };
		int ar1[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16} };
		
//		System.out.println(sortedSearch(ar,32));
//		spiralForm(ar1);
		int ar2[]= {6,5,2,9,2,4,3,11,23,33,1};
//		bubbleSort(ar2);
		System.out.println();
		insertionSort(ar2);
		for(int i:ar2)System.out.print(i+" ");
	}
}










