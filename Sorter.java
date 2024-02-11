class lab03 {
	public static void main(String[] args) {
		System.out.println("testing...");
	}

	public static void sort(int[] array) {
		// selectionSort(array);
	}

	private static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; ++i) {
			int key = array[i];
			int j = i - 1;

			// Move elements of array[0..i-1], that are greater than key,
			// to one position ahead of their current position
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
}
