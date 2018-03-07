
public class Sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 4, 5, 1, 3, 2 };

		int[] array2 = { 4, 5, 1, 3, 2 };

		int[] array3 = { 4, 5, 1, 3, 2 };

		int[] array4 = { 4, 5, 1, 3, 2 };

		//fill array w numbers

		bubbleSort(array1);
		insertSort(array2);
		selectionSort(array3);

		median(array4);

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
	// QUICK SORT


	void quicksort(int[] a) {
		quick(a, 0, a.length-1);
	}

	void quick(int[] a, int left, int right) {
		if (right > left) { //if last index is bigger than 0
			int pivotPos = partition(a, left, right);

			quick(a, left, pivotPos-1);
			quick(a, pivotPos+1, right);
		}
	}

	static int partition(int[] a, int left, int right) {
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

	void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}



	public static double median(int[] a) {
		double median = medianQuick(a, 0, a.length-1);

		System.out.println("median " + median);
		return median;
	}

	static double medianQuick(int[] a, int left, int right) {

		if (right > left) {
			int pivotPos = partition2(a, left, right);
			int middle = a.length/2;

			if (a.length % 2 == 1) { //if odd, 1 middle
				if (pivotPos == middle) return (a[middle]);
			} 


			else {  // Even number of elements, 2 middles
				// pivotPos == middle looks like xxxxxPxxxx
				if (pivotPos == middle) {
					if (middle == left) return a[middle];
					else return (a[middle] + select(a, left, middle-1, 1)) / 2.0;

					// pivotPos == middle - 1 looks like xxxxPxxxxx
				} else if (pivotPos == middle - 1) {
					if (middle == right) return a[middle];
					else return (a[middle-1] + select(a, middle, right, 0)) / 2.0;
				}
			}


			//if pivot pos is NOT = middle, so we sort left/right

			if (pivotPos < middle) {
				return medianQuick2(a, pivotPos+1, right);
			} else {
				return medianQuick2(a, left, pivotPos-1);
			}
			// If we ever get to a situation where we are "sorting" one element,
			// it must be a middle element
		} else {
			return a[left];
		}
	}


	//teacher solution
	public static double medianQuick2(int[] a, int left, int right) {
		if (right > left) {
			int pivotPos = partition2(a, left, right);
			int middle = a.length/2;


			if (a.length % 2 == 1) { //odd length
				if (pivotPos == middle) return (a[middle]);
			} else {  // Even number of elements
				// Once one of the two middle indices has been found, borrow from
				// selection sort and select either the minimum value from the right
				// side or the maximum value from the left side, depending on which side
				// does not contain the found middle index.
				//
				// pivotPos == middle looks like xxxxxPxxxx
				if (pivotPos == middle) {
					if (middle == left) return a[middle];
					else return (a[middle] + select(a, left, middle-1, 1)) / 2.0;

					// pivotPos == middle - 1 looks like xxxxPxxxxx
				} else if (pivotPos == middle - 1) {
					if (middle == right) return a[middle];
					else return (a[middle-1] + select(a, middle, right, 0)) / 2.0;
				}
			}

			// Here is where we make sure to "sort" the elements that move us
			// towards the median element(s)
			if (pivotPos < middle) {
				return medianQuick2(a, pivotPos+1, right);
			} else {
				return medianQuick2(a, left, pivotPos-1);
			}
			// If we ever get to a situation where we are "sorting" one element,
			// it must be a middle element
		} else {
			return a[left];
		}
	}


	static int partition2(int[] a, int left, int right) {
		int splitPos = left;  //0
		for (int i = left; i < right; i++) {  //i = 0, right = last index
			if (a[i] < a[right]) {
				swap2(a, i, splitPos);
				splitPos++;
			}
		}
		swap2(a,splitPos,right);
		return splitPos;
	}

	static void swap2(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


	public static int[] heapSort(int[] arr) {
		
		int[] a = buildHeap(arr, arr.length - 1);
		System.out.println("heap");
		toPrint(a);

		return a;

	}

	private static int[] buildHeap(int[] a, ??int parentIndex,?? int lastIndex) { //TRICKLE and sort so biggest number is at top


		for(int num = lastIndex; num >= 0; num--) {
			int leftChild = 2*num + 1;
			int rightChild = 2*num + 2;

			if (leftChild <= lastIndex) { //parent DOES have children

				boolean rightChildExists = rightChild <= lastIndex;
				
				if (num < a[leftChild]) { //if leftchild > num & *broken*fix*leftchild > rightchild***
					//swap num and leftchild
					int temp = a[num];
					a[num] = a[leftChild];
					a[leftChild] = temp;

					buildHeap(a, leftChild, lastIndex);

					//a[leftChild] has children? rebuild heap
				}
				else if (rightChildExists && (num < a[rightChild])) { //parent has rightChild at all AND rightchild > num AND ***rightchild > leftchild***
					//swap num and rightchild
					int temp = a[num];
					a[num] = a[rightChild];
					a[rightChild] = temp;
				}
				//else num is greater and stays in place
			}

		}

		if (a.length != 1) {
			sortHeap(a); }
		else { //one element left,
			return a;
		}


	}
	private static void sortHeap(int[] a) { //swap biggest and last unsorted num,
		int lastIndex = a.length - 1;
		//swap first and biggest unsorted
		int temp = a[0];
		a[0] = a[lastIndex];
		a[lastIndex] = temp;
		
		
		//very last index is sorted!! now retrickle w first to second to last index

		buildHeap(a, 0, lastIndex - 1); //retrickle


	}


}
