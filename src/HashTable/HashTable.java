package HashTable;

public class HashTable<K,V> {
	private HashNode Buckets[];
	private int sizeOfBucket;
	private int size;
	private class HashNode<K,V>{
		private K key;
		private V Value;
		private HashNode next;
		public HashNode(K key,V Value) {
			this.key=key;
			this.Value=Value;
		}
	}
	
	public HashTable() {
		this(10);
	}
	public HashTable(int capacity) {
		this.sizeOfBucket= capacity;
	    Buckets = new HashNode[sizeOfBucket];
	    this.size=0;
	}
 
	public int size() {
    	return size;
    }
    public boolean isEmpty() {
    	return size==0;
    }
	public void put(K key,V value) {
    	int index =  getKey(key);
    	HashNode<K,V> head = Buckets[index];
    	for(;head!=null;head = head.next) {
    		if(head.key==key){
    			return;
    		}
    	}
    	head = Buckets[index];
    	HashNode<K, V> Node= new HashNode(key, value);
    	Node.next=head;
    	Buckets[index]=Node;
    	size++;
    	}
	
    private int getKey(K Key) {
    	char Char[]=Key.toString().toCharArray();
    	long k=0;
    	int n = Char.length-1;
    	int num=27;
    	for(int i=n;i>=0;i--) {
    		char c = Char[i];
    		if(c>='a'&&c<='z') {
    			if(i==n)k=c-'a';
    			else {
    				k+=(c-'a')*n;
    				n*=n;
    			}
    		}
    		else {
    			if(i==n)k=c-'0';
    			else {
    				k+=(c-'0')*n;
    				n*=n;
    			}
    		}
    	}
    return (int)((long)k%sizeOfBucket);
    }
    
    public V getValue(K key) {
    	int index = getKey(key);
    	HashNode head = Buckets[index];
    	while(head!=null) {
    		if(head.key==key)return (V)head.Value;
    		head=head.next;
    	}
    	return null;
    }
    public V removeKey(K key) {
    	int index = getKey(key);
    	HashNode head = Buckets[index];
    	HashNode prev=null;
    	
    	while(head!=null) {
    		if(head.key==key) break;
    	    prev=head;
    		head=head.next;
    	}
    	if(head==null)return null;
    	if(prev!=null) prev.next=head.next;
    	else Buckets[index]=head.next;
    	size--;
    	return (V) head.Value;
    }
    public void print() {
    	for(int i=0;i<sizeOfBucket;i++) {
    	HashNode<K, V> head=Buckets[i];
    	while(head!=null) {
    		System.out.print(head.key+" "+ head.Value+" ");
    		head=head.next;
    	}
    	}
    	System.out.println();
    }
}












