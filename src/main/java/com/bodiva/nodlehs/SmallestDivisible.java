package com.bodiva.nodlehs;

import static com.bodiva.nodlehs.LeastCommonMultiplier.lcm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SmallestDivisible {
    
    @GetMapping("/smallest-divisible")
    public long getSmallestDivisible() {
        int upperLimit = 25;
        return findSmallestNumberDivisibleByAll(upperLimit);
    }

    public long findSmallestNumberDivisibleByAll(int upperLimit) {
        long lcm = 1;
        for (int i = 1; i <= upperLimit; i++) {
            lcm = lcm(lcm, i);
        }
        return lcm;
    }
}
