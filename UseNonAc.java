package oopsConcepts;

public class UseNonAc {
	 public static void main(String[] args) {
    	 NonCompressor e= new NonCompressor(40,5);
    	// e.setRatings(5);
    	//e.setWeight(40);
    	 NonAc a= new NonAc("lg", 15000 ,"red", e);
//    	 a.setColour("blue");
//    	 a.setName("LG");
//         a.setPrice(13000);
//    	 a.setNoncompressor(e);
    	 System.out.println(a.toString());
     }
	 
}
