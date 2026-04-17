import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(4, c.add(8,2));
    }
}
