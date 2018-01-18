public class Branch {
	private double length;
	private Structure struct;
	
	public Branch(double length, Structure struct) {
		this.length = length;
		this.struct = struct;
	}
	
	public double getLength() {
		return length;
	}
	
	public Structure getStructure() {
		return struct;
	}
	
	public double torque() {
		// You write this
		double torq = getLength() * getStructure().getWeight();
		return torq;
	}
}