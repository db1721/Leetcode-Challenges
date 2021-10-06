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
public class ValidParentheses {

    public static void main(String[] args) {
        String s1 = "()"; // true
        String s2 = "()[]{}";// true
        String s3 = "([)]";// false
        String s4 = "{[]}";// true
        String s5 = "[";// false

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
    }

    public static boolean isValid(String s) {
        Boolean finalBool = null;
        StringBuilder sbf = new StringBuilder(s);
            for (int i = 0; i < sbf.length(); i++) {
                switch (sbf.charAt(i)) {
                    case ')':
                        if (sbf.charAt(i - 1) == '(') {
                            sbf.deleteCharAt(i);
                            sbf.deleteCharAt(i - 1);
                            finalBool=true;
                            continue;
                        } else {
                            return false;
                        }
                    case ']':
                        if (sbf.charAt(i - 1) == '[') {
                            sbf.deleteCharAt(i);
                            sbf.deleteCharAt(i - 1);
                            finalBool=true;
                            continue;
                        } else {
                            return false;
                        }
                    case '}':
                        if (sbf.charAt(i - 1) == '{') {
                            sbf.deleteCharAt(i);
                            sbf.deleteCharAt(i - 1);
                            finalBool=true;
                            continue;
                        } else {
                            return false;
                        }
                    default:
                        finalBool=false;
                }
            }
        return finalBool;
    }
}
