package desafios.codewars.kyu6;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
    Write a function that takes in a string of one or more words,
    and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata).
    Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

    Examples:

    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
    spinWords( "This is a test") => returns "This is a test"
    spinWords( "This is another test" )=> returns "This is rehtona test"
 **/

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("This is another test"));
    }


    public static String spinWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(c -> c.length() >= 5 ? new StringBuilder(c).reverse() : c)
                .collect(Collectors.joining(" "));
    }
}
