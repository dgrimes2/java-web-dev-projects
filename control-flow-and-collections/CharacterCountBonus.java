package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string of your choice: ");
        String newString = input.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] charNewString = newString.toUpperCase().toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();
        for (char letter : charNewString) {
            if (alphabet.indexOf(letter) >= 0) {
                if (counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
        input.close();
    }
}

