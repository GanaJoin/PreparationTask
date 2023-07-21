package oopsConcepts;

public class UseAc {
     public static void main(String[] args) {
    	 Compressor c= new Compressor();
    	 c.weight=250;
    	 c.ratings= 4;
    	 CompositonForAC a= new CompositonForAC();
    	 a.colour= "blue";
    	 a.name="lg";
    	 a.price= 13225;
    	 a.compressor= c;
    	 System.out.println(a.colour+a.compressor.weight);
     }
	 
}
