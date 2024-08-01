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
    
}
