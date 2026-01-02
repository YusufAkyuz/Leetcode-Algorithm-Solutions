import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // Map ile çözüm denenecek
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (char chr : s.toCharArray()) {
            if (mapS.containsKey(chr)) {
                mapS.put(chr, mapS.get(chr) + 1);
            }else {
                mapS.put(chr, 1);
            }
        }
        for (char chr : t.toCharArray()) {
            if (mapT.containsKey(chr)) {
                mapT.put(chr, mapT.get(chr) + 1);
            }else {
                mapT.put(chr, 1);
            }
        }

        for (char chr : s.toCharArray()) {
            if (!mapS.get(chr).equals(mapT.get(chr))) {
                return false;
            }
        }
        return true;
    }

    //Anagram problem aslında tek bir hashmap ile çözümü daha doğru ve efektif
    public static boolean isAnagramEfficient(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();

        for (char chr : s.toCharArray()) {
            mapS.put(chr, mapS.getOrDefault(chr, 0) + 1);
        }

        for (char chr : t.toCharArray()) {
            if (!mapS.containsKey(chr)) {
                return false;
            }
            int count = mapS.get(chr);
            if (count == 1) {
                mapS.remove(chr);
            }else {
                mapS.put(chr, count - 1);
            }
        }
        return mapS.isEmpty();
    }

    //Tabi daha verimli bir yöntem'de Arrays kütüphanesini kullanarak her String'i sıralayıp eşitlik durumuna bakmak olacak
    public static boolean isAnagramEfficientPlus(String s, String t) {
        char [] charS = s.toCharArray();
        char [] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return Arrays.equals(charS, charT);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
