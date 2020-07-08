package assignment_02_permutation;

import java.util.Random;

/**
 * Assignment 02: Implement the method shuffle that shuffles the array given as
 * a parameter in place.
 * 
 * IMPORTANT: use the random generator that is passed as a parameter!
 * This way, the random values are always the same.
 * 
 * @author kleinen
 *
 * @param <E>
 */
public class ArrayPermutator<E> {

	/**
	 * Shuffles the array in place.
	 * 
	 * @param a
	 */
	public void shuffle(E[] a) {
		// implement the method.
		// use the already available Random random;!
	}

	// nothing to do below this point -
	// don't create a new Instance of Random - use
	// the one passed by the test!
	Random random;

	public ArrayPermutator(Random randomGenerator) {
		random = randomGenerator;
	}
}
