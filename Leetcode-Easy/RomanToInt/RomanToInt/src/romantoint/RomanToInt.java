package romantoint;

public class RomanToInt {

    /**
     * Example 1:

    Input: s = "III"
    Output: 3
    Example 2:

    Input: s = "IV"
    Output: 4
    Example 3:

    Input: s = "IX"
    Output: 9
    Example 4:

    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
    Example 5:

    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
* 
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String s1 = "III"; //3
        String s2 = "IV"; //4
        String s6 = "V"; //5
        String s3 = "IX"; //9
        String s4 = "LVIII"; //58
        String s5 = "MCMXCIV"; //1994
        
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s6));
        System.out.println(romanToInt(s3));
        System.out.println(romanToInt(s4));
        System.out.println(romanToInt(s5));
    }
    
    public static int romanToInt(String s) 
    {
        int convertedInt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            String temp = Character.toString(s.charAt(i));
            if(s.charAt(i) == 'I')
            {
                convertedInt += 1;
            }
            else if(s.charAt(i) == 'V')
            {
                if(i > 0 && s.charAt(i - 1) == 'I')
                {
                    convertedInt += 3;
                }
                else
                {
                    convertedInt += 5;
                }
            }
            else if(s.charAt(i) == 'X')
            {
                if(i > 0 && s.charAt(i - 1) == 'I')
                {
                    convertedInt += 8;
                }
                else
                {
                    convertedInt += 10;
                }
            }
            else if(s.charAt(i) == 'L')
            {
                if(i > 0 && s.charAt(i - 1) == 'X')
                {
                    convertedInt += 30;
                }
                else
                {
                    convertedInt += 50;
                }
            }
            else if(s.charAt(i) == 'C')
            {
                if(i > 0 && s.charAt(i - 1) == 'X')
                {
                    convertedInt += 80;
                }
                else
                {
                    convertedInt += 100;
                }
            }
            else if(s.charAt(i) == 'D')
            {
                if(i > 0 && s.charAt(i - 1) == 'C')
                {
                    convertedInt += 300;
                }
                else
                {
                    convertedInt += 500;
                }
            }
            else if(s.charAt(i) == 'M')
            {
                if(i > 0 && s.charAt(i - 1) == 'C')
                {
                    convertedInt += 800;
                }
                else
                {
                    convertedInt += 1000;
                }
            }
            else
            {
                //nothing should happen?
            }
        }
        return convertedInt;
    }  
}
