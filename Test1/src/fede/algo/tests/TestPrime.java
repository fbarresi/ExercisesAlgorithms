package fede.algo.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import fede.algo.*;

class TestPrime {

	@Test
	void test() {
		int n = 3;
		int[] primes = Prime.GetPrimes(n);
		int[] expected = new int[] {1,2,3};
		assertArrayEquals(expected, primes);
	}

}
