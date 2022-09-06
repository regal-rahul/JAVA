import java.util.*;

public class bitManipulation {
    public static void main(String[] args) {
        // GET BIT
        //
        // int n = 5;
        // int pos = 3;
        // // int pos = 2;
        // int bitMask = 1 << pos;

        // if ((bitMask & n) == 0) {
        // System.out.println("Bit was Zero.");
        // } else {
        // System.out.println("Bit was One.");
        // }

        // SET BIT
        //
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // CLEAR BIT
        //
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // UPDATE BIT
        //
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt(); // operation(1) = set | operation(0) = clear
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        if (operation == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
