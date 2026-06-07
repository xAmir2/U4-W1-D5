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
                case 1: {
                    while (true) {
                        System.out.println("Select the brightness from 1 to 10:");
                        int brightness = sc.nextInt();
                        if (brightness >= 0 && brightness <= 10) {
                            multimedia[i] = new Image(title, brightness);
                            break;
                        }
                        System.out.println("Invalid brightness");
                    }
                    break;
                }
                case 2: {
                    int repeat;
                    int volume;
                    while (true) {
                        System.out.println("Select how many times to repeat from 1 to 10:");
                        repeat = sc.nextInt();
                        if (repeat >= 0 && repeat <= 10) {
                            break;
                        }
                        System.out.println("Invalid audio repeat");
                    }
                    while (true) {
                        System.out.println("Please enter the audio volume from 1 to 10:");
                        volume = sc.nextInt();
                        if (volume >= 0 && volume <= 10) {
                            break;
                        }
                        System.out.println("Invalid audio volume");
                    }
                    multimedia[i] = new Audio(title, repeat, volume);
                    break;
                }
                case 3: {
                    int brightness;
                    int volume;
                    int repeat;
                    while (true) {
                        System.out.println("Select the brightness from 1 to 10:");
                        brightness = sc.nextInt();
                        if (brightness >= 0 && brightness <= 10) {
                            break;
                        }
                        System.out.println("Invalid brightness input.");
                    }
                    while (true) {
                        System.out.println("Please enter the volume from 1 to 10:");
                        volume = sc.nextInt();
                        if (volume >= 0 && volume <= 10) {
                            break;
                        }
                        System.out.println("Invalid volume input.");
                    }
                    while (true) {
                        System.out.println("Select how many time to repeat from 1 to 10:");
                        repeat = sc.nextInt();
                        if (repeat >= 0 && repeat <= 10) {
                            break;
                        }
                        System.out.println("Invalid repeat input.");
                    }
                    multimedia[i] = new Video(title, brightness, repeat, volume);
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
