package leetcode2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sudoku {
	
	public static void main(String[] args) {
		String s0 = ".........";
		String s1 = "......3..";
		String s2 = "...18....";
		String s3 = "...7.....";
		String s4 = "....1.97.";
		String s5 = ".........";
		String s6 = "...36.1..";
		String s7 = ".........";
		String s8 = ".......2.";
		char[][] board = new char[9][9];
		board[0] = s0.toCharArray();
		board[1] = s1.toCharArray();
		board[2] = s2.toCharArray();
		board[3] = s3.toCharArray();
		board[4] = s4.toCharArray();
		board[5] = s5.toCharArray();
		board[6] = s6.toCharArray();
		board[7] = s7.toCharArray();
		board[8] = s8.toCharArray();		
		boolean ans = isValidSudoku(board);
		System.out.println(ans);
	}

    public static boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
        	System.out.println("error");
            return false;
        }
        
        Set<Character> set = new HashSet<Character>();        
        for (int i = 0; i < 9; i++) {
            if (board[i][i] != '.') {
                if (set.contains(board[i][i])) {
                	System.out.println("error");
                	System.out.println(set.toString());
                	System.out.println(board[i][i]);
                 return false;
               } else {
                   set.add(board[i][i]);
               }
            }
        }
        set.clear();
        for (int i = 0; i < 9; i++) {
         if (board[i][i] != '.') {
            if (set.contains(board[i][8 - i])) {
            	System.out.println("error");
                return false;
            } else {
                set.add(board[i][8 - i]);
            }
         }
        }
        return helper(board);
    }
    
    private static boolean helper(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<Character>();   
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                if (set.contains(board[i][j])) {
                    return false;
                } else {
                    set.add(board[i][j]);
                }
                 }
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<Character>();   
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] != '.') {
                if (set.contains(board[j][i])) {
                    return false;
                } else {
                    set.add(board[j][i]);
                }
                }
            }
        }
        
        return true;
    }
    
}
