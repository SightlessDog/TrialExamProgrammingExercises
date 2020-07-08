package assignment_02_permutation;


import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayPermutatorTest {

	public static final int SEED = 42;


	@Test
	public void testShuffleInts() {
		ArrayPermutator<Integer> sut = new ArrayPermutator<>(new Random(SEED));
		Integer[] a = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] original = Arrays.copyOf(a, a.length);

		sut.shuffle(a);
		
		// there are two ways to implement the shuffle - starting from the start
		// and starting from the beginning. Both are ok, these are the two possible
		// results:
		Integer[] expected_b = new Integer[] { 5, 8, 3, 1, 2, 6, 4, 10, 9, 7 };
		Integer[] expected_f = new Integer[] { 7, 10, 9, 1, 2, 4, 6, 5, 3, 8};

		// assertShuffle is a convenience method providing richer feedback
		assertShuffle(a, original, expected_b, expected_f, "testShuffleInts");
	}

	@Test
	public void testShuffleStrings() {
		String[] a = "a b c d e f g h i j k l m n o p".split(" ");
		ArrayPermutator<String> sut = new ArrayPermutator<>(new Random(SEED));
		String[] original = Arrays.copyOf(a, a.length);

		sut.shuffle(a);
		
		String[] expected_f = "l, m, n, o, j, c, d, p, i, h, g, f, e, a, k, b".split(", ");
		String[] expected_b = "b, m, h, d, c, e, g, a, j, k, i, f, n, o, p, l".split(", ");
		
		assertShuffle(a, original, expected_b, expected_f, "testShuffleStrings");
	}

	@Test
	public void testOneElement() {
		String[] a = { "a" };
		ArrayPermutator<String> sut = new ArrayPermutator<>(new Random(SEED));
		
		sut.shuffle(a);
		
		String[] expected = { "a" };
		assertArrayEquals(expected, a);
	}
	@Test
	public void testEmptyArray() {
		String[] a = { };
		ArrayPermutator<String> sut = new ArrayPermutator<>(new Random(SEED));
		
		sut.shuffle(a);
		
		String[] expected = { };
		assertArrayEquals(expected, a);
	}

	@Test
	public void testTwoElements() {
		ArrayPermutator<Integer> sut = new ArrayPermutator<>(new Random(SEED));
		Integer[] a = new Integer[] { 4, 7 };
		Integer[] original = Arrays.copyOf(a, a.length);
		
		Integer[] expected_b = new Integer[] { 4, 7 };
		Integer[] expected_f = new Integer[] { 7, 4 };
	
		sut.shuffle(a);
		assertShuffle(a, original, expected_b, expected_f, "testTwoElements");

	
	}

	

	private void assertShuffle(Object[] a, Object[] original, Object[] expected_b, Object[] expected_f,
			String methodName) {
		String message = "";
		boolean fail = false;

		if (Arrays.equals(expected_f, a)) {
			message += "You shuffled forward.";
		} else if (Arrays.equals(expected_b, a)) {
			message += "You shuffled backwards.";
		} else if (Arrays.equals(original, a)) {
			message += "Your array hasn't changed";
			fail = true;
		} else {
			message += "Your array was changed, but not in the way the algorithm presented in class would have changed it";
		}
		System.out.println(methodName+":");
		System.out.println("Original Array: "+Arrays.toString(original));
		System.out.println("Shuffled Array: "+Arrays.toString(a));
		System.out.println(message);
		System.out.println();
		
		if (fail) fail(message);
	}
}
