package desafios.kyu6;

public class Order {

    /**
     Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

     Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

     If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

     Examples
     "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
     "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
     ""  -->  ""
     **/

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
