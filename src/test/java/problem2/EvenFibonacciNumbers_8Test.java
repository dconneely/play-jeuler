package problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenFibonacciNumbers_8Test {
    @Test
    public void testSum10() {
        assertEquals(EvenFibonacciNumbers_8.sum(10), 10);
    }

    @Test
    public void testSum34() {
        assertEquals(EvenFibonacciNumbers_8.sum(34), 44);
    }
}
