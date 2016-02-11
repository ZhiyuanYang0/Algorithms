package DataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {


		private static HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
	 
		public static void add(int number) {
			if (elements.containsKey(number)) {
				elements.put(number, elements.get(number) + 1);
//				elements.put(number, 100);
			} else {
				elements.put(number, 1);
			}
		}
	 
		public static boolean find(int value) {
		    Iterator it = elements.entrySet().iterator();
		    while (it.hasNext()) {
		    	Map.Entry entry = (Map.Entry) it.next();
		    	int in = (int) entry.getKey();
		    	System.out.println(in);
		    }
			for (Integer i : elements.keySet()) {
				int target = value - i;
				if (elements.containsKey(target)) {
					if (i == target && elements.get(target) < 2) {
						continue;
					}
					return true;
				}
			}
			return false;
		}
	
	
		public static void main(String args[]) {
			add(1);
			add(2);
			add(1);
			add(1);
			Iterator it = elements.keySet().iterator();  
	        while(it.hasNext()) {  
	            Integer key = (Integer)it.next();  
	            System.out.println("key:" + key);  
	            System.out.println("value:" + elements.get(key));  
	        }  
//	        System.out.println(find(3));
			
	        if (elements.containsKey(1)) {
	        	System.out.println("...true");
	        }
	        if (elements.containsValue(1)) {
	        	System.out.println("false");
	        }
		
}
		
		}
