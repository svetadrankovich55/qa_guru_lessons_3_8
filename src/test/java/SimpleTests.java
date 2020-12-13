
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(a + b, 12, "a + b should be 12, not 10");
    }
}
