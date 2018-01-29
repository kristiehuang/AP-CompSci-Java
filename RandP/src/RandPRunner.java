
public class RandPRunner {

	public static void main(String[] args) {

		int x;
		RandP rand = new RandP(6);
		x = rand.nextInt();	// randomly returns 5
		x = rand.nextInt();	// randomly returns 2
		x = rand.nextInt();	// randomly returns 6
		x = rand.nextInt();	// randomly returns 4
		x = rand.nextInt();	// randomly returns 1
		x = rand.nextInt();	// randomly returns 3
		x = rand.nextInt();	// returns 0
		x = rand.nextInt();	// returns 0

	}

}
