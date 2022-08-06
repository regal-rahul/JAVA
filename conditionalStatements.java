import java.util.Scanner;

import java.util.*;

public class conditionalStatements {
    public static void main(String[] args) {
        // TODO take user age input and print adult if above 18 if not print not adult.
        // Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();

        // if (age >= 18) {
        // System.out.println("User is Adult");
        // } else {
        // System.out.println("User is Not an Adult");
        // }

        // TODO take number input from user and print if its Odd or Even

        // Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("Number is Even");
        // } else {
        // System.out.println("Number is Odd");
        // }

        // TODO take user input of 2 numbers as 'a' and 'b' and print
        // 1. if a is equal to b
        // 2. if a is greater than b
        // 3. if a is lesser than b

        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // solution 1

        // if (a == b) {
        // System.out.println("A is equal to B");
        // } else {
        // if (a > b) {
        // System.out.println("A is greater than B");
        // } else {
        // System.out.println("A is less than B");
        // }
        // }

        // solution 2

        // if (a == b) {
        // System.out.println("A is equal to B");
        // } else if (a > b) {
        // System.out.println("A is greater than B");
        // } else {
        // System.out.println("A is less than B");
        // }

        // TODO take input from user for any one number among (1, 2, 3) and
        // do the following task
        // print hello if input is 1
        // print namaste if input is 2
        // print bonjour is input is 3

        // solution 1

        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        // solution 1

        // if (button == 1) {
        // System.out.println("Hello");
        // } else if (button == 2) {
        // System.out.println("Namaste");
        // } else if (button == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("Invalid button! Choose any one : 1, 2 or 3");
        // }

        // solution 2

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}
