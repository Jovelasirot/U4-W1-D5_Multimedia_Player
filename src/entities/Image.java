package entities;

import entities.interfaces.Brightness;

public class Image extends Multimedia implements Brightness {

    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    @Override
    public void increaseBrightness() {
        if (brightness > 0 && brightness < 10) {
            brightness++;
        }
    }

    @Override
    public void decreaseBrightness() {
        if (brightness > 0 && brightness < 10) {
            brightness--;
        }
    }
}
