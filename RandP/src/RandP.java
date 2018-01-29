public class RandP {
	private int[] nums;
	private int numsLeft;


	public RandP(int n) {

		numsLeft = n;

		nums = new int[numsLeft];
		for (int i = 0; i < numsLeft; i++){
			nums[i] = i + 1;
			System.out.println(i);
		}


		System.out.println(nums);

	}

	private void initNums(int n) {
		//YOUR_CODE_HERE
	}

	public int nextInt() {
		// Math.random() should never be called more than once
		// when this method is called.  Recursion is not allowed.
		//YOUR_CODE_HERE
		//constant order of growth
		return 23;
	}


}