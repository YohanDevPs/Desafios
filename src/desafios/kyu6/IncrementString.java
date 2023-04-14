package desafios.kyu6;

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


        for (int i = charArray.length - 1; i >= 0; i--) {

            if (!Character.isDigit(charArray[i])) {
                str += 1;
                break;
            } else {
                if (Character.getNumericValue(charArray[i - 1]) == 9) {
                    // Aqui que esta o problema
                    var x = Character.getNumericValue(charArray[i - 1]);
                    x++;
                    str += x;
                    break;


                } else {
                    var x = Character.getNumericValue(charArray[i]);
                    x++;
                    charArray[i] = Integer.toString(x).charAt(0);
                    return String.valueOf(charArray);
                }
            }
        }

        return str;
    }
}