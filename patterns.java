public class patterns {
    public static void main(String[] args) {

        // PROBLEM: print a rectangle made up of *
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // PROBLEM: Rectangular box with boundary only
        // another pattern
        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // PROBLEM: half pyramid
        // int n = 4;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // PROBLEM: inverted half pyramid

        // int n = 4;

        // for (int i = n; i >= 1; i--) {
        // for (int j = i; j >= 1; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // PROBLEM: half pyramid inverted rotated by 180deg

        // int n = 4;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // PROBLEM: print number pattern in half pyramid structure

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // PROBLEM: inverted half pyramid with numbers
        // 5 4 3 2 1
        // 4 3 2 1
        // 3 2 1
        // 2 1
        // 1

        // int n = 5;

        // for (int i = n; i >= 1; i--) {
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // PROBLEM: inverted half pyramid with numbers
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // PROBLEM: Floyd's Triangle
        // int n = 5;
        // int num = 1;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }

        // PROBLEM: print half pyramid with 0-1 numbers
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
