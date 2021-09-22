package maxconsecutive1s;

public class MaxConsecutive1s {

    /**
     * Problem: Given a binary array nums, 
     * return the maximum number of consecutive 1's in the array.
     * 
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * 
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     * 
     * @param args
     */
    public static void main(String[] args) 
    {
        int[] nums = {0,0,0,1,1,1, 0, 1, 1, 2, 1, 1, 1, 1, 12, 34, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    
    public static int findMaxConsecutiveOnes(int[] nums) 
    {
        int consecutiveOnes = 0;
        int mostConsecutives = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                consecutiveOnes++;
                
                if(consecutiveOnes > mostConsecutives)
                {
                    mostConsecutives = consecutiveOnes;
                }
            }
            else
            {
                consecutiveOnes = 0;
            }
        }
        
        return mostConsecutives;
    }
    
}
