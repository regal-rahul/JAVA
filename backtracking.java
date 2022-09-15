
public class backtracking {
    public static void printPermuation(String str, String permuation, int idx) {
        if (str.length() == 0) {
            System.out.println(permuation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermuation(newStr, permuation + currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermuation(str, "", 0);
    }

}
