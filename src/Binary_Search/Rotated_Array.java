package Binary_Search;

public class Rotated_Array {
	public static void main(String[] args) {
		
//		int ar[] = {7,6,5,4,3,2,1};
		int ar[] = {5,6,7,1,2,3,4};
		
		int l=0,h=ar.length-1,m=0;
		int target = 9;
		boolean b = false;
		
		while(l<=h) {
			m =(l+h)/2;
			if(ar[m]==target) {
				b = true;
				 break;
			}
			else if(ar[l]<= ar[m]) {
				if(ar[l]>=target && ar[m]<target) {
					h = m-1;
				}
				else l=m+1;
			}
			else {
				if(ar[h]<=target && ar[m]>target) {
					l = m+1;
				}
				else h=m-1;
				
			}
		}
		if(b)System.out.println(m);
		else System.out.println(-1);
	}

}
