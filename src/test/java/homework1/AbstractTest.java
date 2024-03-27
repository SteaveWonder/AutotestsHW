package homework1;

import home.Game;
import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractTest {
    static Game game;

    @BeforeAll
    static void init() {
        game = new Game();
    }
}
