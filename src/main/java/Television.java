import java.util.List;

public class Television {
    private boolean isOn = false;
    private List<Channel> channels;

    public Television(List<Channel> channels) {
        this.channels = channels;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}
