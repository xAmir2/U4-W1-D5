package entities;

import interfaces.Play;

public class Audio extends Media implements Play {
    private int amount;
    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title);
        this.amount = duration;
        this.volume = volume;
    }

    public void increaseVolume() {
        if (this.volume < 10)
            volume++;
    }

    public void decreaseVolume() {
        if (volume > 0)
            this.volume--;
    }


    @Override
    public void play() {
        for (int i = 0; i < amount; i++) {
            System.out.println("Title: " + title + " - Volume:" + "(" + volume + "): " + "!".repeat(volume));
        }
    }
}
