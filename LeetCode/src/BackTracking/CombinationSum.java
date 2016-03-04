package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		int[] candidates = {1};
		List<List<Integer>> rst = new ArrayList<List<Integer>>();
		rst = combinationSum(candidates, 1);
		for (int i = 0; i < rst.size(); i++) {
			System.out.println(rst.get(i));
		}
		
	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        List<Integer> path = new ArrayList<Integer>();
        Arrays.sort(candidates);
        findSum(result, path, candidates, target, 0);
        return result;
    }
    
    private static void findSum(List<List<Integer>> result, List<Integer> path, int[] candidates, int target, int index) {
    	System.out.println(target);
        if (target == 0) {
            result.add(new ArrayList<Integer>(path));
            System.out.println("result = ");
    		for (int i = 0; i < result.size(); i++) {
    			System.out.println(result.get(i));
    		}
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (target < candidates[i]) {
                return;
            }
            path.add(candidates[i]);
            System.out.println(path);
            findSum(result, path, candidates, target - candidates[i], i);
            path.remove(path.size() - 1);
        }
    }
}
