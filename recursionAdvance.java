import java.util.ArrayList;

public class recursionAdvance {
    // Print all permutations of a string
    //
    // public static void printPermuation(String str, String permutation) {
    // if (str.length() == 0) {
    // System.out.println(permutation);
    // return;
    // }

    // for (int i = 0; i < str.length(); i++) {
    // char currChar = str.charAt(i);

    // String newStr = str.substring(0, i) + str.substring(i + 1);
    // printPermuation(newStr, permutation + currChar);
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // printPermuation(str, "");
    // }

    // Count total paths in maze to move from (0,0) to (n,m)
    //
    // public static int countPaths(int i, int j, int n, int m) {
    // if (i == n || j == m) {
    // return 0;
    // }
    // if (i == n - 1 && j == n - 1) {
    // return 1;
    // }

    // int downPaths = countPaths(i + 1, j, n, m);
    // int rightPaths = countPaths(i, j + 1, n, m);

    // return downPaths + rightPaths;
    // }

    // public static void main(String[] args) {
    // int n = 3, m = 3;
    // int totalPaths = countPaths(0, 0, n, m);
    // System.out.println(totalPaths);
    // }

    // PLace Tiles of size 1xM in a floor of size NxM
    //
    // public static int placeTiles(int n, int m) {
    // if (n == m) {
    // return 2;
    // }
    // if (n < m) {
    // return 1;
    // }

    // int verticalPlacements = placeTiles(n - m, m);

    // int horizontalPlacements = placeTiles(n - 1, m);

    // return verticalPlacements + horizontalPlacements;
    // }

    // public static void main(String[] args) {
    // int n = 4, m = 2;
    // System.out.println(placeTiles(n, m));
    // }

    // Find the number of ways in which you can invite n people to your party or in
    // pairs
    //
    // public static int callGuests(int n) {
    // if (n <= 1) {
    // return 1;
    // }

    // int ways1 = callGuests(n - 1);
    // int ways2 = (n - 1) * callGuests(n - 2);

    // return ways1 + ways2;
    // }

    // public static void main(String[] args) {
    // int n = 4;
    // System.out.println(callGuests(n));
    // }

    // Print all the subsets of a set of first n natural numbers
    //
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }

        subset.add(n);
        findSubsets(n - 1, subset);

        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
