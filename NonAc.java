package oopsConcepts;

public class NonAc {// Encapulation

	private String name;
	private int price;
	private String colour;
	private NonCompressor noncompressor;//instance vaiable (class level)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public NonCompressor getNoncompressor() {//local varible
		return noncompressor;
	}
	public void setNoncompressor(NonCompressor noncompressor) {
		this.noncompressor = noncompressor;
	}
	
	
	public NonAc(String name, int price, String colour, NonCompressor noncompressor) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.noncompressor = noncompressor;
	}
//	public NonAc(String name, int price, String colour) {
//		this.colour=colour;
//		this.name=name;
//		this.price=price;
//	}
	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + ", colour=" + colour + "    " + noncompressor
				+ "]";
	}
	
	
}
