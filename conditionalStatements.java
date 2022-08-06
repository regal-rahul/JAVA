import java.util.Scanner;

import java.util.*;

public class conditionalStatements {
    public static void main(String[] args) {
        // TODO take user age input and print adult if above 18 if not print not adult.
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("User is Adult");
        } else {
            System.out.println("User is Not an Adult");
        }
    }
}
