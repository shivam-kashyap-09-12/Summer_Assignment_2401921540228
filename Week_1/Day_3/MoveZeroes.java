class Solution {
    public void moveZeroes(int[] nums) {
       int insertAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertAt] = nums[i];
                insertAt++;
            }
        }
        while (insertAt < nums.length) {
            nums[insertAt] = 0;
            insertAt++;
        }
    }
}
