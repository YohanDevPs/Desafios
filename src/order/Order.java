package order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    public static void main (String[] args) {
        System.out.println(orderSentence("is2 Thi1s T4est 3a"));
    }

    private static int getNumber(String s){

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                return Character.getNumericValue(s.charAt(i));
            }
        }

        return 0;
    }

    public static String orderSentence(String words) {

        if(words.equals("")){
            return "";
        }

        String[] arr = words.split(" ");
        String[] temp = new String[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[getNumber(arr[i])-1] = arr[i];
        }

        return String.join(" " , temp);
    }
}
