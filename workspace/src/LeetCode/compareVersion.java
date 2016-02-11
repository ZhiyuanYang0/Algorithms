package LeetCode;

public class compareVersion {
	
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "0";
		int ans = compareVersion(s1, s2);
		System.out.println(ans);
	}

    public static int compareVersion(String version1, String version2) {
        if (version1 == null || version2 == null) {
            return 0;
        }
        
        String[] ver1 = version1.split("\\.");
        System.out.println(ver1[0]);
        String[] ver2 = version2.split("\\.");
        
        int l1 = ver1.length;
        int l2 = ver2.length;
        
        for (int i = 0; i < l1 && i < l2; i++) {
        	System.out.println("i=" + i);
            if (Integer.valueOf(ver1[i]) > Integer.valueOf(ver2[i])) {
                return 1;
            } else if (Integer.valueOf(ver1[i]) < Integer.valueOf(ver2[i])) {
                return -1;
            }
        }
        
        if (l1 > l2) {
            return 1;
        } else if (l1 < l2) {
            return -1;
        } else {
            return 0;
        }
    }
}
