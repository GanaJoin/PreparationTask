package oopsConcepts;

public class SportsBike  extends SingleLevelBike {

	private int cc;
	private int model;
	public SportsBike(String brand, int price, int cc, int model) {
		super(brand, price);
		this.cc=cc;
		this.model=model;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"SportsBike [cc=" + cc + ", model=" + model + "]";
	}

}
