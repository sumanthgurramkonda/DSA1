package Binary_Search;

public class count_smaller_equal_num {
	static int countSamllEqualNum(int ar[],int k) {
		int m,l=0,h=ar.length-1;
		while(l<h) {
			m = (l+h)/2;
			if(ar[m]==k) {
				while(ar[m]==ar[m+1] && (m+1)<ar.length-1)m++;
				return m+1;
			}
			else if(ar[h]==k)return h+1;
			else if(ar[l]==k && ar[l+1]!=k)return l+1;
			else if(ar[m]>k)h = m-1;
			else l=m+1;
		}	
		return -1;
	}
	public static void main(String[] args) {
		int ar[] = {1,1,2,2,2,3,3,6,6,10};
		int n = 6 ;
		System.out.println(countSamllEqualNum(ar,n)); 
	}

}
