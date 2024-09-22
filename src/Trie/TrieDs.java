package Trie;

public class TrieDs {
	public static void main(String[] args) {
		
		Trie t = new Trie();
		
		t.isert("There");
		t.isert("Their");
		System.out.println(t.search("There"));
		System.out.println(t.search("Their"));
		t.print();
	}

}
