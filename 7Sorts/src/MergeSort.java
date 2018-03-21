
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
		int[] returnArr;

		if (a.length == 1) {
			returnArr = a;
		}
		else {
			returnArr = merge((ms(partitionLeft(a))), (ms(partitionRight(a))));
			//sort left; sort right; merge in sorted order
		}

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

		//BRROOOOOKENENENN
		//BRROOOOOKENENENN

		//BRROOOOOKENENENN

		//BRROOOOOKENENENN
		//BRROOOOOKENENENN
		//BRROOOOOKENENENN
		//BRROOOOOKENENENN
		//BRROOOOOKENENENN
		//BRROOOOOKENENENN
		//BRROOOOOKENENENN

		else if (left[0] < right[0]) {
			sorted[0] = left[0];
			for(int i = 1; i < totalLength; i++) {

				for (int l = 0; l < left.length; l++) {
					for (int r = 0; r < right.length; r++) {

						if (left[l] < right[r]) { //left smaller than right
							sorted[i] = left[l];
						}
						else if (left[l] > right[r]) { 
							sorted[i] = right[r];
						}

					}

				}
			}
			return sorted;
		}
		else { //if right[0] < left[0] OR two values are same

			sorted[0] = right[0];
			for(int i = 1; i < totalLength; i++) {

				for (int l = 0; l < left.length; l++) {
					for (int r = 0; r < right.length; r++) {

						if (left[l] < right[r]) { //left smaller than right
							sorted[i] = left[l];
						}
						else if (left[l] > right[r]) { 
							sorted[i] = right[r];
						}

					}

				}
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
		System.out.println("num"+numElements);
		for(int i = 0; i < numElements - 1; i++) {
			System.out.println("i"+i);
			rightArr[i] = arr[numElements-1 + i];
		}

		return rightArr;
	}

}
