package count.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class countTest {
    @Test
    void testWithNull() {
        count c = new count();
        assertThrows(NullPointerException.class, () -> 
        {
            c.counting(null);
        });
    }

    @Test
    void testWithAnEmptyString() {
        count c = new count();
        c.counting("");
        assertEquals(0, c.getChars());
        assertEquals(0, c.getVowels());
        assertEquals(0, c.getDigits());
    }

    @Test
    void testWithOnlyAlphabeticCharsLowerCase() {
        count c = new count();
        c.counting("llocart");
        assertEquals(7, c.getChars());
        assertEquals(2, c.getVowels());
        assertEquals(0, c.getDigits());
    }

    @Test
    void testWithOnlyAlphabeticCharsUpperCase() {
        count c = new count();
        c.counting("LLOCART");
        assertEquals(7, c.getChars());
        assertEquals(2, c.getVowels());
        assertEquals(0, c.getDigits());
    }

    @Test
    void testWithOnlyDigits() {
        count c = new count();
        c.counting("3355712");
        assertEquals(7, c.getChars());
        assertEquals(0, c.getVowels());
        assertEquals(7, c.getDigits());
    }

    @Test
    void testWithOnlyVowels() {
        count c = new count();
        c.counting("aouiieyo");
        assertEquals(8, c.getChars());
        assertEquals(8, c.getVowels());
        assertEquals(0, c.getDigits());
    }

    @Test
    void testWithOnlyCons() {
        count c = new count();
        c.counting("plkwrtbnmddfPLW");
        assertEquals(15, c.getChars());
        assertEquals(0, c.getVowels());
        assertEquals(0, c.getDigits());
    }

    @Test
    void testWithOnlySpaces() {
        count c = new count();
        c.counting("    ");
        assertEquals(4, c.getChars());
        assertEquals(0, c.getVowels());
        assertEquals(0, c.getDigits());
    }

    @Test
    void testWithSpecialChars() {
        count c = new count();
        c.counting("!?/-[]&");
        assertEquals(7, c.getChars());
        assertEquals(0, c.getVowels());
        assertEquals(0, c.getDigits());
    }

    @Test
    void testWithStartSpaces() {
        count c = new count();
        c.counting("  iko99");
        assertEquals(7, c.getChars());
        assertEquals(2, c.getVowels());
        assertEquals(2, c.getDigits());
    }

    @Test
    void testWithEndSpaces() {
        count c = new count();
        c.counting("iko99  ");
        assertEquals(7, c.getChars());
        assertEquals(2, c.getVowels());
        assertEquals(2, c.getDigits());
    }

    @Test
    void testWithSpacesInTheMiddle() {
        count c = new count();
        c.counting("iko  p99");
        assertEquals(8, c.getChars());
        assertEquals(2, c.getVowels());
        assertEquals(2, c.getDigits());
    }

    @Test
    void testWithSpacesAndCharsAndDigits() {
        count c = new count();
        c.counting(" ]iko!  P99WQsa  ");
        assertEquals(17, c.getChars());
        assertEquals(3, c.getVowels());
        assertEquals(2, c.getDigits());
    }
}
