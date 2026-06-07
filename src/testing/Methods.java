package testing;

import entities.Audio;
import entities.Image;
import entities.Video;

public class Methods {
    public static void main() {
        Image img = new Image("Fire", 9);
        Audio audio = new Audio("Voice message", 3, 8);
        Video video = new Video("Video test", 3, 3, 4);
        System.out.println("Image test: " + img);
        System.out.println("Audio test: " + audio);
        System.out.println("Video test: " + video);

        System.out.println("\n--------- Methods Testing ---------");
        System.out.println("\nImage methods show():");
        img.show();
        System.out.println("\nImage brightness increaseBrightness() or decreaseBrightness():");
        img.increaseBrightness();
        img.show();
        img.decreaseBrightness();
        img.show();
        System.out.println("\n");
        System.out.println("Audio play()");
        audio.play();
        System.out.println("\n");
        System.out.println("Video play()");
        video.play();
        System.out.println("\n");
        System.out.println("Audio/Video volume test using increaseVolume() or decreaseVolume():");
        System.out.println("\nVideo volume test:");
        video.increaseVolume();
        video.play();
        video.decreaseVolume();
        video.play();
        System.out.println("\nAudio volume test:");
        audio.increaseVolume();
        audio.play();
        audio.decreaseVolume();
        audio.play();
        System.out.println("\n");
        System.out.println("Video brightness test using increaseBrightness() or decreaseBrightness():");
        video.increaseBrightness();
        video.play();
        video.decreaseBrightness();
        video.play();
    }
}
