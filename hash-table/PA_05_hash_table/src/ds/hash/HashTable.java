package ds.hash;

public class HashTable {
	Integer[] table;
	int c1, c2, c3;
	int marker = -1; // special marker for deletion
	
	public HashTable(int n) {
		// fill your code
		table = new Integer[n];
	}

	public void Create(int c1, int c2, int c3){
		// fill your code
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	public void Insert(Integer key){
		// fill your code
		int home = key % 1009;
		int i = 1;
		if (table[home] == null || table[home].equals(marker)) {
			table[home] = key;
			System.out.println("INSERT: " + key+ " / INDEX: " + home);
		} else {
			int hash = home;
			while(table[hash] != null) {
				hash = (home + (c1 * i * i) + (c2 * i) + c3) % 1009;
				i++;
			}
			table[hash] = key;
			//System.out.println(table[hash]);
			System.out.println("INSERT: " + key +" / INDEX: " + hash);
		}
	}

	public void Delete(Integer key){
		// fill your code
		int home;
		int hash = home = key % 1009;
		//int i = 1;
		for (int i = 1; (table[hash] != null) && (!table[hash].equals(key)); i++) {
			int probe = (c1 * i * i) + (c2 * i) + c3;
			hash = (home + probe) % 1009;
		}
		if (table[hash] == null) {
			System.out.println("Failed to find " + key + ".");
		} else {
			table[hash] = marker;
			System.out.println("DELETE: " + key + " / INDEX: " + hash);
		}
	}
	
	public void Search(Integer key){
		// fill your code
		int home;
		int hash = home = key % 1009;
		//System.out.println(hash);
		//System.out.println(table[hash]);
		for (int i = 1; (table[hash] != null) && (!table[hash].equals(key)); i++) {
			int probe = (c1 * i * i) + (c2 * i) + c3;
			hash = (home + probe) % 1009;
		}
		if (table[hash] == null) {
			System.out.println("Failed to find " + key + ".");
		} else {
			System.out.println("SEARCH: " + key + " / INDEX: " + hash);
		}
	}
}
