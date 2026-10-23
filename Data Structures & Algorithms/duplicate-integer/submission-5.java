class Solution {
   
    public boolean hasDuplicate(int[] nums) {
         HashSet<Integer>m=new HashSet<>(nums.length);
        for(int num:nums)
        {
            if(!m.add(num))
            {
                return true;
            }
        }
        return false;
    }
}