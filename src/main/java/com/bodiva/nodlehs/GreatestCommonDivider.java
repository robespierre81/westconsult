package com.bodiva.nodlehs;

public class GreatestCommonDivider {
     public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
