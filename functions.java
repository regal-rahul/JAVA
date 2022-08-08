import java.util.*;

public class functions {

    // TODO write a function to print name

    // private static void printMyName(String name) {
    // System.out.println(name);
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    //// String name = sc.next();
    // String name = sc.nextLine();

    // printMyName(name); //// calling function
    // }

    // TODO write a function for sum of 2 numbers.

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 numbers is: " + sum);
    }
}
