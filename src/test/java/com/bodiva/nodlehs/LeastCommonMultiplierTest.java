package com.bodiva.nodlehs;

import static com.bodiva.nodlehs.LeastCommonMultiplier.lcm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeastCommonMultiplierTest {
    
    public LeastCommonMultiplierTest() {
    }
    
    @Test
    public void testLcm() {
        long lcmValue = lcm(1024,8196);
        long expected = 2098176l;
        
        assertEquals(expected, lcmValue);
    }
    
}
