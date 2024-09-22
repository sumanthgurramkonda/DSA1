package swaping;

public class Transposeofmatrix {
	
	static void Transpose(int ar[][]) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar[0].length;j++) {
				int temp = ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]= temp;
			}
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
        	  System.out.println();
              Transpose(ar);
        	  for(int i=0;i<ar.length;i++) {
        		  for(int j=0;j<ar[0].length;j++) 
        			  System.out.print(ar[i][j]+" ");
        		  System.out.println();
              }
        	  
		}
}
