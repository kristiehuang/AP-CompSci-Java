
public class MergeSort {

	public static void main(String[] args) {

		int[] array = { 6, 5, 2, 1, 3 };

		mergeSort(array);

	}

	public static String toPrint(int[] arr) {
		String printArr = "sort: ";
		for (int a: arr) {
			printArr = printArr + a + ", ";
		}
		System.out.println(printArr);
		return printArr;
	}

	public static int[] mergeSort(int[] a) {
		int[] returnArr;

		if (a.length == 1) {
			returnArr = a;
		}
		else {
			returnArr = merge((mergeSort(partitionLeft(a))), (mergeSort(partitionRight(a))));
			//sort left; sort right; merge in sorted order
		}

		System.out.println("merge");
		toPrint(returnArr);
		return returnArr;
	}

	public static int[] merge(int[] left, int[] right) {
		int totalLength = left.length + right.length;
		int[] sorted = new int[totalLength];

		if (left == null) {
			return right;
		}
		else if (right == null) {
			return left;
		}
		
		else if (left[0] < right[0]) {
			sorted[0] = left[0];

			for(int i = 0; i < totalLength; i++) {
				merge (cdr l1) l2) ; 
			}
			return sorted;
		}
		else { //if right[0] < left[0] OR two values are same

			sorted[0] = right[0];

			for(int i = 0; i < totalLength; i++) {
				(merge l1 (cdr l2)) ;
			}
			return sorted;
		}

	}

	public static int[] partitionLeft(int[] arr) {

		int numElements = (arr.length / 2); //IF IT ROUNDS DOWN
		System.out.println(numElements);
		int[] leftArr = new int[numElements];

		for(int i = 0; i < numElements; i++) {
			leftArr[i] = arr[i];
		}

		return leftArr;
	}

	public static int[] partitionRight(int[] arr) {
		int numElements = (arr.length / 2) + 1;
		int[] rightArr = new int[numElements];

		for(int i = 0; i < numElements; i++) {
			rightArr[i] = arr[numElements-1 + i];
		}

		return rightArr;
	}

}
