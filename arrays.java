import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // // int[] marks = new int[3];
        // // int marks[] = new int[3];
        // int marks[] = { 97, 98, 99 };

        // // marks[0] = 97;
        // // marks[1] = 98;
        // // marks[2] = 99;

        // // System.out.println(marks[0]);
        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }

        // User defined arrays

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println();

        System.out.println("Enter the elements of the array:");
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter the element (x) to search: ");
        int x = sc.nextInt();
        System.out.println();

        System.out.println("Your Entered arrays elements are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) {
                System.out.println("x found at index: " + i);
            }
        }
        sc.close();
    }
}
