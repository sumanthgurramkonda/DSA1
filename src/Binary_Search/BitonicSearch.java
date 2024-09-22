package Binary_Search;

public class BitonicSearch {
	
	static int bitonicSearch(int ar[],int n) {
		int l=0,h=ar.length-1,m;
		while(l<=h) {
			m =(l+h)/2;
			if(ar[m]>ar[m-1] && ar[m]>ar[m+1]) {
				return m;
			}
			else if(ar[m]<ar[m+1]&&ar[m]>ar[m-1])l=m;
			else h=m;	
		}
		return -1;
		
	}
	static int asccbinarySearch(int ar[],int n,int h) {
		   
		   int l=0,m;
		   while(l<h) {
			   m=(l+h)/2;
			   if(n == ar[m]) return m;
			   else if(n==ar[l]) return l;
			   else if(n==ar[h]) return h;
			   else if(n>ar[m]) l=m+1;
			   else h = m-1;
		   }
		   return -1;
		   
   }
   static int desccbinarySearch(int ar[],int n,int l) {
		   
		   int h=ar.length-1,m;
		   while(l<h) {
			   m=(l+h)/2;
			   if(n == ar[m]) return m;
			   else if(n==ar[l]) return l;
			   else if(n==ar[h]) return h;
			   else if(n>ar[m]) h = m-1;
			   else l=m+1;
		   }
		   return -1;
		   
   }
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,6,7,10,9,8,5};
		int n = 10;
		int x =bitonicSearch(ar,n);
		int y=0;
		if(x!=-1) y =asccbinarySearch(ar,n,x);
		          
		if(y == -1 )
			System.out.println(desccbinarySearch(ar,n,x)); 
		
		else System.out.println(y);
	}

}
