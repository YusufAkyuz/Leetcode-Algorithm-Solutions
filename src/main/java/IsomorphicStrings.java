import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> mapSS = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            // s -> t tutarlılık
            if (mapSS.containsKey(cs)) {
                if (mapSS.get(cs) != ct) return false;
            } else {
                mapSS.put(cs, ct);
            }

            // t -> s tutarlılık (çakışmayı engeller)
            if (mapTS.containsKey(ct)) {
                if (mapTS.get(ct) != cs) return false;
            } else {
                mapTS.put(ct, cs);
            }
        }

        return true;
    }


    public static void main(String[] args) {

    }
}
