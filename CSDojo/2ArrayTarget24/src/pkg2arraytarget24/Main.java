package pkg2arraytarget24;

import java.util.Arrays;

/**
 * Problem:
 * [-1, 3, 8, 2, 9, 4]
 * [4, 1, 2, 10, 5, 20]
 * Target: 24
 *  Find what index in each array adds up to 24
 */
public class Main 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {-1, 3, 8, 2, 9, 5, 4};
        int[] arr2 = {4, 1, 2, 10, 5, 20};
        int target = 24;
        int[] finalArrayIndexes = {0, 0};

        for(int a = 0; a < arr1.length; a++)
        {
            for(int b = 0; b < arr2.length; b++)
            {
                if(arr1[a] + arr2[b] == target)
                {
                    finalArrayIndexes[0] = arr1[a];
                    finalArrayIndexes[1] = arr2[b];
                    System.out.println(String.format("%d from array 1 and %d from array 2 equal 24", 
                            arr1[a],arr2[b]));
                    break;
                }
            }
        }
    }
    
}
