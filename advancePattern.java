import java.util.*;

/**
 * advancePattern
 */
public class advancePattern {
    public static void main(String[] args) {

        // TODO butterfly pattern with stars *

        // int n = 5;
        // first upper-half pattern
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // second upper-half pattern
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // lower-half
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // second upper-half pattern
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // TODO print a solid rhombus with stars

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // spaces printing
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // stars printing
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // TODO print a full number pyramid

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // TODO palindrome pattern

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // space
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // 1st half
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // 2nd half
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // TODO diamond pattern

        int n = 4;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}