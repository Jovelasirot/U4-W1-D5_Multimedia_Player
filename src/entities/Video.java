package entities;

import entities.interfaces.Brightness;
import entities.interfaces.Playable;

public class Video extends Multimedia implements Playable, Brightness {
    private int duration;
    private int volume;
    private int brightness;

    public Video(String title) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }


    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < brightness; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
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
