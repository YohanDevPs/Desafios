package lambdasAndStreams;

//Write a method that converts all strings in a list to their upper case

import java.util.ArrayList;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        var newList = new ArrayList<String>();

        newList.add("yohan");
        newList.add("Tess");
        newList.add("jof");

        System.out.println(upperCase(newList));
    }

    public static List<String> upperCase(List<String> list) {
        List newList = new ArrayList<String>();
        for (String li : list) {
           newList.add(li.toUpperCase());
        }

        return newList;
    }
}
