import java.util.*;

public class conditionalStatements {
    public static void main(String[] args) {
        // PROBLEM: take user age input and print adult if above 18 if not print not
        // adult.
        // Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();

        // if (age >= 18) {
        // System.out.println("User is Adult");
        // } else {
        // System.out.println("User is Not an Adult");
        // }

        // PROBLEM: take number input from user and print if its Odd or Even

        // Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("Number is Even");
        // } else {
        // System.out.println("Number is Odd");
        // }

        // PROBLEM: take user input of 2 numbers as 'a' and 'b' and print
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

        // PROBLEM: take input from user for any one number among (1, 2, 3) and
        // do the following task
        // print hello if input is 1
        // print namaste if input is 2
        // print bonjour is input is 3

        // solution 1

        // Scanner sc = new Scanner(System.in);

        // int button = sc.nextInt();

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

        // switch (button) {
        // case 1:
        // System.out.println("Hello");
        // break;
        // case 2:
        // System.out.println("Namaste");
        // break;
        // case 3:
        // System.out.println("Bonjour");
        // break;
        // default:
        // System.out.println("Invalid button");
        // }

        // PROBLEM: Self Practice
        // Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
        // follows :
        // 1 : + (Addition) a + b
        // 2 : - (Subtraction) a - b
        // 3 : * (Multiplication) a * b
        // 4 : / (Division) a / b
        // 5 : % (Modulo or remainder) a % b
        // Calculate the result according to the operation given and display it to the
        // user.
        // Ask the user to enter the number of the month & print the name of the month.
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

        // Solution 1

        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = a + b;
        // int diff = a - b;
        // int mul = a * b;
        // int div = a / b;
        // int mod = a % b;

        // System.out.println(sum);
        // System.out.println(diff);
        // System.out.println(mul);
        // System.out.println(div);
        // System.out.println(mod);

        // solution 2

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;

            default:
                System.out.println("Invalid month number!!!!");
        }
        sc.close();
    }
}
