package compass;

import compass.Rover;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {

    @Test
    @Parameters({
            "N,E",
            "E,S",
            "S,W",
            "W,N"
    })
    public void turnsRightClockwise(String startsFacing, String endsFacing) {
        Rover rover = new Rover(startsFacing);
        rover.go("R");
        assertEquals(endsFacing, rover.getFacing());
    }


    @Test
    @Parameters({
            "N,W",
            "W,S",
            "S,E",
            "E,N"
    })
    public void turnsAntiClockwise(String start, String end) {
        Rover rover = new Rover(start);
        rover.go("L");
        assertEquals(end, rover.getFacing());
    }

}
