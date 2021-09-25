package MaximumTotalPoints;

/*
 * Input: [3,5,8]
	Output: 152
	Explanation:  
	nums =  [3,5,8] → [3,8] →  [8]  → []
	points = 3*5*8  + 1*3*8 + 1*8*1 = 152
 */
public class MaximumTotalPoints 
{

	public static void main(String[] args) 
	{
		int[] nums = {3,5,8}; //152
		System.out.println(maxPoints(nums));
	}

	public static int maxPoints(int[] nums) 
	{
	    return 5;
	}
}
