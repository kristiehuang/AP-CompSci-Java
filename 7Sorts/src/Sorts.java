
public class Sorts {

	public static void main(String[] args) {
		
		int[] array1 = { 2, 32, 91, 4, 4, 6, 11 };
		int[] array2 = { 2, 32, 91, 4, 4, 6, 11 };
		int[] array3 = { 2, 32, 91, 4, 4, 6, 11 };
		

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
						}}}}
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
					}}}}

		System.out.println("insertion");
		toPrint(arr);
		return arr;
	}

	public static int[] selectionSort(int[] arr) { //iterate to find and store the shortest, then swap with first

		if (arr != null) {
			for(int a = 0; a < arr.length - 1; a++) {
				int min = a;

				for(int i = a + 1; i < arr.length; i++) {

					if (arr[min] > arr[i]) {
						min = i;
					}           
				}
				int thisInt = arr[min];
				arr[min] = arr[a];
				arr[a] = thisInt;
			}
		}

		System.out.println("selection");
		toPrint(arr);

		return arr;

	}



}
