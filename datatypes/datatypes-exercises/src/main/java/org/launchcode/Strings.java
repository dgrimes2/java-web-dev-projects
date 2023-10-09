package org.launchcode;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String firstSent = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought " +
                "Alice ‘without pictures or conversation?’";
//        System.out.println(firstSent);
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your search term: ");
        String searchTerm = input.next();
//        System.out.println(firstSent.contains(searchTerm));
        System.out.println(firstSent.toUpperCase().contains(searchTerm.toUpperCase()));

        input.close();
//        Part E
        Integer index = firstSent.indexOf(searchTerm);
        Integer searchTermLength = searchTerm.length();
        System.out.println("Your searched term can be found at index " + index + ", and it is " + searchTermLength + " characters long.");

    }
}
