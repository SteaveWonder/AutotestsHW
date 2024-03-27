package homework1;

import home.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest extends AbstractTest {

    @Test
    void checkPlayer() {
        Assertions.assertNotNull(game.getPlayer());
    }

    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Player player) {
        assertTrue(player == null);
    }
}
