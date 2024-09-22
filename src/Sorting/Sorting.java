package Sorting;

public class Sorting {
	
	static void bubble_sort(int ar[]) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				int temp=ar[j];
				if(ar[i]>ar[j]) {
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
	}
	static void insertion_sort(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			int j=i-1;
			int temp=ar[i];
			while(j>=0&&ar[j]>temp){
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=temp;
		}
	}
	static void selectionsort(int ar[]) {
		
		for(int i=0;i<ar.length-1;i++) {
			int min=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[min]) {
				    min=j;
				}
			}
			int temp = ar[min];
			ar[min]=ar[i];
			ar[i]=temp;
		}
	}
	static int[] mergeArrays(int ar[],int ar1[],int m,int n) {
		int i=0,j=0,k=0;
		int ar2[] = new int[m+n];
		while(i<m) {
             if(j<n&&ar[i]<ar1[j]) {
            	 ar2[k++]=ar[i++];
             }
             else if(j<n)ar2[k++]=ar1[j++];
             else ar2[k++]=ar[i++];
		}
		while(k<ar2.length)ar2[k++]=ar1[j++];
		return ar2;
	}
	public static void mergeSort(int ar[],int temp[],int low,int high) {
		if(high==low) return;
			int mid = (high+low)/2;
			mergeSort(ar,temp,low,mid);
			mergeSort(ar,temp,mid+1,high);
			merge(ar,temp,low,mid,high);
	}
	public static void merge(int ar[],int temp[],int low,int mid,int high) {
		for(int i=low;i<=high;i++) temp[i]=ar[i];
		
		int i=low,j=mid+1,k=low;
		while(i<=mid&&j<=high) {
             if(temp[i]<=temp[j]) ar[k++]=temp[i++];
             else ar[k++]=temp[j++];             
		}
		while(i<=mid)ar[k++]=temp[i++];
	}
	public static void sort012(int ar[]) {
		
		int i=0,j=0,k=ar.length-1;
		int temp;
		while(i<=k) {
			if(ar[i]==0) {
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				i++;
				j++;
			}
			else if(ar[i]==2) {
				temp=ar[i];
				ar[i]=ar[k];
				ar[k]=temp;
				k--;
			}
			else if(ar[i]==1)i++;
		}
	}   
	public static void quickSort(int ar[],int low,int high) {
		 if(low<high) {
		 int p = partition(ar, low, high);
		 quickSort(ar, low, p-1);
		 quickSort(ar, p+1, high);
		 }
	}
		
	public static int partition(int ar[],int low,int high){
			
			int pivot = ar[high];
			int i=low;
			int j=low;
			while(i<=high) {
				if(ar[i]<=pivot) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					j++;
				}
				i++;
			}
			return j-1;
	}
	public static int[] arraySquare(int ar[]) {
		int i=0;
		int j=ar.length-1;
		int res[]=new int[j+1];
		for(int k=ar.length-1;k>=0;k--) {
			
			if(Math.abs(ar[i])<Math.abs(ar[j])) {
				res[k]=Math.abs(ar[j])*Math.abs(ar[j]);
				j--;
			}
			else {
				res[k]=Math.abs(ar[i])*Math.abs(ar[i]);
				i++;
			}
		}
		return res;
	}
    public static void minmaxSortArra(int ar[]) {
    	int minindex =0;
    	int maxindex=ar.length-1;
    	int max=ar[maxindex]+1;
    	for(int i=0;i<ar.length;i++) {
    		
    		if(i%2==0) {
    			ar[i]=ar[i]+(ar[maxindex]%max)*max;
    			maxindex--;
    		}
    		if(i%2!=0) {
    			ar[i]=ar[i]+(ar[minindex]%max)*max;
    			minindex++;
    		}
    	}
    	for(int i=0;i<ar.length;i++)ar[i]=ar[i]/max;
    	
    }
	public static void main(String[] args) {
		 
		int ar[] = {3,2,6,3,23,4,9,8};
		int ar1[]= {4,7,3,2,10,65,23,34};
		int ar2[]= {1,0,2,2,1,0,1};
		int ar3[]= {-4,-1,0,3,10};
//		ar3=arraySquare(ar3);
//		for(int i:ar3)System.out.print(i+ " ");
//		System.out.println();
//		bubbleSort(ar, 0, ar.length-1);
//		for(int i:ar)System.out.print(i+ " ");
		
//		sort012(ar2);
//		for(int i:ar2)System.out.print(i+ " ");
		mergeSort(ar, new int[ar.length], 0, ar.length-1);
		for(int i:ar)System.out.print(i+ " ");
		
//		bubble_sort(ar);
//		insertion_sort(ar);
//		selectionsort(ar);
//		selectionsort(ar1);
//	    System.out.println();
//	    for(int i:ar)System.out.print(i+ " ");
//	    System.out.println();
//	    for(int i:ar1)System.out.print(i+ " ");
//	    System.out.println();
//	    int ar2[]= mergeArrays(ar,ar1,ar.length,ar1.length);
//	    for(int i:ar2)System.out.print(i+" ");
	}

}
