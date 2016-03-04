package FileOperation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class palindrome {
	
	public static void main(String[] args) {
		
		int[][] A = {{1, 0, 0}, {-1,0,3}};
        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            boolean flag = true;
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag);
            if (flag == true) {
                setA.add(i);
            }
        }
        for (Integer n : setA) {
        	System.out.println(n);
        }
	}
	
    public int[][] multiply(int[][] A, int[][] B) {
        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            boolean flag = true;
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                setA.add(i);
            }
        }
        for (int i = 0; i < B[0].length; i++) {
            boolean flag = true;
            for (int j = 0; j < B.length; j++) {
                if (B[j][i] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                setB.add(i);
            }
        }
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            if (!setA.contains(i)) continue;
            for (int j = 0; j < B[0].length; j++) {
                if (!setB.contains(j)) continue;
                result[i][j] = helper(A, i, B, j);
            }
        }
        return result;
        
    }
    
    private int helper(int[][] A, int row, int[][] B, int column) {
        int ans = 0;
        for (int i = 0; i < A[row].length; i++) {
            ans += A[row][i] * B[i][column];
        }
        return ans;
    }

    }





