import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {
    @Test
    public void testSplitString() {
        assertArrayEquals(new String[]{"Hello", "world"}, Main.splitString("Hello world"));
        assertArrayEquals(new String[]{"This", "is", "a", "test"}, Main.splitString("This is a test"));
        assertArrayEquals(new String[]{}, Main.splitString(""));
    }
}
