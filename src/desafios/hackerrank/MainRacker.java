package desafios.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRacker {
    public static void main(String[] args) {





    }

    public String betterCompression (String s) {
        var list = s.toCharArray();
        var letters = extractLetters(s);
        var repeatedLetter =  encontrarLetraRepetida(s);

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] == repeatedLetter) {
               sum += list[i+1];

               var result = Character.compare(list[i], repeatedLetter);
               if(result > 0) {

               }
            }
        }


        return null;
    }
    public static List<String> extractLetters(String input) {
        List<String> leters = new ArrayList<>();
        Pattern pattern = Pattern.compile("[A-Za-z]");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            leters.add(matcher.group());
        }

        return leters;
    }

    public static char encontrarLetraRepetida(String input) {
        Map<Character, Integer> contadorLetras = new HashMap<>();

        for (char letra : input.toCharArray()) {
            contadorLetras.put(letra, contadorLetras.getOrDefault(letra, 0) + 1);

            if (contadorLetras.get(letra) > 1) {
                return letra;
            }
        }

        return '\0';
    }
}
