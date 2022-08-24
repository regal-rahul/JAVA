import java.util.*;

public class arraysDDs {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter rows and columns of the arrays: ");
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        // int[][] numbers = new int[rows][cols];

        // // input

        // for (int i = 0; i < rows; i++) {
        // System.out.println("Enter your arrays input: ");
        // for (int j = 0; j < cols; j++) {
        // numbers[i][j] = sc.nextInt();
        // }
        // }
        // sc.close();
        // System.out.println();

        // // output
        // System.out.println("Your array is here: ");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Take a matrix as input from the user. Search for a given number x and print
        // the indices at which it occurs.

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to find: ");
        int x = sc.nextInt();
        sc.close();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }
    }
}
