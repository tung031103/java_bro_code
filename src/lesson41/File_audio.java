package lesson41;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
import java.io.File;

public class File_audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File(
                "C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson41\\Happy-New-Year-A-Teens.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                default:
                    System.out.println("Not a valid response!");

            }
        }

    }
}
