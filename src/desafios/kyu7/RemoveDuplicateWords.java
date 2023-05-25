package desafios.kyu7;


/**
 * Your task is to remove all consecutive duplicate words from a string, leaving only first words entries. For example:
 *
 * "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
 *
 * --> "alpha beta gamma delta alpha beta gamma delta"
 * Words will be separated by a single space. There will be no leading or trailing spaces in the string. An empty string (0 words) is a valid input.
 */

public class RemoveDuplicateWords {

    public static String removeConsecutiveDuplicates(String s){

        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if(!words[i].equals(words[i + 1])) {
                sb.append(words[i]).append(" ");
            }
        }
        sb.append(words[words.length - 1]).append(" ");
        return sb.toString().trim();
    }
}
