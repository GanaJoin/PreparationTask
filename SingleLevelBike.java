package oopsConcepts;

public class SingleLevelBike {

// condiser as a Bike
	
	private String brand;
	private int price;
	
	public SingleLevelBike(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SingleLevel [brand=" + brand + ", price=" + price + "]";
	}
	
	
}
