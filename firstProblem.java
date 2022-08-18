import java.util.*;

public class firstProblem {
    // 1
    // Try to declare meaningful variables of each type. Eg - a variable named age
    // should be a numeric type (int or float) not byte.

    // public static void main(String[] args) {
    // String name = "Rahul Kumar";
    // int age = 23;
    // float height = 5.67f;
    // boolean bool = true;
    // char grade = 'A';
    // byte byteNum = 111;
    // double dNum = 9.943534857345d;
    // long lNum = 9128472387234273489L;
    // short sNum = 29999;

    // System.out.println(name + " is " + age + " yrs old and " + height + " feet
    // height");
    // System.out.println("Boolean: " + bool);
    // System.out.println("grade: " + grade);
    // System.out.println("byteNum: " + byteNum + ", dNum: " + dNum + ", lNum: " +
    // lNum + ", sNum: " + sNum);
    // }

    // 2
    // Make a program that takes the radius of a circle as input, calculates its
    // radius and area and prints it as output to the user.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // float rad = sc.nextFloat();

    // float pi = 3.14f;

    // float diameter = 2 * rad;
    // float circumference = 2 * (pi * rad);
    // float area = pi * (rad * rad);

    // System.out.println("Diameter of the circle is: " + diameter);
    // System.out.println("Circumference of the circle is: " + circumference);
    // System.out.println("Area of the circle: " + area);
    // }

    // 3
    // Make a program that prints the table of a number that is input by the user.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();

    // System.out.println(num * 1);
    // System.out.println(num * 2);
    // System.out.println(num * 3);
    // System.out.println(num * 4);
    // System.out.println(num * 5);
    // System.out.println(num * 6);
    // System.out.println(num * 7);
    // System.out.println(num * 8);
    // System.out.println(num * 9);
    // System.out.println(num * 10);
    // }

    // 4
    // Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
    // follows :
    // 1 : + (Addition) a + b
    // 2 : - (Subtraction) a - b
    // 3 : * (Multiplication) a * b
    // 4 : / (Division) a / b
    // 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the
    // user.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter first number: ");
    // int a = sc.nextInt();
    // System.out.print("Enter second number: ");
    // int b = sc.nextInt();

    // System.out.println();

    // System.out.println(
    // "List of operation you can perform:\n1: Add\n2: Subtract\n3: Multiply\n4:
    // Division\n5: Modulo or Remainder");
    // System.out.print("Choose a number to perform operation: ");
    // int operation = sc.nextInt();

    // System.out.println();
    // switch (operation) {
    // case 1:
    // int sum = a + b;
    // System.out.println("Sum: " + sum);
    // break;
    // case 2:
    // int sub = a - b;
    // System.out.println("Diffrence: " + sub);
    // break;
    // case 3:
    // int mul = a * b;
    // System.out.println("Product: " + mul);
    // break;
    // case 4:
    // int div = a / b;
    // System.out.println("Quotient: " + div);
    // break;
    // case 5:
    // int mod = a % b;
    // System.out.println("Remainder: " + mod);
    // break;

    // default:
    // System.out.println("Invalid Input!! Run the program again.");
    // }
    // }

    // 5
    // Ask the user to enter the number of the month & print the name of the month.
    // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the month number to find out the name: ");
    // int month = sc.nextInt();
    // System.out.println();

    // switch (month) {
    // case 1:
    // System.out.println(month + ": January");
    // break;
    // case 2:
    // System.out.println(month + ": February");
    // break;
    // case 3:
    // System.out.println(month + ": March");
    // break;
    // case 4:
    // System.out.println(month + ": April");
    // break;
    // case 5:
    // System.out.println(month + ": May");
    // break;
    // case 6:
    // System.out.println(month + ": June");
    // break;
    // case 7:
    // System.out.println(month + ": July");
    // break;
    // case 8:
    // System.out.println(month + ": August");
    // break;
    // case 9:
    // System.out.println(month + ": September");
    // break;
    // case 10:
    // System.out.println(month + ": October");
    // break;
    // case 11:
    // System.out.println(month + ": November");
    // break;
    // case 12:
    // System.out.println(month + ": December");
    // break;

    // default:
    // System.out.println("Invalid Input!! Restart the program again.");
    // break;
    // }
    // }

    // 6
    // Print all even numbers till n.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int num = sc.nextInt();

    // for (int i = 1; i <= num; i++) {
    // if (i % 2 == 0) {
    // System.out.println(i);
    // } else {
    // System.out.print("");
    // }
    // }
    // sc.close();
    // }
    // 7
    // Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
    // If the user enters 1 then keep taking input from the user for a student’s
    // marks(out of 100).
    // If they enter 0 then stop.
    // If he/she scores :
    // Marks >=90 -> print “This is Good”
    // 89 >= Marks >= 60 -> print “This is also Good”
    // 59 >= Marks >= 0 -> print “This is Good as well”

    // solution
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int input;

    // do {
    // int marks = sc.nextInt();
    // if (marks >= 90) {
    // System.out.println("OutStanding");
    // } else if (89 >= marks && marks >= 60) {
    // System.out.println("Good");
    // } else if (59 >= marks && marks >= 0) {
    // System.out.println("Average");
    // } else {
    // System.out.println("Enter marks between 0 to 100.");
    // }
    // System.out.println("Want to continue ? (YES: 1 or NO: 0)");
    // input = sc.nextInt();
    // } while (input == 1);
    // sc.close();

    // 8
    // Print if a number is prime or not (Input n from the user).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (n == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }
        sc.close();
    }
}
