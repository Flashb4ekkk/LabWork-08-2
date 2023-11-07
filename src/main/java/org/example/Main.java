package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = scan.nextLine();
        checkFirstWord(splitString(str));
    }

    public static void checkFirstWord(String[] words) {
        boolean checker = false;
        for (String word : words) {
            if (word.startsWith("a")) {
                System.out.println("First word which starts with a letter 'a': " + word);
                checker = true;
                break;
            }
        }
        if (!checker) {
            System.out.println("There isn't word which starts with a letter 'a'");
        }
    }

    public static String[] splitString(String str) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (!word.isEmpty()) {
                    words.add(word);
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.isEmpty()) {
            words.add(word);
        }
        return words.toArray(new String[0]);
    }
}
