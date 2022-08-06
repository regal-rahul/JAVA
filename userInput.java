import java.util.*;

public class userInput {
    public static void main(String[] args) {
        // input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // takes single token input
        // String name = sc.nextLine(); // can take multiple token input

        // nextInt()
        // nextFloat()
        // System.out.println(name);

        // TODO Take 2 variables 'a' and 'b' and print their sum.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}