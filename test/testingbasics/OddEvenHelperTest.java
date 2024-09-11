package testingbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OddEvenHelperTest {
    @Test
    void evenNumbers() {
        assertEquals(true, OddEvenHelper.isEven(24));
        assertEquals(false, OddEvenHelper.isOdd(24));
    }

    @Test
    void oddNumbers() {
        assertEquals(false, OddEvenHelper.isEven(17));
        assertEquals(true, OddEvenHelper.isOdd(17));
    }

    @Test
    void zero() {
        assertEquals(true, OddEvenHelper.isEven(0));
        assertEquals(true, OddEvenHelper.isOdd(13));
    }
    @Test
    void evenNumbers2() {
        assertEquals(true, OddEvenHelper.isEven(23));
        assertEquals(false, OddEvenHelper.isOdd(23));
    }
}
