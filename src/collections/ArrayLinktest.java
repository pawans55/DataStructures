package collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new  ArrayList<Integer>();
		List<Integer> linkedList = new  LinkedList<Integer>();
		
		dotimings("Arraylist" , arrayList);
		dotimings("LinkedList" , linkedList);
		
		
		

	}
	public static void dotimings(String type, List<Integer> list){
		
		for(int i = 0 ; i < 1E5 ; i++){
			list.add(0, i);
			
				}
		long start =System.currentTimeMillis();
		
		for(int i = 0 ; i < 1E5 ; i++){
			list.add(i);
			
				}
		
		long stop =System.currentTimeMillis();
		
		System.out.println("time taken  " + (stop - start) + " "+ type);
		
		
	}

}
