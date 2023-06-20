package desafios.kyu6;

/*
You are given an array of strings that need to be spread among N columns. Each column's width should be the same as the
length of the longest string inside it.

Separate columns with " | ", and lines with "\n"; content should be left-justified.

{"1", "12", "123", "1234", "12345", "123456"} should become:

1
12
123
1234
12345
123456
for 1 column,

1     | 12
123   | 1234
12345 | 123456
for 2 columns,

1     | 12     | 123 | 1234
12345 | 123456

*/

public class Columnize {
    public static String columnize(String[] input, int numberOfColumns) {

        String mostLargeString = "";
        for (String st: input) {
            if(mostLargeString.length() < st.length()) {
                mostLargeString = st;
            }
        }

        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < mostLargeString.length(); i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                answer += input[i] + getEmptySpace(input[i].length(), mostLargeString.length()) + " | ";
            }
            answer = answer.substring(0, answer.length() - 3);
            stringBuilder.append(answer + "\n");
        }


        return stringBuilder.toString();
    }

    public static String getEmptySpace(int txt, int number) {
        int emptySpacesLeft = txt - number;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < emptySpacesLeft; i++) {
            sb.append(" ");
        }

        return sb.toString();
    }
}

