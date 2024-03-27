package homework1;

import home.Door;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest extends AbstractTest {

    @Test
    void LoseWithRisk() {
        //given
        game.initDoors();
        //when
        Door door = game.round(0);
        //then
        Assertions.assertFalse(door.isPrize());
    }
    @Test
    void WinWithRisk() {
        //given
        game.initDoors();
        //when
        Door door = game.round(1);
        //then
        Assertions.assertTrue(door.isPrize());
    }
}
