package test;

import java.util.LinkedList;
import java.util.Queue;

import DataStructure.TreeNode;

public class SerializeLevelOrder {
	
	public static void main(String args[]) {
		String data = "1,2,3,#,#,4,5";
		DataStructure.TreeNode root = deserialize(data);
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
    	if (root == null) {
    		return "";
    	}
    	StringBuilder sb = new StringBuilder();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	while (!queue.isEmpty()) {
    		int size = queue.size();
    		for (int i = 0; i < size; i++) {
    			TreeNode temp = queue.poll();
    			if (temp == null) {
    				sb.append("#,");
    				continue;
    			}
    			sb.append(temp.val).append(",");
    			queue.offer(temp.left);
    			queue.offer(temp.right);
    		}
    	}
        return sb.toString();
    }
    
    public static TreeNode deserialize(String data) {
    	if (data.isEmpty()) {
    		return null;
    	}
    	String[] strs = data.split(",");
        int[] nums = new int[strs.length]; // 节点i之前null节点的个数
        TreeNode[] nodes = new TreeNode[strs.length];
        if (strs == null || strs.length == 0 || strs[0].equals("#")) {
        	return null;
        }
        nums[0] = 0;
        nodes[0] = new TreeNode(Integer.valueOf(strs[0]));
        for (int i = 1; i < nums.length; i++) {
        	if (strs[i].equals("#")) {
        		nums[i] = nums[i - 1] + 1;
        		nodes[i] = null;
        	} else {
        		nums[i] = nums[i - 1];
        		nodes[i] = new TreeNode(Integer.valueOf(strs[i]));
        	}
        }
        for (int i = 0; i < strs.length; i++) {
        	if (nodes[i] == null) {
        		continue;
        	}
        	if (2 * (i - nums[i]) + 1 < strs.length) {
        		nodes[i].left = nodes[2 * (i - nums[i]) + 1];
        	}
        	if (2 * (i - nums[i]) + 2 < strs.length) {
        		nodes[i].right = nodes[2 * (i - nums[i]) + 2];
        	}
        }
    	return nodes[0];
    }
    
}
