package Review;

import java.util.HashMap;
import java.util.List;

public class Binary {

	public static void main(String[] args) {
		int i = 3;
		int j = Integer.MAX_VALUE + 3;
		
		String binStr = Integer.toBinaryString(i);
		String binStr2 = Integer.toBinaryString(j);
		System.out.println(binStr);
		System.out.println(binStr2);
		Cat cat = new Cat("cat", 32);
		Cat cat2 = new Cat("cat", 32);
		System.out.println(cat);
		HashMap<Cat, Integer> map = new HashMap<Cat, Integer>();
		map.put(cat, 1);
		map.put(cat2, 2);
		
//		List<Integer> list = (List<Integer>) new HashMap<Integer, Integer>();
		
	}
	
	static class Cat{
		String type;
		int age;
		
		public Cat(String type, int age) {
			this.type = type;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Cat [type=" + type + ", age=" + age + "]";
		}

	}
	
	
}
