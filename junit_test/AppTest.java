import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void firstTest() {
        assertEquals("1 equals 2", 1, 2);
    }

    @Test
    public void secondTest() {
        assertEquals("sum", App.returnSum(5, 5), 10);
    }
}