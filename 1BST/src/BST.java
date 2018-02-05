public class BST<T extends Comparable<T>> {

	private T datum;
	private BST<T> left; 
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}

	public void setLeft(T datum) {
		left = new BST<T>(datum);
	}

	public void setRight(T datum) {
		right = new BST<T>(datum);
	}

	public int depth() {
		//one node counts as 1 depth

		int leftDepth;
		int rightDepth;

		if (left == null) {
			leftDepth = 0;
		}
		else { leftDepth = getLeft().depth(); }

		if (right == null) {
			rightDepth = 0;
		}
		else { rightDepth = getRight().depth(); }

		int depth = 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
		System.out.println("depth is" + depth);

		return depth;
	}
	public void insert(T datum) {
		//YOUR_CODE_HERE
		if (datum.compareTo(getDatum()) > 0) {
			right.insert(datum); 
		}
		else if (datum.compareTo(getDatum()) < 0) {
			left.insert(datum); }
		else {
			this.datum = datum;
		}

	}

	//printTree, using infix (inorder) notation

	//EXTRA CREDIDTTTT
	public void delete(T datum) {
		//YOUR_CODE_HERE
		// find datum in the binary search tree; if found, delete node,
		// but remember, this must remain a BST after deletion
	}


	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = s + left.toString();
		if (right != null)
			s = s + right.toString();
		return s;
	}
}