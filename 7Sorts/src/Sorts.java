
public class Sorts {

	public static void main(String[] args) {
		
		int[] array1 = { 2, 32, 91, 4, 4, 6, 11 };
		int[] array2 = { 2, 32, 91, 4, 4, 6, 11 };
		int[] array3 = { 2, 32, 91, 4, 4, 6, 11 };
		int[] array4 = { 2, 32, 91, 4, 4, 6, 11 };
		

		bubbleSort(array1);
		insertSort(array2);
		selectionSort(array3);
		heapSort(array4);

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


	//HEAP SORT IS BROKEN FOR NOW
	public static int[] heapSort(int[] arr) {

		//arr is permanent place in memory so u can just modify it!!

		buildHeap(arr);
		sortHeap(arr);


		System.out.println("heap");
		toPrint(arr);

		return arr;

	}

	private static void buildHeap(int[] a) { //TRICKLE and sort so biggest number is at top


		int lastIndex = a.length - 1;
		for(int num = lastIndex; num >= 0; num--) {
			trickle(a, num, lastIndex);
		}
		


	}
	private static void sortHeap(int[] a) { //swap biggest and last unsorted num,

		int lastIndex = a.length - 1;
		for(int num = lastIndex; num >= 0; num--) {

			//swap first and biggest unsorted
			int temp = a[0];
			a[0] = a[num];
			a[num] = temp;

			//very last index is sorted!! now retrickle w first to second to last index
			lastIndex--;
			trickle(a, 0, lastIndex); //retrickle whole thing
		}

	}


	public static void trickle(int[] a, int num, int lastIndex) { //num = parent index

		int leftChild = 2*num + 1;
		int rightChild = 2*num + 2;
		
		boolean leftChildExists = (leftChild <= lastIndex);
		boolean rightChildExists = (rightChild <= lastIndex);

		if (leftChildExists) { //parent DOES have children at all


			if (rightChildExists) {

				if ((a[leftChild] > a[rightChild]) && (a[num] < a[leftChild])) { //left>right + num < leftchild

					int temp = a[num];
					a[num] = a[leftChild];
					a[leftChild] = temp;

					trickle(a, leftChild, lastIndex); //recheck if parent has any children now
				}
				else if ((a[leftChild] < a[rightChild]) && (a[num] < a[rightChild])) { //right>left + num < rightChild
					int temp = a[num];
					a[num] = a[rightChild];
					a[rightChild] = temp;

					trickle(a, rightChild, lastIndex); //recheck if parent has any children now
				}
			}

			else { //no right child. left child only.
				if (a[num] < a[leftChild]) { //if leftchild > num

					//swap num and leftchild
					int temp = a[num];
					a[num] = a[leftChild];
					a[leftChild] = temp;

					trickle(a, leftChild, lastIndex);
				}
			}
		}
		//toPrint(a);
	}


}
