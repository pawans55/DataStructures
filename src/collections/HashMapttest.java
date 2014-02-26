package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapttest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Pawan");
		map.put(2, "samit");
		map.put(3, "subodh");
		map.put(4, "niks");
		map.put(6, "jalaj");
		
		String text = map.get(2);
		System.out.println(text);
		
		
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
			
		}

	}

}
