package hard;

public class LRUCacheTest {

	public static void main(String[] args) {
		LRUCache lru = new LRUCache(2);

		lru.set(2,1);
		lru.set(1, 1);
		System.out.println(lru.get(2));
		lru.set(4, 1);
		System.out.println(lru.get(1));
		System.out.println(lru.get(2));
	}
}
