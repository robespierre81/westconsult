package com.bodiva.nodlehs;

import static com.bodiva.nodlehs.GreatestCommonDivider.gcd;

public class LeastCommonMultiplier {
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
