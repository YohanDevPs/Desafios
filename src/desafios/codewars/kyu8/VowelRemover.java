package desafios.codewars.kyu8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VowelRemover {

    /**
    Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

    Examples
        "hello"     -->  "hll"
        "codewars"  -->  "cdwrs"
        "goodbye"   -->  "gdby"
        "HELLO"     -->  "HELLO"
     **/

    public static void main(String[] args) {
        System.out.println(shortcut("codewars"));
    }

    public static String shortcut(String input) {

        var chars= input.toCharArray();
        List<String> list = new ArrayList<>();

        for (int i =0; i < chars.length; i++){
            if (chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] !=  'u' ) {
                list.add(String.valueOf(chars[i]));
            }
         }

        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
  }

    public static String cleverFunction(String input) {
        return input.replaceAll("[aoeiu]", "");
  }
}
