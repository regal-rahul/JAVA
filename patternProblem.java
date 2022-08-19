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
    // public static void main(String[] args) {
    // int n = 5;

    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }

    // // first part
    // for (int j = i; j >= 1; j--) {
    // System.out.print(j);
    // }

    // // second part
    // for (int j = 2; j <= i; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }

    // 4
    // Print a hollow butterfly pattern
    // public static void main(String[] args) {
    // int n = 5;
    // int m = 4;
    // for (int j = 1; j <= n; j++) { // 1st outer loop

    // for (int k = 1; k <= j; k++) { // Star Printing - 2nd inner loop
    // if (k == 1 || k == j)
    // System.out.print("*");
    // else
    // System.out.print(" ");
    // }

    // for (int k = n; k >= j; k--) { // Spaces
    // System.out.print(" ");
    // }

    // for (int k = 1; k <= j; k++) { // Star Printing - 2nd inner loop
    // if (k == 1 || k == j)
    // System.out.print("*");
    // else
    // System.out.print(" ");
    // }
    // System.out.println();
    // }

    // for (int j = 1; j <= m; j++) { // 2nd outer for loop

    // for (int k = m; k >= j; k--) { // Stars printing - 2nd inner for
    // // loop
    // if (k == m || k == j)
    // System.out.print("*");
    // else
    // System.out.print(" ");

    // }

    // for (int k = 0; k <= j; k++) { // Spaces
    // System.out.print(" ");
    // }

    // for (int k = m; k >= j; k--) { // Star Printing - 2nd inner loop
    // if (k == m || k == j)
    // System.out.print("*");
    // else
    // System.out.print(" ");
    // }

    // System.out.println();
    // }
    // }

    // 5
    // Print a hollow Rhombus.
    // public static void main(String[] args) {
    // int n = 5;

    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // if (j == 1 || i == 1 || i == n || j == n) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // 6
    // Print pascal triangle
    // public static void main(String[] args) {

    // int n = 5;

    // for (int i = 1; i <= n; i++) {
    // // spacing
    // for (int j = n; j >= i; j--) {
    // System.out.print(" ");
    // }
    // int c = 1;
    // for (int j = 1; j <= i; j++) {
    // System.out.print(c + " ");
    // c = c * (i - j) / j;
    // }
    // System.out.println();
    // }
    // }

    // 7
    // Print half number pyramid with increasing number in every line.
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}