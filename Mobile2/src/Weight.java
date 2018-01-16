// You write this.
//
// If you make Structure a class, Weight must extend it.
// If you make Structure an interface, Weight must implement it.

public class Weight extends Structure {
    // This constructor is now mandatory as we can make weights
    // real objects instead of treating them solely as numbers.
    // 
    // You have to figure out how to handle it
	
	
	public double weight; //INSTANCE VARIALBES SHOULD ALWAYS BE PRIVATE;; CHANGE TO PRIVATE??
	
    public Weight(double weight) {
    		this.weight = weight;
    }
}