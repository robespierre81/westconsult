package com.bodiva.nodlehs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SmallestDivisible.class)
public class SmallestDivisibleRestApiTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetSmallestDivisibleApi() throws Exception {
         ResultActions resultActions = mockMvc.perform(get("/api/smallest-divisible"))
                .andExpect(status().isOk()) // Assert that the status is 200 OK
                .andExpect(content().string("26771144400")); // Assert that the content matches the expected value

    }
    
    @Test 
    public void testGetSmallestDivisibleValue() {
        SmallestDivisible controller = new SmallestDivisible();
       
        long expected = 26771144400L;
        long actual = controller.findSmallestNumberDivisibleByAll(25);
        assertEquals(expected, actual, "The smallest number divisible by all numbers from 1 to 25 should be 26771144400.");
    }
    
}
