package compass;

import java.util.Arrays;

public class Rover {

    private String facing;

    public Rover(String facing) {
        this.facing = facing;
    }

    public String getFacing() {
        return facing;
    }

    public void go(String instructions) {
        if (instructions == "R") {
            turn(new String[]{"N", "E", "S", "W"});
        } else {
            turn(new String[]{"N", "W", "S", "E"});
        }
    }

    private void turn(String[] compass) {
        int index = Arrays.asList(compass).indexOf(facing);
        facing = compass[(index + 1) % 4];
    }
}
