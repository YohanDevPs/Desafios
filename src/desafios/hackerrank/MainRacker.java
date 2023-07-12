package desafios.hackerrank;

/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, s, of n real number strings, sort them in descending order — but wait, there's more! Each number must be
printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers
represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

Input Format

The first line consists of a single integer, , denoting the number of integer strings.
Each line  of the  subsequent lines contains a real number denoting the value of .

Constraintsa

Each  has at most  digits.
Output Format

Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering the array's elements.

Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100
 */


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRacker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String number = scanner.nextLine();
            numbers.add(number);
        }

        numbers.sort((s1, s2) -> {
            BigDecimal num1 = new BigDecimal(s1);
            BigDecimal num2 = new BigDecimal(s2);
            int compareResult = num2.compareTo(num1);
            if (compareResult == 0) {
                return numbers.indexOf(s1) - numbers.indexOf(s2);
            }
            return compareResult;
        });

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}