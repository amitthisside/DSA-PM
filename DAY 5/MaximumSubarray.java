class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cumul = 0;
        
        for(int i = 0; i < nums.length; i++) {
            cumul += nums[i];
            
            max = Math.max(max, cumul);
            
            if(cumul <= 0)
                cumul = 0;
            
        }
                
        return max;
    }
}
