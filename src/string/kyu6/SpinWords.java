package string.kyu6;

import java.util.ArrayList;
import java.util.List;
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
        var arrays = sentence.split(" ");
        List<String> list = new ArrayList<>();

        for (String ls : arrays) {
            if (ls.length() < 5) {
                list.add(ls);
            } else {
                list.add(new StringBuilder(ls).reverse().toString());
            }
        }

        String reversedSentence = "";
        int i = 0;
        for (String s : list) {
            if(i == 0) {
                reversedSentence += s;
            }else {
                reversedSentence += " " + s;
            }
            i++;
        }
        return reversedSentence;
    }

    public static String betterSolution(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(c -> c.length() >= 5 ? new StringBuilder(c).reverse() : c)
                .collect(Collectors.joining(" "));
    }
}