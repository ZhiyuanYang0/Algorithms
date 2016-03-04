package code;

public class bits {
	public static void main(String[] args) {
		String origin = Integer.toBinaryString(1);
		System.out.println(origin);
		int length = origin.length();
		StringBuilder sb = new StringBuilder();
		for (int i = length - 1; i >= 0; i--) {
			sb.append(origin.charAt(i));
		}
		for (int i = 0; i < 32 - length; i++) {
			sb.append('0');
		}		
		System.out.println(sb.length());
		System.out.println(sb.toString());
		
		
	}

	public static int reverseBits(int n) {
		String origin = Integer.toBinaryString(n);
		int length = origin.length();
		StringBuilder sb = new StringBuilder();
		for (int i = length - 1; i >= 0; i--) {
			sb.append(origin.charAt(i));
		}
		for (int i = 0; i < 32 - length; i++) {
			sb.append('0');
		}
		return (int) Integer.parseInt(sb.toString(), 2);
	}
}
