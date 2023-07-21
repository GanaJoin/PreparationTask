package oopsConcepts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraiList {
	public static void main(String[] args) {
		
		
		 
		 int[] id= {2,4,45,67,4};
		ArrayList<Integer> l= new ArrayList<>();
		for(int i=0;i<id.length;i++) {
		l.add(id[i]);
		}
		System.out.println(l);
		
		
		
	List<Integer> a= Arrays.asList(2,3,4,5);// Arraylist to array
		Integer[] b= a.toArray(new Integer[0]);
	for(Integer x:b ) {
		System.out.println(x);
	}

	
	 String[] geeks = {"Rahul", "Utkarsh", // Conversion of array to ArrayList
             "Shubham", "Neelam"};
      List al = Arrays.asList(geeks);
    al.forEach(xz->System.out.println(xz)); 
     
     Integer [] geek = {56,67,67,89};   // Conversion of array to ArrayList
      List<Integer> all = Arrays.asList(geek);
      for(Integer z:all)
     System.out.println(z);
     
      List<String> words = Arrays.asList("sun","moon","mars");
  	String[] planets= words.toArray(new String[0]);
  	for(String n:planets) {
  		System.out.println(n);
  	}    
  }			
}
	
	
	

