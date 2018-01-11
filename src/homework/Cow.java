package homework;

public class Cow implements Comparable<Cow> {
	
	private int weight;
	private String name;

	public Cow(int weight, String name) {
		this.weight = weight;
		this.setName(name);
	}
	public Cow() {
		this.weight = 1800;
		this.setName("Anonymous Cow");
	}
	@Override
	public int compareTo(Cow o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.weight, o.weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
