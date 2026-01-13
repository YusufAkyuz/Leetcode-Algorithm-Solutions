import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) {
                    return false;
                }
            } else {
                if (map.containsValue(w)) {
                    return false;
                }
                map.put(c, w);
            }
        }
        return true;
    }
    public boolean wordPatternS(String pattern, String s) {
        String [] elementOfS = s.split(" ");
        char [] charsOfPattern = pattern.toCharArray();

        Map<Character, String> map = new HashMap<>();

        if (elementOfS.length != charsOfPattern.length) {
            return false;
        }

        for (int i = 0; i < elementOfS.length; i++) {
            if (map.containsKey(charsOfPattern[i])) {
                if (!Objects.equals(elementOfS[i], map.get(charsOfPattern[i]))) return false;
            } else{
                if (map.containsValue(elementOfS[i])) {
                    return false;
                }
                map.put(charsOfPattern[i], elementOfS[i]);
            }
        }
        return true;
    }
}
