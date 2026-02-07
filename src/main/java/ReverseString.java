public class ReverseString {
    public static void reverseString(char[] s) {
        int length = s.length -1;
        for (int i = 0 ; i < s.length ; i++) {
            if (i == s.length / 2) {
                break;
            }
            char temp = s[i];
            s[i] = s[length];
            s[length] = temp;

            length--;
        }
    }

    public static void main(String[] args) {

    }
}
