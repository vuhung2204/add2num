import com.example.core.MyBigNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBigNumberTest {
    @Test
    public void testSumNormal() {
        assertEquals("1106", MyBigNumber.sum("1011", "95"));
    }

    @Test
    public void testSumNormal2() {
        assertEquals("10998", MyBigNumber.sum("999", "9999"));
    }

    @Test
    public void testSumZero() {
        assertEquals("123", MyBigNumber.sum("123", "0"));
    }
}
