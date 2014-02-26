package collections;
import java.util.ArrayList;


public class Arraylisttest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>  numbers = new ArrayList<Integer>();
		
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		for(int i = 0 ; i< numbers.size() ; i++)
			System.out.println("Added numbers " + numbers.get(i));
		
		
		System.out.println("Removed number " + numbers.remove(0));
		
		
		for(Integer value: numbers)
			System.out.println("Added numbers " + value);
			
		
		
		
		
		
	}

}
