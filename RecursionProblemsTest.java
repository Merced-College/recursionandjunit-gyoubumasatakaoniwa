//Henry Lam
//10/25/24
//CPSC-39-12111

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RecursionProblemsTest {

    // Tests for count8 method
    @Test
    void testCount8() {
        assertEquals(1, RecursionProblems.count8(8)); // Single 8 should count as 1
        assertEquals(2, RecursionProblems.count8(818)); // Two 8s separated by 1 should count as 2
        assertEquals(4, RecursionProblems.count8(8818)); // Consecutive 8s count double, totaling 4
        assertEquals(0, RecursionProblems.count8(123456)); // No 8s in input should return 0
        assertEquals(3, RecursionProblems.count8(888)); // Three consecutive 8s should count as 3
    }

}