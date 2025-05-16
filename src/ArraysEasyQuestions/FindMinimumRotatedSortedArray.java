package ArraysEasyQuestions;

/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
For example, the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:
Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:
Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
*/

public class FindMinimumRotatedSortedArray {

    private static int findMin(int[] nums) {
       int left = 0;
       int right = nums.length - 1;

       while (left < right){
           int mid = (left + right)/2;
           if(nums[mid] < nums[right]){
               right = mid;
           }else {
               left = mid + 1;
           }
       }

       return nums[left];
    }

    public static void main(String[] args) {
//        int[] nums = {3,4,5,1,2};
        int[] nums = {4,5,6,7,0,1,2};
        //int[] nums = {11,13,15,17};

        int output = findMin(nums);
        System.out.println("Output: " + output);
    }
}


/*
The "catch" or the key trick in this question lies in understanding two things:

1. The array is a rotated sorted array.
A sorted array is rotated at some pivot point (unknown), meaning it's been split and the pieces swapped.
For example:
Sorted: [0,1,2,4,5,6,7] → Rotated 4 times → [4,5,6,7,0,1,2]

2. You must find the minimum element in O(log n) time.
This is the real challenge.

Linear search (O(n)) is simple, but not acceptable.

You must use a modified binary search — that’s the heart of the question.

🔍 Binary Search Insight
In a rotated sorted array:

One half is always sorted.

The minimum element is in the unsorted half.

🚨 The Catch:
You need to carefully update the binary search bounds to always move towards the part of the array where the rotation (and hence the smallest element) could be.

✅ How to Solve (High-Level):
Use binary search:

Let left = 0, right = n - 1.

While left < right:

Compute mid = (left + right) // 2

Compare nums[mid] with nums[right]:

If nums[mid] > nums[right], the min is in the right half → left = mid + 1

Else, the min is in the left half or at mid → right = mid

At the end, left will point to the smallest element.
*/