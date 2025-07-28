class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; // Pointer for next non-zero placement

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                // Swap non-zero element to the front
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}
