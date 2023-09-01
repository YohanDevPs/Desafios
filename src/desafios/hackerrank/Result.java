package desafios.hackerrank;

import java.util.ArrayList;
import java.util.List;

class Result {

    public static List<List<String>> getProductSuggestions(List<String> products, String search) {
        var arrayChars = search.toCharArray();

        List<List<String>> matriz = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arrayChars.length; i++) {
            stringBuilder.append(arrayChars[i]);
            matriz.add(findProductByCharacter(products, stringBuilder.toString()));
        }

        return matriz;
    }

    public static List<String> findProductByCharacter(List<String> products, String character) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).equals(character)) {
                list.add(products.get(i));
            }
            if (list.size() == 3) return list;
        }

        return list;
    }
}