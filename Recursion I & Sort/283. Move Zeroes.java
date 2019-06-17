class Solution {
    // O (n) 
    // 先把所有的非零的数移到前面，后面再填满0
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length;i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}



