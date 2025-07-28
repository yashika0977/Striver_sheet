// Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.


// Examples:
// Input: nums = [1, 2, 3, 4, 5, 6], k = 2

// Output: nums = [3, 4, 5, 6, 1, 2]

// Explanation: rotate 1 step to the left: [2, 3, 4, 5, 6, 1]

// rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]




class Solution {
    public void reverse(int[] nums,int k,int start,int end){

        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
    public void rotateArray(int[] nums, int k) {

        int n=nums.length;
        k=k%n;

        reverse(nums,k,0,k-1);
        reverse(nums,k,k,n-1);
        reverse(nums,k,0,n-1);
        


        
    }
}
