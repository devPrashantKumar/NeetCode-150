package SlidingWindow.L121_BestTimeToBuyAndSellStock;

import java.util.Arrays;

class SolutionSimpleIterativeSolution2 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int minimum = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minimum);
            minimum = Math.min(minimum, prices[i]);
        }
        return maxProfit;
    }
}

public class SimpleIterativeSolution2 {
    public static void main(String[] args) {
        SolutionSimpleIterativeSolution2 solution = new SolutionSimpleIterativeSolution2();
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
