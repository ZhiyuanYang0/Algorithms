package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BuyAndSellStock {
	public static void main(String[] args) {
		int[] nums = { 1,3, 4, 6, 7, 2, 8, 0, 3};
		int ans = maxProfit(nums);
		System.out.println(ans);
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    map.put(1, 2);
	    System.out.println(map.containsKey(3));
	}

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        int[] profit = new int[n];
        int min = prices[0];
        profit[0] = 0;
        for (int i = 1; i < n; i++) {
              profit[i] = Math.max(profit[i - 1], prices[i] - min);
              if (prices[i] < min) {
                min = prices[i];
              }
        }
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(profit));
        
        int max = prices[n - 1];
        int[] profitReverse = new int[n];
        profitReverse[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            profitReverse[i] = Math.max(profitReverse[i + 1], max - prices[i]);
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        System.out.println(Arrays.toString(profitReverse));
        
        int ans = profit[n - 1];
        for (int i = 0; i < n - 1; i++) {
            int temp = profit[i] + profitReverse[i + 1];
            if (temp > ans) {
                ans = temp;
            }
        }
        return ans;
    }
}
