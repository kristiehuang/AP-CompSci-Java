// You write this.
//
// If you make Structure a class, Mobile must extend it.
// If you make Structure an interface, Mobile must implement it.

public class Mobile extends Structure {

	Branch left, right;
	
	public Mobile(Branch left, Branch right) {
		super();
		this.left = left;
		this.right = right;
		// TODO Auto-generated constructor stub
	}	
	// This constructor is mandatory by problem specification
	// You have to figure out how to handle it
	
	public Branch getLeft() { return left; }
	public Branch getRight() { return right; }
}