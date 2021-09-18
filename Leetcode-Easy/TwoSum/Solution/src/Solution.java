public class Solution 
{
    public static void main(String[] args) throws Exception 
    {
        int[] nums = {2,7,11,15};
        int target = 9;

        Solution sol = new Solution();
        
        System.out.println(sol.twoSum(nums, target));
    }

    public int[] twoSum(int[] nums, int target) 
    {
        int numLen = nums.length;
        int [] numArray = new int[2];
        
        for(int i = 0; i < numLen; i++)
        {
            for (int j = i + 1; j < numLen; j++)
            {
                if (nums[j] == target - nums[i])
                {
                    numArray[0] = j;
                    numArray[1] = i;
                }
            }
        }
        return numArray;
    }
}
