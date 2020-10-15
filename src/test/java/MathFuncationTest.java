import junit.framework.TestCase;
import org.junit.Test;

public class MathFuncationTest extends TestCase {
@Test
    public void test() {
        MathFuncation mathFuncation = new MathFuncation();
        int expected = 30;
        int actual = mathFuncation.add(10, 20);
        assertEquals(expected, actual);
    }

}