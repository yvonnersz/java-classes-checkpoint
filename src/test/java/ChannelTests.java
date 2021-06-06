import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChannelTests {
    private Channel hbo;
    private Channel showtime;
    private Channel ABC;

    @Test
    void createChannel() {
        Channel hbo = new Channel(1, "HBO");

        assertTrue(hbo instanceof Channel, "Can create an instance of channel with int channel and String name passed");
    }
}
