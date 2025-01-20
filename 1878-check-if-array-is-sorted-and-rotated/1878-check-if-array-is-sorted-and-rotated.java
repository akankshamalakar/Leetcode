class Solution {
    public boolean check(int[] nums) 
    {
        int descendingPair=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[(i+1)% nums.length])
            {
                 descendingPair+=1;
            }
            if(descendingPair>1)
            {
                return false;
            }
            
        }
        return true;
       
    }
    
}