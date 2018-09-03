import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_2 {
    public static boolean isPermutation(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return new String(arr1).equals(new String(arr2));
    }

    public static boolean isPermutationCount(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] c1 = new int[255];
        int[] c2 = new int[255];

        for (int i = 0; i < s1.length(); i++) {
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (c1[i] != c2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = isPermutationCount(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}
