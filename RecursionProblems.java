//Henry Lam
//11/5/24
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

    // Counts non-overlapping occurrences of the substring `sub` in `str`
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0; // Base case: if `str` is shorter than `sub`, return 0
        if (str.startsWith(sub)) { // Check if `str` starts with `sub`
            return 1 + strCount(str.substring(sub.length()), sub); // Count one, move forward by sub's length
        }
        return strCount(str.substring(1), sub); // Move one character forward if no match at start
    }

    // Returns a "cleaned" version of the string with consecutive duplicates removed
    public static String stringClean(String str) {
        if (str.length() < 2) return str; // Base case: if `str` has fewer than 2 chars, return `str`
        if (str.charAt(0) == str.charAt(1)) { // Check if first two characters are the same
            return stringClean(str.substring(1)); // Skip the duplicate character
        }
        return str.charAt(0) + stringClean(str.substring(1)); // Keep first character, clean the rest
    }

}