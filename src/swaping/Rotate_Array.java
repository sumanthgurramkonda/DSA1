package swaping;

public class Rotate_Array {
	
	static void rotateArray(int ar[],int i,int j) {
		while(i<j) {
			int temp=ar[j];
			ar[j]=ar[i];
			ar[i]=temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9};
		int k=3;
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
		}
		System.out.println();
		rotateArray(ar,0,k-1);
		rotateArray(ar,k,ar.length-1);
		rotateArray(ar,0,ar.length-1);
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
		}
	}
}
