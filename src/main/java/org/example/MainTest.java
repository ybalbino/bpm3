package org.example;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        try {
            Main.main(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.setOut(System.out);

        assertEquals("3" + System.lineSeparator(), outputStream.toString());
    }
}

