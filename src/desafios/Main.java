package desafios;

import desafios.kyu7.Rotations;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class Main {

	public static void main(String[] args) {

	}
	private static void testing(Boolean actual, Boolean expected) {
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		System.out.println("Fixed Tests containAllRots");
		testing(Rotations.containAllRots("", Arrays.asList()), true);
		List<String> a = Arrays.asList("bsjq", "qbsj");
		testing(Rotations.containAllRots("", a), true);
		a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
		testing(Rotations.containAllRots("bsjq", a), true);
		a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
		testing(Rotations.containAllRots("XjYABhR", a), false);
	}
}


