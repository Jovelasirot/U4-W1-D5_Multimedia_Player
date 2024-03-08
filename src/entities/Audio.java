package entities;

import interfaces.Playable;
import interfaces.Volume;

public class Audio extends Multimedia implements Volume, Playable {

    private int duration;
    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }


    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        if (duration > 0) {
            for (int i = 0; i < duration; i++) {
                for (int j = 0; j < volume; j++) {
                    System.out.println("!");
                }
                System.out.println("Audio name: " + "'" + title + "'");
            }
        } else {
            System.out.println("'" + title + "'" + " can't be played, because it has an invalid duration");
        }
    }

    @Override
    public void increaseVolume() {
        if (volume <= 10) {
            volume++;
        } else {
            System.out.println("Volume can't be more than 10");
        }

    }

    @Override
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume can't be less than 0");
        }
    }

    @Override
    public String toString() {
        return "Audio{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", title='" + title + '\'' +
                '}';
    }
}


