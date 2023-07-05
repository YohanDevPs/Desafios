package desafios.codewars.kyu7;


import java.util.stream.IntStream;

/**
 * In this kata, you need to write a function that takes a string and a letter as input and then returns the
 * index of the second occurrence of that letter in the string. If there is no such letter in the string,
 * then the function should return -1. If the letter occurs only once in the string, then -1 should also be returned.
 *
 * Examples:
 *
 * second_symbol('Hello world!!!','l') --> 3
 * second_symbol('Hello world!!!', 'A') --> -1
 * Good luck ;) And don't forget to rate this Kata if you liked it.
 */
public class FindTheIndex {
    public static void main(String[] args) {
        System.out.println(secondSymbol("Hello world!!!",'l'));

    }
    public static int secondSymbol(String str, char c) {
        var secondIndex = IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == c).skip(1).findFirst();
        return secondIndex.isPresent() ? secondIndex.getAsInt() : -1;
    }
}
