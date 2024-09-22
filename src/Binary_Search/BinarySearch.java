package Binary_Search;



public class BinarySearch {
	   static int ascbinarySearch(int ar[],int n) {
		   
		   int l=0,h=ar.length-1,m;
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
      static int descbinarySearch(int ar[],int n) {
		   
		   int l=0,h=ar.length-1,m;
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
    	 int ar[] = {9,7,6,5,3,2,1};
    	 int n = 3;
    	// System.out.println(ascbinarySearch(ar,n)); 
    	 System.out.println(descbinarySearch(ar,n));
    	 
    	
	}
     
}
