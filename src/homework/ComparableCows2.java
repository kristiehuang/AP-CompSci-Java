package homework;

import java.util.Arrays;

public class ComparableCows2 extends Cow {

	public static void main(String[] args) {
	    Cow[] cows = { new Cow(2000, "Hulk"),
	                   new Cow(),
	                   new Cow(1600, "Bessie"),
	                   new Cow(1700, "Moohead"),
	                   new Cow(),
	                   new Cow(1900, "Big Time Jones") };

	    printArray(cows);
	    Arrays.sort(cows);
	    printArray(cows);
	}

	private static void printArray(Cow[] cows) {
		// TODO Auto-generated method stub
		String name = "";
		for(Cow cow : cows) {
			name += ", " + cow.getName();
		}
		System.out.println(name);
	}
	
	

}
