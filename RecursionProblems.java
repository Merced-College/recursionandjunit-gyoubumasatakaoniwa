//Henry Lam
//11/3/24
//CPSC-39-12111

public class RecursionProblems {

    // Counts occurrences of 8 in the number n, with double counting for consecutive 8s
    public static int count8(int n) {
        if (n == 0) return 0; // Base case: if n is 0, return 0
        if (n % 10 == 8) { // Check if the last digit is 8
            if ((n / 10) % 10 == 8) { // Check if the next-to-last digit is also 8
                return 2 + count8(n / 10); // Count two for consecutive 8s, and continue recursion
            }
            return 1 + count8(n / 10); // Count one for a single 8, and continue recursion
        }
        return count8(n / 10); // No 8 detected, continue recursion with remaining digits
    }

    // Counts occurrences of "hi" in the given string
    public static int countHi(String str) {
        if (str.length() < 2) return 0; // Base case: if string has fewer than 2 chars, return 0
        if (str.startsWith("hi")) { // Check if the string starts with "hi"
            return 1 + countHi(str.substring(2)); // Count one and skip past "hi" for next recursion
        }
        return countHi(str.substring(1)); // Skip one character if no "hi" at the start
    }

    // Counts "hi" occurrences, ignoring those with 'x' immediately before them
    public static int countHi2(String str) {
        if (str.length() < 2) return 0; // Base case: if string has fewer than 2 chars, return 0
        if (str.startsWith("hi")) return 1 + countHi2(str.substring(2)); // Count "hi" if no 'x' before
        if (str.startsWith("xhi")) return countHi2(str.substring(3)); // Skip "xhi" to ignore this "hi"
        return countHi2(str.substring(1)); // Skip one character if neither "hi" nor "xhi"
    }

}