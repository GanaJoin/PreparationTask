package oopsConcepts;

public class NonCompressor {

	
	private int weight;
	private int ratings;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public NonCompressor(int weight, int ratings) {
		super();
		this.weight = weight;
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return " [weight=" + weight + ", ratings=" + ratings + "]";
	}
	
}
