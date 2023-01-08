package string.kyu6;

/**
Your job is to write a function which increments a string, to create a new string.

        If the string already ends with a number, the number should be incremented by 1.
        If the string does not end with a number. the number 1 should be appended to the new string.
        Examples:

        foo -> foo1
        foobar23 -> foobar24
        foo0042 -> foo0043
        foo9 -> foo10
        foo099 -> foo100

        Attention: If the number has leading zeros the amount of digits should be considered.
**/

public class IncrementString {
    public static void main(String[] args) {

        System.out.println(incrementString2("fooba09"));

    }

    public static String incrementString2(String str) {

        var charArray = str.toCharArray();
        String numbers = "";


        for(int i = charArray.length - 1; i>=0; i--){

            if(!Character.isDigit(charArray[i])) {
               str += 1;
               break;
            } else {
                if(Character.getNumericValue(charArray[i -1]) == 9){
                        // Aqui que esta o problema
                    var x = Character.getNumericValue(charArray[i -1]);
                    x++;
                    str +=  x;
                    break;


                } else {
                    var x = Character.getNumericValue(charArray[i]);
                    x++;
                    charArray[i] =  Integer.toString(x).charAt(0);
                    return String.valueOf(charArray);
                }
            }
        }

        return str;
    }
//    public static String ssdd(String str) {
//        str.replace(("([0-8]?)(9*)$")) -> {
//                "${if (e.value.isEmpty()) 1 else (e.value.toInt() + 1)}"
//        }
//        return str;
//    }
}

//
//            if(Character.isDigit(charArray[i])) {
//                    if(Character.isDigit(charArray[i -1])) {
//                    if(Character.getNumericValue(charArray[i -1]) < 9){
//        int x = Character.getNumericValue(charArray[i]);
//        x++;
//        numbers = String.valueOf(x);
//        } else {
//
//        }
//        }
//        }
////
//
//
//
////            else {
////                for(int j = i; j >= 0; j--){
////                    letters = charArray[j] + letters;
////                }
////                int x = Integer.parseInt(numbers);
////                x++;
////                var p = valueOf(x);
////                finalString = letters + p;
////                i = 0;
