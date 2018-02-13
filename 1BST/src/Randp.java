public class Randp {
	private int[] nums;
	private int numsLeft;


	public Randp(int n) {
		this.numsLeft = n;
		initNums(n);
	}

	private void initNums(int n) {
		this.nums = new int[numsLeft];
		for (int i = 0; i < numsLeft; i++){
			nums[i] = i + 1;
		}
	}

	public int nextInt() {

		if (numsLeft <= 0) { 
			System.out.println(0);
			return 0; 
		}
		
		int randomIndex = (int) Math.floor(Math.random() * numsLeft); 
		int randomNum = nums[randomIndex];
		int lastIndex = numsLeft - 1;
		int lastInt = nums[lastIndex];
		nums[lastIndex] = randomNum; //number picked
		nums[randomIndex] = lastInt;

		numsLeft -= 1;
		return randomNum;
	}

}