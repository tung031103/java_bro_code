package lesson79;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class EncryptionProgram {

    private Scanner sc;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shufflerList;
    private char character;
    private String line;
    private char[] letter;
    private char[] secretLetter;

    EncryptionProgram() {
        sc = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<>();
        shufflerList = new ArrayList<>();
        character = ' ';

        newKey();
        askQuestion();

    }

    private void askQuestion() {
        while (true) {
            System.out.println("\n\n********************************************************");
            System.out.println("what do you want to do?");
            System.out.println("(N)newKey, (G)getKey, (E)encrypt, (D)decrypt, (Q)quit");
            char response = Character.toUpperCase(sc.nextLine().charAt(0));

            switch (response) {
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Not a valid answer!");
                    break;
            }

        }

    }

    private void newKey() {
        character = ' ';
        list.clear();
        shufflerList.clear();
        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }

        shufflerList = new ArrayList<>(list);
        Collections.shuffle(shufflerList);
        System.out.println("A new key has been generated");
    }

    private void getKey() {
        System.out.println("Key: ");
        for (Character c : list) {
            System.out.print(c);
        }
        System.out.println();

        for (Character c : shufflerList) {
            System.out.print(c);
        }
        System.out.println();
    }

    private void encrypt() {
        System.out.println("enter a message to be encrypted: ");
        String message = sc.nextLine();

        letter = message.toCharArray();

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (letter[i] == list.get(j)) {
                    letter[i] = shufflerList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted: ");
        for (char x : letter) {
            System.out.print(x);
        }
        System.out.println();

    }

    private void decrypt() {
        System.out.println("enter a message to be decrypted: ");
        String message = sc.nextLine();

        letter = message.toCharArray();

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < shufflerList.size(); j++) {
                if (letter[i] == shufflerList.get(j)) {
                    letter[i] = list.get(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted: ");
        for (char x : letter) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void quit() {
        System.out.println("Thank you, have a nice day bro!");
        System.exit(0);
    }
}
