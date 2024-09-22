import java.util.Arrays;

public class Practice {
	
	public static int[] plusOne(int digits[]) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
	public static void main(String[] args) {
		
		for(int i:plusOne(new int[]{1,9,7,9})) System.out.print(i+" ");
		System.out.println();
		
	    int arr[] = new int[] {3,2,8,5,6,9};
	    Arrays.sort(arr);
	}

}
