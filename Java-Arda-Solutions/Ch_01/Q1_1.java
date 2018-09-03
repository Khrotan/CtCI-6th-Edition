public class Q1_1 {
    public boolean isUnique(String str) {
        boolean[] charArray = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            if (charArray[str.charAt(i)])
                return false;

            charArray[str.charAt(i)] = true;
        }

        return true;
    }

    public boolean isUniqueBitVector(String str) {
        int checker = 0;

        for ( int i = 0 ; i < str.length() ; i++ ) {
            int val = 1 << (str.charAt(i) - 'A');

            if ( (checker & val) != 0 ) return false;

            checker |= val;
        }

        return true;
    }

    public static void main(String[] args) {
        Q1_1 q1_1 = new Q1_1();
        String[] words = {"abcde", "hello", "apple", "kite", "padle", "KarinmlO"};
        for (String word : words) {
            System.out.println(q1_1.isUniqueBitVector(word));
        }
    }
}
