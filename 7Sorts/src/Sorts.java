
public class Sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[5];
		array1[0] = 4;
		array1[1] = 5;
		array1[2] = 1;
		array1[3] = 3;
		array1[4] = 2;

		int[] array2 = new int[5];
		array2[0] = 4;
		array2[1] = 5;
		array2[2] = 1;
		array2[3] = 3;
		array2[4] = 2;

		int[] array3 = new int[5];
		array3[0] = 4;
		array3[1] = 5;
		array3[2] = 1;
		array3[3] = 3;
		array3[4] = 2;
		//fill array w numbers

		bubbleSort(array1);
		insertSort(array2);
		selectionSort(array3);

	}

	public static String toPrint(int[] arr) {
		String printArr = "sort: ";
		for (int a: arr) {
			printArr = printArr + a + ", ";
		}
		System.out.println(printArr);
		return printArr;
	}

	public static int[] bubbleSort(int[] arr) { //swap each one, one by one down the array

		if (arr != null) {
			for(int a = 0; a <= arr.length; a++) {
				for(int i = 0; i <= arr.length - a; i++) {
					if (i + 1 < arr.length) {

						int dis = arr[i];
						if (arr[i] > arr[i + 1]) { 
							arr[i] = arr[i + 1];
							arr[i + 1] = dis;
						}
					}
				}
			}
		}

		System.out.println("bubble");
		toPrint(arr);

		return arr;
	}

	public static int[] insertSort(int[] arr) { //set first item to Sorted. then,, new first item, compare w/ sorted. swap/insert into correct place in Sorted array

		if (arr != null) {
			for(int a = 0; a < arr.length; a++) {
				int toSort = arr[a];

				for(int i = a; i > 0; i--) {
					int nextInt = arr[i - 1];
					if (nextInt > toSort) {
						arr[i - 1] = toSort;
						arr[i] = nextInt;
					}
				}
			}
		}

		System.out.println("insertion");
		toPrint(arr);

		return arr;
	}


	public static int[] selectionSort(int[] arr) { //iterate to find and store the shortest, then swap with first

		if (arr != null) {
			for(int a = 0; a < arr.length; a++) {
				int thisInt = arr[a];

				int swapPosition = 0;
				System.out.println("a" + a);

				//a = 3
				//i = 4
				//fix this DOES THE I FOR LOOP RUN AT ALL

				for(int i = a + 1; i < arr.length; i++) {
					int nextInt = arr[i];

					if (thisInt > nextInt) {

						thisInt = nextInt;
						System.out.println("i" + i);
						swapPosition = i;
					}           
				}
				

				arr[swapPosition] = arr[a];
				arr[a] = thisInt;
			}
		}

		System.out.println("selection");
		toPrint(arr);

		return arr;
		
	}


}
