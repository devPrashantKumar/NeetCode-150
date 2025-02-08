package SlidingWindow.N015_L121_BestTimeToBuyAndSellStock;

import java.util.Arrays;

class SolutionSimpleIterativeSolution1 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int[] min = new int[prices.length];
        min[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min[i] = Math.min(min[i - 1], prices[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - min[i]);
        }
        return maxProfit;
    }
}

public class SimpleIterativeSolution1 {
    public static void main(String[] args) {
        SolutionSimpleIterativeSolution1 solution = new SolutionSimpleIterativeSolution1();
        int[] nums1 = { 10,1,5,6,7,1 };
        int[] nums2 = {10,8,7,5,2 };
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + solution.maxProfit(nums1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + solution.maxProfit(nums2));
        System.out.println("---------------------------------------------------");
    }

}
