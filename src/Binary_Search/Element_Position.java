package Binary_Search;

public class Element_Position {
   public static void main(String[] args) {
	   
	   int ar[]= {1,4,4,4,4,4,4,4,4};
	   int l=0,h=ar.length,m=0;
	   int k = 4;
	   
	   while(l<=h) {
		   m=(h+l)/2;
		   if(ar[m-1]!=k && ar[m]==k) {
			   break;  
		   }
		   else if(ar[m]<k)l= m+1;
		   else h=m-1;
	   }
	   System.out.println(m+1);
	   while(ar[m]==k && m<ar.length-1)m++;
	   if(m==ar.length-1)m++;
	   System.out.println((m));
	   
   }
}
