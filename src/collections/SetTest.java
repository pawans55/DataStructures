package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String> set1 = new LinkedHashSet<String>();
		Set<String> set1 = new HashSet<String>();
		
		//Set<String> set1 = new TreeSet<String>();
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("rabbit");
		set1.add("niks");
		
		System.out.println(set1);
		
		for(String element: set1){
			System.out.println(element);
		}
		
		Set<String> set2 = new HashSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("monkey");
		set2.add("eagle");
		set2.add("dear");
		
		//intersection
		
		
		Set<String> intersection = new HashSet<String>(set1);
		Set<String> difference = new HashSet<String>(set1);
		
		
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		//difference
		
		difference.removeAll(set2);
		System.out.println(difference);
		
		
		
		
		

	}

}
