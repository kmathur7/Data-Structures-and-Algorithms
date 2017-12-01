public class Quicksort {
	public static void sort(int[] unsorted) {
		sort(unsorted, 0, unsorted.length - 1);
	}
	private static void sort(int[] unsorted, int left, int right) {
		if (right - left <= 0) {
			return;
		}
		int pivot = unsorted[right];
		int partition = partition(unsorted, left, right, pivot);
		sort(unsorted, left, partition - 1);
		sort(unsorted, partition, right);
	}
	private static int partition (int[] arr, int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;
		while (true) {
			while (arr[++leftPointer] < pivot);
			while (rightPointer > 0 && arr[--rightPointer] > pivot);
			if (leftPointer >= rightPointer) {
				break;
			}
			swap(arr, leftPointer, rightPointer);
		}
		swap(arr, leftPointer, right);
		return leftPointer;
	}
	private static void swap(int[] arr, int one, int two) {
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
}