package fede.algo.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;


import fede.algo.*;


class TestAlgorithm {

   Collection<Object[]> testCasesPrimes() {
      return Arrays.asList(new Object[][] {
    	 { 0, new int[0] },
    	 { 2, new int[] {1,2} },
         { 3, new int[] {1,2,3} },
         { 4, new int[] {1,2,3} },
         { 5, new int[] {1,2,3,5} },
         { 6, new int[] {1,2,3,5} },
         { 7, new int[] {1,2,3,5,7} },
      });
   }
	
	void testPrime(int number, int[] expected) 
	{
		int[] primes = Prime.GetPrimes(number);
		assertArrayEquals(expected, primes);
	}

	@Test
	void runTestPrime() {
		for (Object[] args : testCasesPrimes()) {
			testPrime((int)args[0], (int[])args[1]);
		}
	}
}
