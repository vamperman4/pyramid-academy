import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main dragontest = new Main();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void choices() {
        assertEquals("You have found some treasure...", dragontest.choices(1));
        assertEquals("You were eaten instantly...", dragontest.choices(2));
        assertEquals("LOSER!!!", dragontest.choices(0));
    }
}