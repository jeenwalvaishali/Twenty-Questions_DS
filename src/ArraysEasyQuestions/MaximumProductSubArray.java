package ArraysEasyQuestions;
/*Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/

public class MaximumProductSubArray {

    public static int productSubArray(int[] nums){

        if(nums == null || nums.length == 0){
            return 0;
        }

        int result = nums[0];
        int minProduct = nums[0];
        int maxProduct = nums[0];

        for (int i =1; i<nums.length; i++){
            if(nums[i] < 0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            minProduct = Math.min(nums[i], minProduct*nums[i]);
            maxProduct = Math.max(nums[i], maxProduct*nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;

    }

    public static void main(String[] args) {
        //int[] nums = {2,3,-2,4};
        int[] nums = {-2,0,-1};

        int output = productSubArray(nums);
        System.out.println("Output: " + output);
    }

}


