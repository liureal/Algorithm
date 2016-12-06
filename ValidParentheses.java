import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        try {
        	for (char cStr : c) {
        		switch (cStr) {
        		case '(':
        			stack.push(cStr);
        			break;
        		case '[':
        			stack.push(cStr);
        			break;
        		case '{':
        			stack.push(cStr);
        			break;
        		case ')':
        			if (stack.pop() != '(') 
        				return false;
        			break;
        		case ']':
        			if (stack.pop() != '[')
        				return false;
        			break;
        		case '}':
        			if (stack.pop() != '{')
        				return false;
        			break;
        		default:
        			break;
        		}
        	}
		} catch (Exception e) {
			return false;
		}
        if (!stack.isEmpty()) {
			return false;
		}
		return true;
    }
}
