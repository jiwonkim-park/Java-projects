package ds.sort;

public class InsertionSorter<K extends Comparable<? super K>> {

	/**
	 * Sorts the elements in given array from `left` to `right` in lexicograph order using insertion sort algorithm.
	 */
	
	public void sort(Pair<K, ?>[] array, int left, int right) {
		// Fill your code to sort the elements in `array`.
		
		for (int i = left+1; i <= right; i++) {
			for (int j = i; (j > left) && (array[j].getKey().compareTo(array[j-1].getKey()) < 0); j--){
				swap(array, j, j-1);
			}
		}
	}
		
	// Hint: Maybe you need to create the helper methods.
	
	private void swap(Pair<K, ?>[] array, int i, int j) {
		Pair<K, ?> temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}