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
		char closeFirst;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
				case '(':
				closeFirst = ')';
					for (int j = 1; j < s.length(); j++) {
						if (s.charAt(j) == ')') {
							//j
						}
					}
				case '{':
					// System.out.println("}");
				case '[':
					// System.out.println("]");
			}
		}
		return false;
	}
}
