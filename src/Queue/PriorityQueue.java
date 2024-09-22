package Queue;

class MaxPQ{
	private Integer heap[];
	int n;
	public MaxPQ(int capacity) {
	 heap = new Integer[capacity+1];
	}
	public void insert(int value) {
		
		if(n==heap.length-1) {
		     resize(2*heap.length);
		}
		n++;
		heap[n]=value;
		swim(n);
	}
	public void swim(int n) {
		while(n>1 && heap[n/2]<heap[n]) {
			int temp = heap[n];
			heap[n]=heap[n/2];
			heap[n/2]=temp;
			n/=2;
		}
	}
	public void resize(int size) {
		Integer ar[]= new Integer[size];
		for(int i=1;i<heap.length;i++) {
			ar[i]=heap[i];
		}
		heap=ar;
	}
	void print() {
		for(int i=1;i<=n;i++)System.out.print(heap[i]+" ");
	}
	int deleteMax() {
		int max = heap[1];
		heap[1]=heap[n];
		heap[n]=null;
		n--;
		int k = 1;
		int l=k*2;
		int r=k*2+1;
		while(l<=n&&r<=n) {
			int temp=heap[k];
			if(heap[l]!=null&&heap[r]!=null&&heap[l]<heap[r]) {
				heap[k]=heap[r];
				heap[r]=temp;
				k=k*2+1;
			}
			else if(heap[l]!=null&&heap[r]!=null) {
				heap[k]=heap[l];
				heap[l]=temp;
				k=k*2;
			}
			else break;
			l=k*2;
			r=k*2+1;
		}
		return max;
	}
	public boolean isEmpty() {
		return n==0;
	}
	public int size() {
		return n;
	}
}
public class PriorityQueue {
	
	public static void main(String[] args) {
		
		MaxPQ mpq = new MaxPQ(3);
		mpq.insert(9);
		mpq.insert(6);
		mpq.insert(3);
		mpq.insert(2);
		mpq.insert(1);
		mpq.insert(5);
		mpq.insert(4);
		System.out.println(mpq.isEmpty());
		System.out.println(mpq.size());
		mpq.print();
		System.out.println();
		System.out.println(mpq.deleteMax());
		mpq.print();
	}

}
