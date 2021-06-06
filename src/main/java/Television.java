import java.util.List;

public class Television {
    private boolean isOn = false;
    private List<Channel> channels;
    private int index = 0;

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

    public String currentChannel() {
        Channel channel = channels.get(index);

        return channel.getChannel() + " - " + channel.getName();
    }

    public void increaseChannel() {
        if (index == channels.size() - 1) {
            index = 0;
        } else {
            index += 1;
        }
    }

    public void decreaseChannel() {
        if (index == 0) {
            index = channels.size() - 1;
        } else {
            index -= 1;
        }
    }
}
