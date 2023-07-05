package desafios.codewars.kyu6;

import java.util.*;

/**
 *
 * Emotional Sort ( ︶︿︶)
 * You'll have a function called "sortEmotions" that will return an array of emotions sorted. It has two parameters, the first parameter called "arr" will expect an array of emotions where an emotion will be one of the following:
 *
 * :D -> Super Happy
 * :) -> Happy
 * :| -> Normal
 * :( -> Sad
 * T_T -> Super Sad
 * Example of the array:[ 'T_T', ':D', ':|', ':)', ':(' ]
 *
 * And the second parameter is called "order", if this parameter is true then the order of the emotions will be descending (from Super Happy to Super Sad) if it's false then it will be ascending (from Super Sad to Super Happy)
 *
 * Example if order is true with the above array: [ ':D', ':)', ':|', ':(', 'T_T' ]
 *
 * Super Happy -> Happy -> Normal -> Sad -> Super Sad
 * If order is false: [ 'T_T', ':(', ':|', ':)', ':D' ]
 *
 * Super Sad -> Sad -> Normal -> Happy -> Super Happy
 * Example:
 *
 * arr = [':D', ':|', ':)', ':(', ':D']
 * sortEmotions(arr, true) // [ ':D', ':D', ':)', ':|', ':(' ]
 * sortEmotions(arr, false) // [ ':(', ':|', ':)', ':D', ':D' ]
 * More in test cases!
 *
 * Notes:
 *
 * The array could be empty, in that case return the same empty array ¯\_( ツ )_/¯
 * All emotions will be valid
 * Enjoy! (づ｡◕‿‿◕｡)づ
 */


public class EmotionalSorting {
    public static String[] sortEmotions(boolean order,String[] emotions) {
        Map<String, Integer> classifyEmotion = new HashMap<>();
        classifyEmotion.put("T_T", 1);
        classifyEmotion.put(":(", 2);
        classifyEmotion.put(":|", 3);
        classifyEmotion.put(":)", 4);
        classifyEmotion.put(":D", 5);

        Arrays.sort(emotions, order
                ? Comparator.comparingInt(classifyEmotion::get)
                : Comparator.comparingInt(classifyEmotion::get).reversed()
        );

        return emotions;
    }
}
