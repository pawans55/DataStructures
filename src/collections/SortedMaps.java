package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> LinkedhashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testmap(treeMap);

	}
	
	public static void testmap(Map<Integer, String> map){
		map.put(0, "Ravi");
		map.put(12, "Kishan");
		
		map.put(4, "Ri");
		
		map.put(6, "vi");
		map.put(7, "avi");
		
		for(Integer key : map.keySet()){
			String value = map.get(key);
			System.out.println(key + " " +value);
		}
	}

}
