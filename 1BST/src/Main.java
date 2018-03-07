
public class Main {

	public static void main(String[] args) {
		
		Randp randp = new Randp(10000);
		BST<Integer> bsti = new BST<Integer>(randp.nextInt());
		
		System.out.println(bsti);
		System.out.println("depth is " + bsti.depth());


		for (int i = 1; i <= 10000; i++) {
			int rand = randp.nextInt();
			bsti.insert(rand);
		}
		
		System.out.println("depth is " + bsti.depth());
		
		bsti.isBalanced();
		
		

	}

}
