package com.example;

import org.junit.Test;

import com.example.mocking.MathService;
import com.example.mocking.Calculator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
 
public class CalculatorTest {
 
    @Test
    public void testAddNumbers() {
        // Create a mock object for MathService interface
        MathService mathService = mock(MathService.class);
 
        // Define the behavior of the mock's add method
        when(mathService.add(2, 3)).thenReturn(5);
 
        // Create a Calculator instance with the mock MathService
        Calculator calculator = new Calculator(mathService);
 
        // Call the method under test
        int result = calculator.addNumbers(2, 3);
 
        // Verify that the result is as expected
        assertEquals(5, result);
 
        // Verify that the add method of the mock was called once with arguments 2 and 3
        verify(mathService, times(1)).add(2, 3);
    }
}