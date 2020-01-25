package JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {

    @Test
    void testIncrement() {
        Counter.refresh();
        assertEquals(0, Counter.COUNT);
        Counter.increment();
    }
}
