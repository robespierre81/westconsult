package com.bodiva.nodlehs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallestDivisibleTest {
    
    private final SmallestDivisible smallestDivisible = new SmallestDivisible();

    @Test
    public void testFindSmallestNumberDivisibleByAllBasic() {
        assertEquals(2520, smallestDivisible.findSmallestNumberDivisibleByAll(10));
        assertEquals(360360, smallestDivisible.findSmallestNumberDivisibleByAll(15));
    }

    @Test
    public void testFindSmallestNumberDivisibleByAllZero() {
        assertEquals(1, smallestDivisible.findSmallestNumberDivisibleByAll(0));
    }

    @Test
    public void testFindSmallestNumberDivisibleByAllOne() {
        assertEquals(1, smallestDivisible.findSmallestNumberDivisibleByAll(1));
    }

    @Test
    public void testFindSmallestNumberDivisibleByAllLarge() {
        assertEquals(26771144400L, smallestDivisible.findSmallestNumberDivisibleByAll(25));
    }

    @Test
    public void testFindSmallestNumberDivisibleByAllNegative() {
        assertEquals(1, smallestDivisible.findSmallestNumberDivisibleByAll(-5));
    }
}
