public class patternProblem {
    // 1
    // Print a solid rhombus.
    // public static void main(String[] args) {
    // int n = 5;

    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }

    // // stars
    // for (int j = 1; j <= n; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // 2
    // Print a number pyramid.
    // public static void main(String[] args) {
    // int n = 5;

    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // numbers
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }
    // }

    // 3
    // Print a palindromic number pyramid.
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
