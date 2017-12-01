
public class Driver {
	
	public static void main(String[] args) {
		int[] array = {5, 7, 4, 2, 9, 66, 22, 6, 11, 33};
		System.out.println("Original Array");
		display(array);
		Quicksort.sort(array);
		System.out.println("\nSorted Array");
		display(array);
		System.out.println("\nArray is sorted? " + isSorted(array));
	}

	public static boolean isSorted(int[] arr) {
		return isSorted(arr, 0, arr.length - 1);
	}
	private static boolean isSorted(int[] arr, int low, int high) {
		for (int i = low + 1; i <= high; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
	public static void display(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}