class Solution {
    public int findMin(int[] nums) {
        int max = Integer.MAX_VALUE;
        int newMax = 0;
        for(int i = 0; i < nums.length; i++) {
            if(max > nums[i]) {
                newMax = nums[i];
            }
            max = nums[i];
        }
        return newMax;
    }
}