package ValidParentheses;
/*
* Example 1:
	
	Input: s = "()"
	Output: true
	Example 2:
	
	Input: s = "()[]{}"
	Output: true
	Example 3:
	
	Input: s = "(]"
	Output: false
	Example 4:
	
	Input: s = "([)]"
	Output: false
	Example 5:
	
	Input: s = "{[]}"
	Output: true
 */
public class ValidParentheses 
{

	public static void main(String[] args) 
	{
		String s1 = "()"; //true
		String s2 = "()[]{}";//true
		String s3 = "([)]";//false
		String s4 = "{[]}";//true
		
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
		System.out.println(isValid(s3));
		System.out.println(isValid(s4));
	}

	public static boolean isValid(String s) 
    {
		for(int i  = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '(') 
			{
				for(int j  = 0; j < s.length(); j++)
				{
					
				}
			}
			else if(s.charAt(i) == '[') 
			{
				
			}
			else if(s.charAt(i) == '{') 
			{
				
			}
		}
        return false;
    }
}
