
public class HeapSort {

	public static void main(String[] args) {

		int[] arr = { 2, 32, 91, 4, 4, 6, 11 };

		heapSort(arr);

	}

	public static String toPrint(int[] arr) {
		String printArr = "sort: ";
		for (int a: arr) {
			printArr = printArr + a + ", ";
		}
		System.out.println(printArr);
		return printArr;
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
