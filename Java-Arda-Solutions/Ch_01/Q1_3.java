import CtCILibrary.AssortedMethods;

public class Q1_3 {


    /**
     * "Mr John Smith    ", 13
     */
    public static void urlify(char[] arr, int trueLength) {
        int lastChar = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != ' ') {
                lastChar = i;
                break;
            }
        }

        for (int i = lastChar, j = arr.length - 1; i >= 0; i--, j--) {
            if (arr[i] != ' ') {
                arr[j] = arr[i];
            } else {
                arr[j] = '0';
                arr[j - 1] = '2';
                arr[j - 2] = '%';
                j = j - 2;
            }
        }
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = 13;
        urlify(arr, trueLength);
        System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
    }
}
