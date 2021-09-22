package LinearSearch;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int[] nums = {1, 3, 5, 7, 8, 9, 10, 12, 13, 15, 17, 19, 30, 36, 46, 67, 79};
		int itemToFind = 46;
		System.out.println(linearSearch(nums, itemToFind));
	}

	public static int linearSearch(int[] nums, int find)
	{
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == find)
			{
				return i;
			}
		}
		return 0;
	}

}
