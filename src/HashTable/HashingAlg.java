package HashTable;

public class HashingAlg {
	public static void main(String[] args) {
		HashTable<String, String> ht = new HashTable();
		
		ht.put("apple", "John");
		ht.put("bat", "Sumanth");
		System.out.println(ht.getValue("apple"));
		System.out.println(ht.getValue("bat"));
		System.out.println(ht.size());
		ht.print();
		System.out.println(ht.removeKey("apple"));
		System.out.println(ht.getValue("bat"));
		System.out.println(ht.size());

	}

}
