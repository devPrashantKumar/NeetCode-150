package NeetCode_8;
import java.util.*;

public class BruteForcetest {
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i]))
                continue;
            int left = hmap.getOrDefault(nums[i] - 1, 0);
            int right = hmap.getOrDefault(nums[i] + 1, 0);
            int sequenceLength = left + right + 1;
            hmap.put(nums[i], sequenceLength);
            if (hmap.containsKey(nums[i] - 1))
                hmap.put(nums[i] - 1, sequenceLength);
            if (hmap.containsKey(nums[i] + 1))
                hmap.put(nums[i] + 1, sequenceLength);
            longestSequence = Math.max(longestSequence, sequenceLength);
        }
        return longestSequence;
    }
}
