package Binary_Search;

public class Bouquets {
	
	static int minDayspossible(int ar[],int m,int k) {
		
		if(m*k>ar.length)return -1;
		
		int l = ar[0],h=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[0]<l)l=ar[i];
			if(ar[0]>h)h = ar[i];
		}
		int res,mid;
		while(l<=h) {
			mid=(l+h)/2;
			if(isPossible(ar,mid,m,k)) {
				res = mid;
				h = m-1;
			}
			else l = m+1;
		}
		return m;
	}
	static boolean isPossible(int ar[],int mid,int m,int k) {
		int adj=0,bc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<=mid) {
				adj++;
				if(adj==k) {
				   bc++;
				   if(bc==m)return true;
				   adj=0;
				}
			}
			else adj=0;
		} 
		return false;
	}
	
    public static void main(String[] args) {
	
    	int ar[] = {1,10,3,9,2};
    	int m =3,k=2;
    	
    	System.out.println(minDayspossible(ar,m,k));
    	
    	
	}
}
