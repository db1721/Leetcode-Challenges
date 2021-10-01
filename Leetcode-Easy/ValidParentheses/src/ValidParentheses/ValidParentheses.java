package ValidParentheses;

import java.lang.*;

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

	public static boolean isValid(String str) {
		StringBuffer sbf = new StringBuffer(str);
		do{
		for (int i = 0; i < sbf.length(); i++) {
			if (sbf.charAt(i) == ')') {
				if (sbf.charAt(i - 1) == '(') {
					sbf.deleteCharAt(i);
					sbf.deleteCharAt(i-1);
					continue;
				} else {
					return false;
				}
			} else if (sbf.charAt(i) == ']') {
				if (sbf.charAt(i - 1) == '[') {
					sbf.deleteCharAt(i);
					sbf.deleteCharAt(i-1);
					continue;
				} else {
					return false;
				}
			}else if (sbf.charAt(i) == '}') {
				if (sbf.charAt(i - 1) == '{') {
					sbf.deleteCharAt(i);
					sbf.deleteCharAt(i-1);
					continue;
				} else {
					return false;
				}
			}
		}
	}
		while(sbf.isEmpty() == false);
		if(sbf.isEmpty() == true){
			return true;
		}
		else{
			return false;
		}
	}
}
