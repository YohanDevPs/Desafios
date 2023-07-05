package desafios.codewars;

import desafios.codewars.kyu6.Columnize;

public class MainCodewars {

	public static void main(String[] args) {
		String[] input = { "", "12", "123", "", "12345", "" };
		System.out.println(Columnize.columnize(input,2));
	}
}


