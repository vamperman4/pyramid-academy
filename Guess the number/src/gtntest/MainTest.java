import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void gen_number() {
    }

    @Test
    void user_guess() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);

        assertEquals(1, Main.user_guess(), "Problem in user guess method.");

        in = new ByteArrayInputStream("0".getBytes());
        System.setIn(in);

        assertEquals(-1, Main.user_guess(), "Problem in user guess method.");
        System.setIn((sysInBackup));
    }

    @Test
    void get_name() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("Anthony".getBytes());
        System.setIn(in);

        assertEquals("Anthony", Main.get_name(), "Problem in user guess method.");
        System.setIn((sysInBackup));
    }

    @Test
    void play_again() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("y".getBytes());
        System.setIn(in);

        assertEquals(true, Main.play_again(), "Problem in play again method.");

        in = new ByteArrayInputStream("n".getBytes());
        System.setIn(in);

        assertEquals(false, Main.play_again(), "Problem in play again method.");
        System.setIn((sysInBackup));
    }
}