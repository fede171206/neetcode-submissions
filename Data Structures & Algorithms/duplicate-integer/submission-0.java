class Solution {
    HashSet<Integer>m=new HashSet<>();
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(!m.add(nums[i]))
            {
                return true;
            }
        }
        return false;
    }
}