package BinarySearch.LeetCode_004_MedianOfTwoSortedArrays;

import java.util.Arrays;

class SolutionBruteForceTest {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean isOdd = (((nums1.length + nums2.length) % 2) == 1);
        int medianIndex = ((nums1.length + nums2.length - 1) / 2);
        int counter = -1;
        double median = 0;
        int nums1Index = 0;
        int nums2Index = 0;
        while (counter < medianIndex && nums1Index < nums1.length && nums2Index < nums2.length) {
            counter++;
            if (nums1[nums1Index] < nums2[nums2Index]) {
                if (counter == medianIndex) {
                    median = nums1[nums1Index];
                }
                nums1Index++;
            } else {
                if (counter == medianIndex) {
                    median = nums2[nums2Index];
                }
                nums2Index++;
            }
        }

        while (counter < medianIndex && nums1Index < nums1.length) {
            counter++;
            if (counter == medianIndex) {
                median = nums1[nums1Index];
            }
            nums1Index++;
        }

        while (counter < medianIndex && nums2Index < nums2.length) {
            counter++;
            if (counter == medianIndex) {
                median = nums2[nums2Index];
            }
            nums2Index++;
        }

        if (!isOdd) {
            if (nums1Index < nums1.length && nums2Index < nums2.length) {
                if (nums1[nums1Index] < nums2[nums2Index]) {
                    median = ((double) (median + nums1[nums1Index])) / 2;
                } else {
                    median = ((double) (median + nums2[nums2Index])) / 2;
                }
            } else if (nums1Index < nums1.length) {
                median = ((double) (median + nums1[nums1Index])) / 2;
            } else {
                median = ((double) (median + nums2[nums2Index])) / 2;
            }
        }
        return median;
    }
}

public class BruteForceTest {
    public static void main(String[] args) {
        SolutionBruteForceTest solution = new SolutionBruteForceTest();
        int[] nums11 = { 1, 3 };
        int[] nums12 = { 2 };

        int[] nums21 = { 1, 3 };
        int[] nums22 = { 2, 4 };

        System.out.println("---------------------------------------------------");
        System.out.println("Input11 : " + Arrays.toString(nums11));
        System.out.println("Input12 : " + Arrays.toString(nums12));
        System.out.println("Output : " + solution.findMedianSortedArrays(nums11,nums12));
        System.out.println("---------------------------------------------------");
        System.out.println("Input21 : " + Arrays.toString(nums21));
        System.out.println("Input22 : " + Arrays.toString(nums22));

        System.out.println("Output : " + solution.findMedianSortedArrays(nums21, nums22));
        System.out.println("---------------------------------------------------");
    }

}
