package Template.src;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int[] nums = {2,7,11,15};
        int target = 9;
        theProblem(nums, target);
        
        System.out.println("This is a template!");
    }

    //The leetcode problem goes here
    public static int[] theProblem(int[] nums, int target) 
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
