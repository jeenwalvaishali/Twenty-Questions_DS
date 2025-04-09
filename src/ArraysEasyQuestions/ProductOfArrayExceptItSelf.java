package ArraysEasyQuestions;

/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/

import java.util.Arrays;

public class ProductOfArrayExceptItSelf {

//    public static int[] productOfArray(int[] nums){
//        int n = nums.length;
//        int[] result = new int[n];
//
//        for (int i=0; i<n; i++){
//           result[i] = 1;
//        }
//
//        int leftProduct = 1;
//        for (int i=0; i<n; i++){
//            result[i] *= leftProduct;
//            leftProduct *= nums[i];
//        }
//
//        int rightProduct = 1;
//        for (int i=n-1; i>=0; i--){
//            result[i] *= rightProduct;
//            rightProduct *= nums[i];
//        }
//
//        return result;
//    }

    public static int[] productOfArray(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i<n; i++){
            int product = 1;

            for (int j=0; j<n; j++){
                if(i != j){
                    product *= nums[j];
                }
            }

            result[i] = product;
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};

        int[] output = productOfArray(nums);
        System.out.println("Output: " + Arrays.toString(output));

    }
}
