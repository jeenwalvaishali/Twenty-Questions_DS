package ArraysEasyQuestions;

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

/*    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }*/


        public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
//        int[] nums = {1,2,3,4};
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        boolean output = containsDuplicate(nums);
        System.out.println("Output: " + output);
    }

}

/*Time Complexity:

Sorting the array using Arrays.sort() takes O(n log n) time (since it uses a comparison-based sorting algorithm like MergeSort or TimSort).

After sorting, the loop runs in O(n), iterating through the sorted array.

Therefore, the overall time complexity is dominated by the sorting step, making it O(n log n).

Space Complexity:

Sorting the array in-place means no extra space is required apart from the input array. Therefore, the space complexity is O(1), assuming the sorting algorithm uses constant space (which is true for TimSort or similar algorithms).

Comparison:
Time Complexity:

Solution 1 has a time complexity of O(n), while Solution 2 has a time complexity of O(n log n).

Therefore, Solution 1 is more efficient in terms of time complexity.

Space Complexity:

Solution 1 uses a HashSet, so its space complexity is O(n).

Solution 2 sorts the array in-place, so its space complexity is O(1).

Therefore, Solution 2 is more efficient in terms of space complexity.

Conclusion:
Solution 1 (using a HashSet) is better if you care about time complexity, especially for larger arrays.

Solution 2 (sorting the array) is better if you care about space complexity and can tolerate a higher time complexity.

If you prioritize performance in terms of speed, Solution 1 is generally the better option. However, if memory usage is a concern and the array is very large, Solution 2 could be preferred.*/
