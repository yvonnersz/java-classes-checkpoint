import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTests {
    private Television television;

    @BeforeEach
    void setup() {
        television = new Television();
    }

    @Test
    void isOn_returnsFalseByDefault() {
        assertFalse(television.isOn(), "Television is off by default");
    }

    @Test
    void turnOn_returnsTrueWhenTelevisionIsOn() {
        television.turnOn();
        assertTrue(television.isOn(), "isOn returns true when television is turned on");
    }

    @Test
    void turnOff_returnsFalseWhenTelevisionIsTurnedOff() {
        television.turnOn();
        television.turnOff();
        assertFalse(television.isOn(), "isOn returns false when television is turned off");
    }
}
