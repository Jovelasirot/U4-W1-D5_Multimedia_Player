package entities;

import entities.interfaces.Playable;
import entities.interfaces.Volume;

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
        for (int i = 0; i < duration; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.println("!");
            }
            System.out.println("Audio name: " + title);
        }
    }

    @Override
    public void increaseVolume() {
        if (volume <= 10) {
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
        return "Audio{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", title='" + title + '\'' +
                '}';
    }
}


