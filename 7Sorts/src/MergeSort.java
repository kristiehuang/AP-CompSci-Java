
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
		int[]returnArr = ms(a);
		toPrint(returnArr);
		return returnArr;
	}


	public static int[] ms(int[] a) {
		if (a.length == 1) {
			return a;
		}
		else {
			return merge((ms(partitionLeft(a))), (ms(partitionRight(a))));
			//sort left; sort right; merge in sorted order
		}

	}

	public static int[] merge(int[] left, int[] right) {
	    int totalLength = left.length + right.length;
		int[] sorted = new int[totalLength];

		if (left.length == 0) {
			return right;
		}
		else if (right.length == 0) {
			return left;
		}
        else {
            int l = 0;
            int r = 0;
            for(int i = 0; i < totalLength; i++) {
			    if (r == right.length || (l != left.length && left[l] < right[r])) { //left smaller than right *

					sorted[i] = left[l];
					l++;
				} else { 
					sorted[i] = right[r];
					r++;
				}
			}
			return sorted;
        }
	}
	
	public static int[] partitionLeft(int[] arr) {
        
		int numElements = (arr.length / 2);
		int[] leftArr = new int[numElements];

		for(int i = 0; i < numElements; i++) {
			leftArr[i] = arr[i];
		}

		return leftArr;
	}

	public static int[] partitionRight(int[] arr) {

		int numElements;
		if (arr.length % 2 == 1) { //odd
			numElements = (arr.length / 2) + 1;
		}
		else { //even
			numElements = arr.length / 2;
		}
		int[] rightArr = new int[numElements];
		for(int i = 0; i < numElements; i++) {			
			rightArr[i] = arr[arr.length /2 + i];
		}

		return rightArr;
	}


}
