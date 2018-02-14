// Is structure going to be a class or an interface?  Either way,
// each structure must have a getWeight() method of type double and
// an isBalanced() method of type boolean.

public class Structure {

	private double weight;
	Branch left, right;
	
	public Structure () { }
	
	public Structure(double weight) {
		this.weight = weight;
	}
	
	public Structure(Branch left, Branch right) {
		this.left = left;
		this.right = right;
	}
	
	public double getWeight() {
		if (this instanceof Weight) { //weight
			return weight;
		}
		else { //mobile
			double w = ((Mobile) this).getLeft().getStructure().getWeight() + 
					((Mobile) this).getRight().getStructure().getWeight();
			return w;
		}
	}
	
	public boolean isBalanced () {
		
		boolean isB = true;
		
		if (this instanceof Weight) { return isB; }
		else { //mobile
			isB = ( ((Mobile) this).getLeft().torque() == ((Mobile) this).getRight().torque()) && 
					(((Mobile) this).getLeft().getStructure().isBalanced()) && 
					(((Mobile) this).getRight().getStructure().isBalanced());
			return isB;
		}
	}
	

}
