
public class Quadrant {

	//NO CONDITIONALS WHATSOEVER; NO ASSIGNMENT OPERATIONS
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		quadrant(-2, 5);
	}

	public static double quadrant(int x, int y) {
		
		double radian = Math.atan(y / x);
		double degree = Math.toDegrees(radian);
		
		double quad = degree / 90;
		
		System.out.println(quad);
		return quad;
		
	}
	
	
}
