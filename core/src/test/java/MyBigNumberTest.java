import com.example.core.MyBigNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBigNumberTest {
    // Hai số không nhớ
    @Test
    public void testSumNoCarry() {
        String result = MyBigNumber.sum("123", "456");
        assertEquals("579", result);
    }

    // Hai số có nhớ
    @Test
    public void testSumCarry() {
        String result = MyBigNumber.sum("789", "987");
        assertEquals("1776", result);
    }

    // Hai số khác độ dài
    @Test
    public void testSumDifferentLength() {
        String result = MyBigNumber.sum("99", "1");
        assertEquals("100", result);
    }

    //Cộng 0 với số khác
    @Test
    void testAddZeroToNumber() {
        assertEquals("789", MyBigNumber.sum("0", "789"));
        assertEquals("789", MyBigNumber.sum("789", "0"));
    }

    //Hai số đều là 0
    @Test
    void testAddZeroToZero() {
        assertEquals("0", MyBigNumber.sum("0", "0"));
    }

    //Một số có nhiều số 0 ở đầu
    @Test
    void testLeadingZeros() {
        assertEquals("123", MyBigNumber.sum("000123", "000000"));
        assertEquals("124", MyBigNumber.sum("000123", "000001"));
    }

    //Cộng các chuỗi số lớn khác nhau
    @Test
    void testLargeNumbers() {
        String a = "12345678901234567890";
        String b = "98765432109876543210";
        assertEquals("111111111011111111100", MyBigNumber.sum(a, b));
    }

    //Cộng chuỗi rất lớn
    @Test
    void testVeryLargeNumbers() {
        String a = "9".repeat(1000); // 999...999 (1000 chữ số)
        String b = "1";
        String expected = "1" + "0".repeat(1000); // 1000...000 (1 và 1000 số 0)
        assertEquals(expected, MyBigNumber.sum(a, b));
    }

    //Một trong hai chuỗi rỗng hoặc null
    @Test
    void testEmptyOrNullInput() {
        assertEquals("123", MyBigNumber.sum("", "123"));
        assertEquals("123", MyBigNumber.sum("123", ""));
        assertEquals("123", MyBigNumber.sum(null, "123"));
        assertEquals("123", MyBigNumber.sum("123", null));
    }

    //Cộng số nhớ nhiều lần
    @Test
    void testCarry() {
        assertEquals("10000", MyBigNumber.sum("9999", "1"));
    }
}
