public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String [] strArr = s.split(" ");
        String lastValue = strArr[strArr.length-1];
        for (int i = 0; i < lastValue.length(); i++) {
            if (lastValue.charAt(i) == ' ') {
                lastValue = lastValue.substring(i+1, lastValue.length()-1);
            }
        }
        return lastValue.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
