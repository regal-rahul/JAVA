import java.util.*;

public class functions {

    // PROBLEM: write a function to print name

    // public static void printMyName(String name) {
    // System.out.println(name);
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    //// String name = sc.next();
    // String name = sc.nextLine();

    // printMyName(name); //// calling function
    // }

    // PROBLEM: write a function for sum of 2 numbers.

    // public static int calculateSum(int a, int b) {
    // int sum = a + b;
    // return sum;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int sum = calculateSum(a, b);
    // System.out.println("Sum of 2 numbers is: " + sum);
    // }

    // PROBLEM: make a function to multiply 2 numbers and return the product

    // public static int calculateMultiply(int a, int b) {
    // int multiply = a * b;
    // return multiply;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int multiply = calculateMultiply(a, b);

    // System.out.println("Product of the two number is: " + multiply);
    // }

    // PROBLEM: factorial of a number

    public static void calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number!");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);
        sc.close();
    }
}
