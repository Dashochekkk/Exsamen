import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestClass {
    @Test
    public void testMain() {
        Main.main(new String[]{});
        assertTrue(true); // Простая проверка
    }
}
