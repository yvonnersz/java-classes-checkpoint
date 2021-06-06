import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChannelTests {
    private Channel hbo;
    private Channel showtime;
    private Channel ABC;

    @BeforeEach
    void setup() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");
    }
}
