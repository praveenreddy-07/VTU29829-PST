class Solution {
    public int maxSubArray(int[] nums) {
       
        int max_so_far = nums[0];
        int current_max = nums[0];

    
        for (int i = 1; i < nums.length; i++) {
           
            current_max = Math.max(nums[i], current_max + nums[i]);

         
            max_so_far = Math.max(max_so_far, current_max);
        }

        return max_so_far;
    }
}
