package SlidingWindow.L121_BestTimeToBuyAndSellStock;

import java.util.Arrays;

class SolutionSlidingWindowSolution1 {
    public int maxProfit(int[] prices) {
    
    int buy = 0;  // Left pointer (buy day)
    int maxProfit = 0;

    for (int sell = 1; sell < prices.length; sell++) {
        if (prices[sell] < prices[buy]) {
            buy = sell;  // Update buy day if new min found
        } else {
            maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
        }
    }
    return maxProfit;
    }
}


public class SlidingWindowSolution1 {
    public static void main(String[] args) {
        SolutionSlidingWindowSolution1 solution = new SolutionSlidingWindowSolution1();
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

