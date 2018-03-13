
public class Sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 4, 5, 1, 3, 2 };

		int[] array2 = { 4, 5, 1, 3, 2 };

		int[] array3 = { 4, 5, 1, 3, 2 };

		int[] array4 = { 3, 6, 1, 4, 2, 10, 7, 9, 8, 5 };

		//fill array w numbers

		bubbleSort(array1);
		insertSort(array2);
		selectionSort(array3);
		heapSort(array4);

		//median(array4);

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
	//	// QUICK SORT


	public void quicksort(int[] a) {
		quick(a, 0, a.length-1);
	}

	public void quick(int[] a, int left, int right) {
		if (right > left) { //if last index is bigger than 0
			int pivotPos = partition(a, left, right);

			quick(a, left, pivotPos-1);
			quick(a, pivotPos+1, right);
		}
	}

	public int partition(int[] a, int left, int right) {
		int splitPos = left; //1
		for (int i = left; i < right; i++) { //index from 0
			if (a[i] < a[right]) {
				swap(a, i, splitPos);
				splitPos++;
			}
		}
		swap(a,splitPos,right);
		return splitPos;
	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}



	public static double median(int[] a) {
		return median(a, 0, a.length-1);
	}

	public static double median(int[] a, int left, int right) {
		int pivotPos = partition2(a, left, right);
		int middle = a.length/2;
		if (right > left){
			if (a.length % 2 == 1){
				if (pivotPos == middle){
					return (a[middle]);
				} else {
					if (pivotPos == middle){
						if (middle == left){
							return a[left];
						} else {
							return (a[middle] + minmax(a, left, middle - 1, 1)) / 2.0;
						}
					}
					if (pivotPos == middle - 1){
						if (middle == right){
							return a[right];
						} else {
							return (a[middle - 1] + minmax(a, middle, a.length - 1, 0)) / 2.0;
						}
					}
					if (pivotPos < middle){
						return median(a, pivotPos + 1, right);
					} else {
						return (median(a, left, pivotPos - 1));
					}
				}
			}
		}
		return a[middle];
	}

	public static int partition2(int[] a, int left, int right) {
		int splitPos = left;
		for (int i = left; i < right; i++) {
			if (a[i] < a[right]) {
				swap2(a, i, splitPos);
				splitPos++;
			}
		}
		swap2(a,splitPos,right);
		return splitPos;
	}

	public static void swap2(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int minmax(int[] a, int left, int right, int num){
		int init = a[left];
		if (num == 0){ //min
			for (int i = 0; i <= right; i++){
				if (a[i] < init){
					init = a[i];
				}
			}
		}
		if (num == 1){ //max
			for (int i = 0; i <= right; i++){
				if (a[i] > init){
					init = a[i];
				}
			}
		}
		return init;
	}




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

			trickle(a, num, lastIndex); //retrickle whole thing
		}

	}


	public static void trickle(int[] a, int num, int lastIndex) { //num = parent index

		int leftChild = 2*num + 1;
		int rightChild = 2*num + 2;

		boolean leftChildExists = leftChild <= lastIndex;
		boolean rightChildExists = (rightChild <= lastIndex);

		if (leftChildExists) { //parent DOES have children at all


			if (rightChildExists) {

				if ((a[leftChild] > a[rightChild]) && (num < a[leftChild])) { //left>right + num < leftchild

					int temp = a[num];
					a[num] = a[leftChild];
					a[leftChild] = temp;

					trickle(a, leftChild, lastIndex); //recheck if parent has any children now
				}
				else if ((a[leftChild] < a[rightChild]) && (num < a[rightChild])) { //right>left + num < rightChild
					int temp = a[num];
					a[num] = a[rightChild];
					a[rightChild] = temp;

					trickle(a, rightChild, lastIndex); //recheck if parent has any children now
				}
			}

			else { //no right child. left child only.
				if (num < a[leftChild]) { //if leftchild > num

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
