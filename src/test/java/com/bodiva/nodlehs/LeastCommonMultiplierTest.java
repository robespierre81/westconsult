package com.bodiva.nodlehs;

import static com.bodiva.nodlehs.LeastCommonMultiplier.lcm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeastCommonMultiplierTest {
    
    @Test
    public void testLcm() {
        long lcmValue = lcm(1024,8196);
        long expected = 2098176l;
        
        assertEquals(expected, lcmValue);
    }
    
    
    @Test
    public void testLcmWithSmallNumbers() {
        assertEquals(15, LeastCommonMultiplier.lcm(3, 5));
        assertEquals(12, LeastCommonMultiplier.lcm(4, 6));
        assertEquals(12, LeastCommonMultiplier.lcm(12, 6));
    }

    @Test
    public void testLcmWithZero() {
        try {
            assertEquals(0, LeastCommonMultiplier.lcm(0, 5));
        } catch (Exception nullDiv) {
            
        }
        assertEquals(0, LeastCommonMultiplier.lcm(7, 0));
        try {
            assertEquals(0, LeastCommonMultiplier.lcm(0, 0));
        } catch (Exception nullDiv) {
            
        }
    }

    @Test
    public void testLcmWithNegativeNumbers() {
        assertEquals(-30, LeastCommonMultiplier.lcm(-5, 6));
        assertEquals(36, LeastCommonMultiplier.lcm(9, -12));
        assertEquals(-42, LeastCommonMultiplier.lcm(-14, -21));
    }

    @Test
    public void testLcmWithEqualNumbers() {
        assertEquals(8, LeastCommonMultiplier.lcm(8, 8));
        assertEquals(2, LeastCommonMultiplier.lcm(2, 2));
    }

    @Test
    public void testLcmWithMultiples() {
        assertEquals(100, LeastCommonMultiplier.lcm(10, 100));
        assertEquals(27, LeastCommonMultiplier.lcm(9, 27));
    }

    @Test
    public void testLcmWithLargeNumbers() {
        assertEquals(1000000016000000063L, LeastCommonMultiplier.lcm(1_000_000_007L, 1_000_000_009L));
        assertEquals(370370367L, LeastCommonMultiplier.lcm(123456789L * 3, 123456789L));
    }
    
}
