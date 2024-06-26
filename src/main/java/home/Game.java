package home;

import java.util.List;
import java.util.ArrayList;
/**
 * Класс для реализации игры
 */
public class Game {
    private Player player;
    private List<Door> doors = new ArrayList<>();

    public Game(Player player, List<Door> doors) {
        this.player = player;
        this.doors = doors;
    }

    public Door round(int door) {
        if (!player.getRisk()) return doors.get(door);
        else {
            doors.remove(doors.get(door));
            return doors.get(0).isPrize() ? doors.get(0) : doors.get(1);
        }
    }

    public void initDoors() {
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }

    public Game() {
        this.player = new Player("Misha", true);
        this.doors = doors;
    }

    public Player getPlayer() {
        return player;
    }
}
