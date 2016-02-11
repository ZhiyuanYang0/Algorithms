package test;

import java.util.LinkedList;
import java.util.Queue;

import DataStructure.TreeNode;

public class Serilize2 {
	
	public static void main(String args[]) {
		String data = "1,2,#,#,3,4,#,#,5,#,#";
		TreeNode root = deserialize(data);
		System.out.println(root.val);
		System.out.println(root.left.val);
		System.out.println(root.right.val);
		System.out.println(root.right.left.val);
		System.out.println(root.right.right.val);
		String result = serialize(root);
		System.out.println(result);
		
	}

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        serializeHelper(root, result);
        return result.toString();
    }
    
    private static void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
    	  Queue<String> queue = new LinkedList<>();
          String[] strs = data.split(",");
          for (String s : strs) {
              queue.add(s);
          }
          return deserializeHelper(queue);
    }
    
    private static TreeNode deserializeHelper(Queue<String> queue) {
    	String temp = queue.poll();
    	if (temp.equals("#")) {
    		return null;
    	}
    	TreeNode root = new TreeNode(Integer.valueOf(temp));
    	root.left = deserializeHelper(queue);
    	root.right = deserializeHelper(queue);    	
    	return root;
    }
	
}
