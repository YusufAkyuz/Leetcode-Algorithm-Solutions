import java.util.Stack;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        String str = String.valueOf(x);
        for (char chr : str.toCharArray()) {
            stack.push(chr);
        }
        for (char chr : str.toCharArray()) {
            if(stack.pop() != chr) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
