import entities.Audio;
import entities.Image;
import entities.Multimedia;
import entities.Video;
import entities.interfaces.Playable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Multimedia[] multimediaElements = new Multimedia[1];
        int insertedElements = 0;

        while (insertedElements < 1) {


            System.out.println("What type of media do you want to add (1 for Audio, 2 for video, 3 for images)");

            int typeOfMedia = scanner.nextInt();
            scanner.nextLine();

            switch (typeOfMedia) {
                case 1:
                    System.out.println("Insert the title of the audio");
                    String titleAudio = scanner.nextLine();

                    System.out.println("Duration of the audio:");
                    int audioDuration = scanner.nextInt();

                    System.out.println("Volume of the audio:");
                    int audioVolume = scanner.nextInt();

                    multimediaElements[insertedElements] = new Audio(titleAudio, audioDuration, audioVolume);

                    break;
                case 2:
                    System.out.println("Insert the title of the video");
                    String videoTitle = scanner.nextLine();


                    System.out.println("Duration of the video:");
                    int videoDuration = scanner.nextInt();

                    System.out.println("Volume of the video:");
                    int videoVolume = scanner.nextInt();

                    System.out.println("Brightness of the video:");
                    int videoBrightness = scanner.nextInt();

                    multimediaElements[insertedElements] = new Video(videoTitle, videoDuration, videoVolume, videoBrightness);

                    break;
                case 3:
                    System.out.println("Insert the title of the image");
                    String imageTitle = scanner.nextLine();

                    System.out.println("Brightness of the image:");
                    int imageBrightness = scanner.nextInt();

                    multimediaElements[insertedElements] = new Image(imageTitle, imageBrightness);

                    break;
                default:
                    System.out.println("Type not valid, try another.");
            }

            insertedElements++;
        }

        int handleMediaShown;
        do {
            System.out.println("Select the element you want to play 1 to 5 or 0 to cancel");
            handleMediaShown = scanner.nextInt();
            if (handleMediaShown >= 1 && handleMediaShown <= 5) {
                Multimedia elementSelected = multimediaElements[handleMediaShown - 1];
                if (elementSelected instanceof Playable) {
                    ((Playable) elementSelected).play();
                }
            }
        } while (handleMediaShown != 0);


        scanner.close();
    }
}

//else {
//        System.out.println("Media not playable");
//                }