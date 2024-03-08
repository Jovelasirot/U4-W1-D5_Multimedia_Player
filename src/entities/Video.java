package entities;

import interfaces.Brightness;
import interfaces.Playable;
import interfaces.Volume;

public class Video extends Multimedia implements Playable, Brightness, Volume {
    private int duration;
    private int volume;
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }


    @Override
    public void play() {
        if (duration > 0) {
            for (int i = 0; i < duration; i++) {
                for (int j = 0; j < volume; j++) {
                    System.out.print("!");
                }
                for (int k = 0; k < brightness; k++) {
                    System.out.print("*");
                }
                System.out.println("Video name: " + "'" + title + "'");
                System.out.println("---------------------");
            }
        } else {
            System.out.println("'" + title + "'" + " can't be played, because it has an invalid duration");
        }
    }

    @Override
    public void increaseBrightness() {
        if (brightness <= 10) {
            brightness++;
        } else {
            System.out.println("Brightness can't be more than 10");
        }
    }

    @Override
    public void decreaseBrightness() {
        if (brightness >= 0) {
            brightness--;
        } else {
            System.out.println("Brightness can't be less than 0");
        }
    }

    @Override
    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    @Override
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", brightness=" + brightness +
                ", title='" + title + '\'' +
                '}';
    }
}
