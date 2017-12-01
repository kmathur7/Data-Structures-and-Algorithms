public class Mergesort {

	public static void mergeSort(int[] arr) {
		int[] finalArr = new int[arr.length];
		mergeSort(arr, finalArr, 0, arr.length - 1);
	}	

	private static void mergeSort(int[] arr, int[] finalArr, int left, int right) {
		if(left >= right) {
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(arr, finalArr, left, mid);
		mergeSort(arr, finalArr, mid + 1, right);
		merge(arr, finalArr, left, mid + 1, right);
	}

	public static void merge(int[] arr, int[] finalArr, int leftPos, int rightPos, int rightBound) {
		int leftBound = leftPos;
		int mid = rightPos - 1;
		int toIndex = 0;
		int numberOfItems = rightBound - leftPos + 1;
		while (leftPos <= mid && rightPos <= rightBound) {
			if(arr[leftPos] < arr[rightPos]) {
				finalArr[toIndex++] = arr[leftPos++];
			} else {
				finalArr[toIndex++] = arr[rightPos++];
			}
		}
		while(leftPos <= mid) {
			finalArr[toIndex++] = arr[leftPos++];
		}
		while(rightPos <= rightBound) {
			finalArr[toIndex++] = arr[rightPos++];
		}
		for (int j = 0; j < numberOfItems; j++) {
			arr[leftBound + j] = finalArr[j];
		}

	}
}