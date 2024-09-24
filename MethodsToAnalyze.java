/**
 * A collection of methods that work with arrays of ints.
 * 
 * @author mvail
 */
public class MethodsToAnalyze {

	/**
	 * Return index where value is found in array or -1 if not found.
	 * @param array ints where value may be found
	 * @param value int that may be in array
	 * @return index where value is found or -1 if not found
	 */
	public static int find(int[] array, int value) { // empty: 2 | best: 3 | worst: 2 + n(3) | avg: (3 + n(3)) / 2
		// int = 1; 1
		// while (i < array.length); 2
		for (int i = 0; i < array.length; i++) { //n ( )
			if (array[i] == value) { // conditional n( 1 )
				return i;
			}
			// i++ 1
		}
		return -1;
	}

	/**
	 * Replace all occurrences of oldValue with newValue in array.
	 * @param array ints where oldValue may be found
	 * @param oldValue value to replace
	 * @param newValue new value
	 */
	public static void replaceAll(int[] array, int oldValue, int newValue) { // empty: 4 | best: 4 + n(3) | worst: 
		int index = find(array, oldValue); // 3
		while (index > -1) { // 1
			array[index] = newValue; //
			index = find(array, oldValue);
		}
	}
	
	/**
	 * Take an int[] and reorganize it so they are in ascending order.
	 * @param array ints that need to be ordered 
	 */
	public static void sortIt(int[] array) {
		for (int next = 1; next < array.length; next++) {
			int value = array[next];
			int index = next;
			while (index > 0 && value < array[index - 1]) {
				array[index] = array[index - 1];
				index--;
			}
			array[index] = value;
		}
	}
}
