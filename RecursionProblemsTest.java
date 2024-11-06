//Henry Lam
//11/5/24
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

    // Tests for countHi method
    @Test
    void testCountHi() {
        assertEquals(1, RecursionProblems.countHi("xxhixx")); // One "hi" in the string should return 1
        assertEquals(2, RecursionProblems.countHi("xhixhix")); // Two "hi" should return 2
        assertEquals(1, RecursionProblems.countHi("hi")); // Single "hi" at the start should return 1
        assertEquals(0, RecursionProblems.countHi("hello")); // No "hi" in input should return 0
        assertEquals(3, RecursionProblems.countHi("hihihi")); // Three "hi" without overlap should return 3
    }

    // Tests for countHi2 method
    @Test
    void testCountHi2() {
        assertEquals(1, RecursionProblems.countHi2("ahixhi")); // Only one "hi" should count due to 'x'
        assertEquals(2, RecursionProblems.countHi2("ahibhi")); // Two "hi" with no 'x' should return 2
        assertEquals(0, RecursionProblems.countHi2("xhixhi")); // "hi" after 'x' should be ignored, return 0
        assertEquals(1, RecursionProblems.countHi2("hixhi")); // Single "hi" with 'x' ignored should return 1
        assertEquals(1, RecursionProblems.countHi2("ahixhixhi")); // Only first "hi" should count, return 1
    }

    // Tests for strCount method
    @Test
    void testStrCount() {
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat")); // Two "cat" should return 2
        assertEquals(1, RecursionProblems.strCount("catcowcat", "cow")); // Single "cow" should return 1
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog")); // No "dog" should return 0
        assertEquals(3, RecursionProblems.strCount("catcatcat", "cat")); // Three "cat" without overlap should return 3
        assertEquals(0, RecursionProblems.strCount("catcatt", "att")); // No non-overlapping "att" should return 0
    }

    // Tests for stringClean method
    @Test
    void testStringClean() {
        assertEquals("yza", RecursionProblems.stringClean("yyzzza")); // Consecutive "yy" and "zzz" cleaned
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd")); // Consecutive "bbb" and "dd" cleaned
        assertEquals("Helo", RecursionProblems.stringClean("Hello")); // Consecutive "ll" cleaned
        assertEquals("a", RecursionProblems.stringClean("a")); // Single character should return as-is
        assertEquals("", RecursionProblems.stringClean("")); // Empty string should return as-is
    }

}