package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] nums = {1, 3, 5, 7, 8, 9, 10, 12, 13, 15, 17, 19, 30, 36, 46, 67, 79};
		int itemToFind = 46;
		System.out.println(binarySearch(nums, itemToFind));
	}

	public static int binarySearch(int[] nums, int find)
	{
		int low = 0;
		int high = nums.length - 1;
		int guess = 0;
		
		
		while(low <= high)
		{
			int mid = (low + high) / 2;
			guess = nums[mid];
			
			if (guess == find)
			{
				return mid;
			}
			else if(guess < find)
			{
				low = mid - 1;
			}
			else if (guess > find)
			{
				high = mid + 1;
			}
			else
			{
				return 0;
			}
		}
		return 0;
	}
}
