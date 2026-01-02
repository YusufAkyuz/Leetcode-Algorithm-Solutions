public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // Eğer liste boşsa, ortak prefix yoktur
        if (strs == null || strs.length == 0) {
            return "";
        }

        // İlk kelimeyi prefix olarak alıyoruz
        String prefix = strs[0];

        // Diğer kelimelerle sırayla karşılaştır
        for (int i = 1; i < strs.length; i++) {
            // prefix ve strs[i] arasındaki ortak kısmı bul
            prefix = commonPrefix(prefix, strs[i]);

            // Eğer prefix tamamen boşaldıysa, erken bitir
            if (prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
    }
    private static String commonPrefix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        int i = 0;

        while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        return s1.substring(0, i);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String [] {"ali", "ahmet"}));
    }
}
