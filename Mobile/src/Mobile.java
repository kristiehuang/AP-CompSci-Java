// You write this.
//
// If you make Structure a class, Mobile must extend it.
// If you make Structure an interface, Mobile must implement it.

public class Mobile implements Structure {	
	// This constructor is mandatory by problem specification
	// You have to figure out how to handle it
	
	Branch left;
	Branch right;

	public Mobile(Branch left, Branch right) {
		// You write this
		this.left = left;
		this.right = right;
		
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		double w = left.getStructure().getWeight() + right.getStructure().getWeight();
		return w;
	}

	@Override
	public boolean isBalanced() {
		boolean bal = false;
		// TODO Auto-generated method stub
		if (left.torque() == right.torque()) {
			bal = true;
		}
		return bal;
	}

}