import entities.Audio;
import entities.Image;
import entities.Media;
import entities.Video;
import interfaces.Play;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Media[] multimedia = new Media[5];
        System.out.println("Create 5 multimedia files.");
        for (int i = 0; i < multimedia.length; i++) {
            System.out.println("Select which multimedia type:");
            System.out.println("1. Image");
            System.out.println("2. Audio");
            System.out.println("3. Video");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.println("Please enter a title:");
            String title = sc.nextLine();
            switch (type) {
                case 1:
                    System.out.println("Select the brightness from 1 to 10:");
                    int imgBrightness = sc.nextInt();
                    multimedia[i] = new Image(title, imgBrightness);
                    break;
                case 2: {
                    System.out.println("Select how many audios from 1 to 10:");
                    int amount = sc.nextInt();
                    System.out.println("Please enter the audioVolume from 1 to 10:");
                    int volume = sc.nextInt();
                    multimedia[i] = new Audio(title, amount, volume);
                    break;
                }
                case 3: {
                    System.out.println("Select the brightness from 1 to 10:");
                    int brightness = sc.nextInt();
                    System.out.println("Please enter the volume from 1 to 10:");
                    int volume = sc.nextInt();
                    System.out.println("Select how many videos from 1 to 10:");
                    int amount = sc.nextInt();
                    multimedia[i] = new Video(title, brightness, amount, volume);
                    break;
                }
                default:
                    System.out.println("Invalid input");
                    i--;
            }
        }

        int choice = -1;
        while (choice != 0) {
            System.out.println("Please select an option:");
            System.out.println("1 to 5 or you can select 0 to stop.");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 5) {
                Media selected = multimedia[choice - 1];
                if (selected instanceof Image) {
                    Image img = (Image) selected;
                    img.show();
                } else if (selected instanceof Play) {
                    Play player = (Play) selected;
                    player.play();
                } else {
                    System.out.println("Invalid input");
                }
            }
        }

    }
}
