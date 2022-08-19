import java.util.*;

public class secondProblem {
    // 1
    // Make a function to check if a number is prime or not.

    // public static boolean isPrime(int num) {
    // if (num <= 1) {
    // return false;
    // } else if (num == 2) {
    // return true;
    // } else if (num == 2) {
    // return true;
    // } else if (num % 2 == 0) {
    // return false;
    // } else {
    // for (int i = 3; i <= Math.sqrt(num); i += 2) {
    // if (num % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // if (isPrime(n)) {
    // System.out.println(n + " is a Prime number");
    // } else {
    // System.out.println(n + " is not Prime.");
    // }
    // sc.close();
    // }

    // 2
    // Make a function to check if a given number n is even or not.
    // public static boolean isEven(int n) {
    // if (n % 2 == 0) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();

    // if (isEven(num)) {
    // System.out.println(num + " is Even.");
    // } else {
    // System.out.println(num + " is not Even.");
    // }
    // sc.close();
    // }

    // 3
    // Make a function to print the table of a given number n.
    public static void table(int n, Integer... val) {
        int i = 1;

        if (val.length != 0)
            i = val[0];
        if (i == 11)
            return;
        System.out.println(n + " * " + i + " = " + n * i);
        i++;
        table(n, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println();
        System.out.println("Table of " + num + " :");
        table(num);
        sc.close();
    }
}
