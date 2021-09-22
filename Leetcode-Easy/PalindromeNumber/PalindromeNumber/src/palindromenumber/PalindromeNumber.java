package palindromenumber;

public class PalindromeNumber {

    /**
     *  Example 1:
        Input: x = 121
        Output: true
        Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. 
        * Therefore it is not a palindrome.
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        Example 4:

        Input: x = -101
        Output: false
        
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x = 12345; //should be false
        int y = 121; //should be true
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
    }
    public static boolean isPalindrome(int x) 
    {
        String forward = String.valueOf(x);
        String reverse = "";
        if(x >= 0)
        {
            for(int i = forward.length() - 1; i >= 0; i--)
            {
                reverse = reverse + Character.toString(forward.charAt(i));
            }
            return forward.equals(reverse);
        }
        else
        {
          return false;  
        }
    }
    
}
