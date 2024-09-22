package printingPatterns;

public class PrintingPatterns {
	
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int  k=0;k<i+1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
