package Binary_Search;

public class WoodCutting {
	
	public static void main(String[] args) {
		
		int ar[]= {20,15,10,17};
		int b =8;
		
	    System.out.println(woodCutting(ar,b));	
	}

	
	static int woodCutting(int ar[],int b) {
		int max = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) max = ar[i];
		}
		int l = 0;
		int m=0;
		int wc = 0,h=max;
		
		while(l<=h) {
			m = (l+h)/2;
			wc = woodCount(ar,m);
			if(wc==b || l==m) return m;
			else if(wc>b)l=m;
			else h=m;
		}
		return -1;
	}
	
	static int woodCount(int ar[],int m){
		int wc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>m)wc+=ar[i]-m;
		}
		return wc;
		
	}
}
