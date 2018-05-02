import java.util.Random;

public class ParkingProblem {

	public static void main(String[] args) {

		double[] parkingLot = new double[10];

		insertCars(parkingLot);
		countCars(parkingLot);

	}
	
	public static void insertCars(double[] a) {
		
		Random rand = new Random();		
		double random = rand.nextDouble(); //random double between 0-1
		double park = random * a.length;
		
		System.out.println(park);

		//insert cars randomly into N space until room runs out
	}
	
	public static void countCars(double[] a) {
		//count cars in N space after inserting cars
		
	}
	
	
	
	public static void averageNumOfCars(int[] a) {
		
	}

}
