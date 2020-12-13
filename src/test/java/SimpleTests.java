
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Tag("simple_tests")

public class SimpleTests {
    @Test
    void positiveTest() {
        int a = 7;
        int b = 3;

        assertEquals(a + b, 10);
    }

    @Test
    void negativeTest() {
        int a = 7;
        int b = 3;

        assertNotEquals(a + b, 12, "a + b should be 10, not 12");
    }
}
