package entities;

import interfaces.Play;

public class Video extends Media implements Play {
    private int brightness;
    private int amount;
    private int volume;

    public Video(String title, int brightness, int amount, int volume) {
        super(title);
        this.brightness = brightness;
        this.amount = amount;
        this.volume = volume;
    }

    public void increaseVolume() {
        if (this.volume < 10)
            this.volume++;
    }

    public void decreaseVolume() {
        if (volume > 0)
            this.volume--;
    }

    public void increaseBrightness() {
        if (brightness < 10)
            this.brightness++;
    }

    public void decreaseBrightness() {
        if (brightness > 0)
            this.brightness--;
    }

    @Override
    public void play() {
        for (int i = 0; i < amount; i++) {
            System.out.println("Title: " + title + " - Volume:" + "(" + volume + "): " + "!".repeat(volume) + "(" + brightness + "): " + "*".repeat(brightness));
        }
    }
}
