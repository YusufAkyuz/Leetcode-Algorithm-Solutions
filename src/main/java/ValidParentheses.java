import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char chr : s.toCharArray()) {

            if (chr == '(' || chr == '{' || chr == '[') {

                stack.push(chr);

            } else if (chr == ')' || chr == '}' || chr == ']'){

                if (stack.isEmpty()) return false;

                char peekValue = stack.peek();
                if (
                        (chr == ')' && peekValue != '(') ||
                        (chr == '}' && peekValue != '{') ||
                        (chr == ']' && peekValue != '[')
                ) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
