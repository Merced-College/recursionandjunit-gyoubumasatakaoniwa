//Henry Lam
//10/25/24
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

}