package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import DataStructure.TreeNode;

public class Serilize {
	
	public static void main(String args[]) {
		String data = "[1, 2, #, #, 3, 4, #, #, 5, #, #]";
		TreeNode root2 = deserialize(data);
		System.out.println(root2.val);
		System.out.println(root2.left.val);
		System.out.println(root2.right.val);
		if (root2.left.left == null && root2.left.right == null) {
			System.out.println("hahaha");
		}
		System.out.println(root2.right.left.val);
		System.out.println(root2.right.right.val);
		String ans = serialize(root2);
		System.out.println(ans);
	}

	public static String serialize(TreeNode root) {
	    ArrayList<String> result = new ArrayList<String>();
	    serializeHelper(root,result);
	    return result.toString();
	}

	private static void serializeHelper(TreeNode root, ArrayList<String> result){
	    if (root == null) {
	        result.add("#");
	        return;
	    }
	    result.add(Integer.toString(root.val));
	    serializeHelper(root.left,result);
	    serializeHelper(root.right,result);
	}

	// Decodes your encoded data to tree.
	public static TreeNode deserialize(String data) {
	    String[] strArray = data.substring(1,data.length()-1).split(", ");
	    Deque<String> strList = new LinkedList<String>(Arrays.asList(strArray)); 
	    return deserializeHelper(strList);
	}

	private static TreeNode deserializeHelper(Deque<String> strList){
	    if (strList.size() == 0) return null;
	    String str = strList.pop();
	    if (str.equals("null")) return null;
	    TreeNode currentRoot = new TreeNode(Integer.parseInt(str));
	    currentRoot.left = deserializeHelper(strList);
	    currentRoot.right = deserializeHelper(strList);
	    return currentRoot;
	}
}
