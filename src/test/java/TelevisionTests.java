import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTests {
    private Television television;
    private List<Channel> channels;

    @BeforeEach
    void setup() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");

        channels = new ArrayList<>();

        channels.add(hbo);
        channels.add(showtime);
        channels.add(abc);

        television = new Television(channels);
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

    @Test
    void currentChannel_returnsStringRepresentationOfChannel() {
        String expected = "1 - HBO";
        String actual = television.currentChannel();

        assertEquals(expected, actual, "currentChannel() returns a String representation of the channel");
    }

    @Test
    void increaseChannel_increaseChannelByOne() {
        television.increaseChannel();

        String expected = "2 - Showtime";
        String actual = television.currentChannel();

        assertEquals(expected, actual, "increaseChannel() should increase channel by one");
    }

    @Test
    void increaseChannel_lastChannelToFirstChannel() {
        television.increaseChannel();
        television.increaseChannel();
        television.increaseChannel();

        String expected = "1 - HBO";
        String actual = television.currentChannel();

        assertEquals(expected, actual, "If on last channel and increaseChannel() is called, it should go to the first channel");
    }
}
