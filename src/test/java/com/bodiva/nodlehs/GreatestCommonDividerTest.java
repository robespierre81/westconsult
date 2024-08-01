package com.bodiva.nodlehs;

import static com.bodiva.nodlehs.GreatestCommonDivider.gcd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreatestCommonDividerTest {
    @Test
    public void testGcd() {
        long gcdValue = gcd(96,1024);
        long expected = 32;
        
        assertEquals(expected, gcdValue);
    }
    
    
    @Test
    public void testGcdWithSmallNumbers() {
        assertEquals(1, GreatestCommonDivider.gcd(3, 5));
        assertEquals(2, GreatestCommonDivider.gcd(4, 2));
        assertEquals(6, GreatestCommonDivider.gcd(6, 12));
    }

    @Test
    public void testGcdWithZero() {
        assertEquals(5, GreatestCommonDivider.gcd(0, 5));
        assertEquals(7, GreatestCommonDivider.gcd(7, 0));
        assertEquals(0, GreatestCommonDivider.gcd(0, 0));
    }

    @Test
    public void testGcdWithNegativeNumbers() {
        assertEquals(-5, GreatestCommonDivider.gcd(-5, 10));
        assertEquals(-3, GreatestCommonDivider.gcd(9, -12));
        assertEquals(-7, GreatestCommonDivider.gcd(-14, -21));
    }

    @Test
    public void testGcdWithEqualNumbers() {
        assertEquals(8, GreatestCommonDivider.gcd(8, 8));
        assertEquals(0, GreatestCommonDivider.gcd(0, 0));
    }

    @Test
    public void testGcdWithMultiples() {
        assertEquals(10, GreatestCommonDivider.gcd(10, 100));
        assertEquals(9, GreatestCommonDivider.gcd(9, 27));
    }

    @Test
    public void testGcdWithLargeNumbers() {
        assertEquals(1, GreatestCommonDivider.gcd(1_000_000_007L, 1_000_000_009L));
        assertEquals(123456789, GreatestCommonDivider.gcd(123456789L * 2, 123456789L * 3));
    }
    
}
