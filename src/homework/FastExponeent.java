package homework;

public class FastExponeent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fastExpt(2, 3);


	}
	public static void fastExpt(int b, int n) {
		int product = 1;

		while(n > 0) {
			if (n % 2 == 0) {
				int newB = (int) Math.pow(b, 2);
				fastExpt(newB, (n/2));
			}
			else {
				product = product * b;
				n--;
				fastExpt(b, n);
			}
		}

		System.out.println(product);




	}

}
//Solve Problem 1.16 (fast-expt) with a loop in Java as opposed to the iterative recursion function you wrote in Scheme back in August.

