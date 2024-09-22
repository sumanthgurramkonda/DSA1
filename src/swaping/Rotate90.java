package swaping;

public class Rotate90 {
	
	static void rotate90(int ar[][]) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar[0].length;j++) {
				int temp = ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=temp;
			}
		}
		int i=0,j=ar[0].length-1;
		while(i<j) {
			for(int k=0;k<ar.length;k++) {
				int temp = ar[k][i];
				ar[k][i]=ar[k][j];
				ar[k][j]=temp;
			}
			i++;
			j--;
		}
		
	}
	public static void main(String[] args) {
		
		  int ar[][]= {
    			  {1,2,3,4,5},
    			  {6,7,8,9,10},
    			  {11,12,13,14,15},
    			  {16,17,18,19,20},
    			  {21,22,23,24,25}
    	  };
    	  for(int i=0;i<ar.length;i++) {
    		  for(int j=0;j<ar[0].length;j++) 
    			  System.out.print(ar[i][j]+" ");
    		  System.out.println();
          }
    	  rotate90(ar);
    	  System.out.println();
    	  for(int i=0;i<ar.length;i++) {
    		  for(int j=0;j<ar[0].length;j++) 
    			  System.out.print(ar[i][j]+" ");
    		  System.out.println();
          }
    	  
    	  
	}

}
