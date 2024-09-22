package LIked_List;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListAlg {
	    
	public static void addTwoNum() {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		
		l1.add(2);
		l1.add(4);
		l1.add(3);
		
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(9);
		
		Iterator itr1 = l1.iterator();
		Iterator itr2 = l2.iterator();
		int res=0;
		int sum=0;
		while(itr1.hasNext()&&itr2.hasNext()) {
			sum=(int)itr1.next()+(int)itr2.next()+res;
			l3.add(sum%10);
			res=sum/10;
		}
		while(itr1.hasNext()) {
			sum=(int)itr1.next()+res;
			l3.add(sum%10);
			res=sum/10;
		}
		while(itr2.hasNext()) {
			sum=(int)itr2.next()+res;
			l3.add(sum%10);
			res=sum/10;
		}
		if(res!=0)l3.add(res);
		
		System.out.println(l3);
	}
	
	public static void findInterSectionPoin() {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
	}
	
	public static void main(String[] args) {
		
		   addTwoNum();

	}

}




