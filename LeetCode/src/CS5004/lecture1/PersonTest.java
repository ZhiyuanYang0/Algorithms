package CS5004.lecture1;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("1", "2", 33);
		System.out.println(p.toString());
		
		Person p2 = new Person("1", "2", 33);
		boolean ans = p.equals(p2);
		System.out.println(ans);
	}
}
