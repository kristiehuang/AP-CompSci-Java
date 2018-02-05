
public class Main {

	public static void main(String[] args) {
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.setLeft(7);
		bsti.setRight(19);
		
		bsti.getLeft().setLeft(3);
		bsti.getLeft().setRight(9);
		bsti.getLeft().getRight().setLeft(8);
		
		bsti.getRight().setLeft(14);


		
		System.out.println(bsti);
		
		bsti.depth();
		bsti.insert(10);
		bsti.depth();
	}

}
