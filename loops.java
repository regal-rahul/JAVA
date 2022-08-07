import java.util.*;

public class loops {
    public static void main(String[] args) {

        // TODO FOR LOOP
        // for (int i = 0; i < 10; i++) {
        // System.out.println("Hello World");
        // }

        // TODO print numbers from 0 to 10

        // Recommended solution
        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }

        // Another solution
        // for (int i = 0; i < 11; i++) {
        // System.out.println(i);
        // }

        // another solution
        // for (int i = 0; i <= 10; i++)
        // System.out.println(i);

        // TODO WHILE LOOP

        // int i = 0;
        // while (i < 11) {
        // System.out.println(i);
        // i = i + 1;
        // }

        // int i = 0;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }

        // TODO DO WHILE LOOP

        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);

        // TODO while and dowhile check

        // int i = 12;
        // while (i < 11) {
        // System.out.println("While");
        // }

        // // runs the code atleast one and prints even if condition is false
        // do {
        // System.out.println("Do While");
        // } while (i < 11);

        // TODO print the sum of first n natural numbers. take input from user.

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // int sum = 0;
        // for (int i = 0; i <= num; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // TODO print the table of a number input by the user

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(num * i);
        // }

        // TODO print all even number till n.

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        // TODO print all odd number till n.

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // if (i % 2 != 0) {
        // System.out.println(i);
        // }
        // }

        // TODO print if user input number is prime or not

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 2) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }
    }
}
