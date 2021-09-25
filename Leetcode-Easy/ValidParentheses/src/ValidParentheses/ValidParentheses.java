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

		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
		System.out.println(isValid(s3));
		System.out.println(isValid(s4));
	}

	public static boolean isValid(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				for (int t = 1; t < s.length(); t++) {
					if (s.charAt(t) == ')') {
						return true;
					} else if (s.charAt(t + 1) == '}' || s.charAt(t + 1) == ']') {
						return false;
					} else {
						continue;
					}
				}
			} else if (s.charAt(i) == '[') {
				for (int t = 1; t < s.length(); t++) {
					if (s.charAt(t) == ']') {
						return true;
					} else if (s.charAt(t + 1) == '}' || s.charAt(t + 1) == ')') {
						return false;
					} else {
						continue;
					}
				}
			} else if (s.charAt(i) == '{') {
				for (int t = 1; t < s.length(); t++) {
					if (s.charAt(t) == '}') {
						return true;
					} else if (s.charAt(t + 1) == ')' || s.charAt(t + 1) == ']') {
						return false;
					} else {
						continue;
					}
				}
			}
		}
		return false;
	}
}
