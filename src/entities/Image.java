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

    public void show() {
        for (int i = 0; i < brightness; i++) {
            System.out.println("*");
        }
        System.out.println("Image of: " + title);
    }

    @Override
    public String toString() {
        return "Image{" +
                "brightness=" + brightness +
                ", title='" + title + '\'' +
                '}';
    }
}
