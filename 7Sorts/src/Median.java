
public class Median {
	public static void main(String[] args) {
		int[] array = { 1, 13 };

		//fill array w numbers

		median(array);
	}


	public static double median(int[] a) {
		if (a.length > 1) {
			double sorted = medianQuick(a, 0, a.length - 1);
			System.out.println(sorted);
			return sorted;
		}
		else {
			System.out.println(a[0]);
			return a[0];
		}

	}

	public static double medianQuick(int[] a, int left, int right) {
		int pivotPos = partition2(a, left, right);
		int middle = a.length/2;
		
		if (right > left){
			if (a.length % 2 == 1){ //odd
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
						return medianQuick(a, pivotPos + 1, right);
					} else {
						return medianQuick(a, left, pivotPos - 1);
					}
				}
			}

		}
		
		//if doesnt return in odd; then it must be even.
		return (double) (a[middle] + a[middle - 1]) / 2;

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



}
