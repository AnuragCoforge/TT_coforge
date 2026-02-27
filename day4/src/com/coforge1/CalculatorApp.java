
package com.coforge1;

public class CalculatorApp {
    public static void main(String[] args) {
        // Lambda assigned to the functional interface
        CalculatorInterface ca = (a, b) -> System.out.println("SUM: " + (a + b));

        // Invoke it
        ca.add(5, 6); // Output: SUM: 11
    }
}
