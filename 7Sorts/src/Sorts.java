
public class Sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[5];
		array[0] = 5;
		array[1] = 4;
		array[2] = 1;
		array[3] = 3;
		array[4] = 2;

		//fill array w numbers

		bubbleSort(array);
		insertSort(array);
		selectionSort(array);

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
				//toPrint(arr);
			}

		}
		
		System.out.println("bubble");
		toPrint(arr);

		return arr;
	}

	public static int[] insertSort(int[] arr) { //set first item to Sorted. then,, new first item, compare w/ sorted. swap/insert into correct place in Sorted array


		//		if (arr[nexttt] == null) {
		//			return arr;
		//		}
		//		else {
		//			int first = arr[0];
		//			arr[0] = arr[1];
		//			arr[1] = first;
		//
		//			insertSort(arr minus first one);
		//		}

		return arr;
	}


	public static int[] selectionSort(int[] arr) { //iterate to find and store the shortest, then swap with first
		int shortest = 0;

		return arr;

	}


}
