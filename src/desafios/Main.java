package desafios;

import desafios.kyu6.Columnize;

public class Main {

	public static void main(String[] args) {
		String[] input = { "", "12", "123", "", "12345", "" };
		System.out.println(Columnize.columnize(input,2));
	}
}


