package reverseinteger;

public class ReverseInteger 
{

    /** Example 1:
        Input: x = 123
        Output: 321
        Example 2:

        Input: x = -123
        Output: -321
        Example 3:

        Input: x = 120
        Output: 21
        Example 4:

        Input: x = 0
        Output: 0
   
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x = 12345;
        System.out.println(reverse(x));
    }
    
    public static int reverse(int x) 
    {
        try{
 
        String value = Integer.toString(x);
        String newValue = "";
        if(x > 0) {
            for (int i = value.length() - 1; i >= 0 ; i--) 
            {
                newValue = newValue + Character.toString(value.charAt(i));
            }
            //newValue = Integer.parseInt(newValue);
            return Integer.parseInt(newValue);
        } else if (x < 0) {
            for (int i = value.length() - 1; i >= 1 ; i--) 
            {
                newValue = newValue + Character.toString(value.charAt(i));
            }
            return Integer.parseInt("-" + newValue);
        } else {
            //this is a zero
            return 0;
        }
        }
        catch(Exception e)
        {
            return 0;
        }
    }
    
}
