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
   
   Collection<Object[]> testCasesMaxsum() {
	      return Arrays.asList(new Object[][] {
	    	 { new int[] {1,2,3}, 6 },
	         { new int[] {-11,-2,3,5,-7}, 8 },
	      });
	   }
   
   Collection<Object[]> testCasesCountSort() {
	      return Arrays.asList(new Object[][] {
	    	 { new int[] {1,2,3}, new int[] {1,2,3} },
	         { new int[] {-11,-2,3,5,-7}, new int[] {-11,-7,-2,3,5} },
	      });
	   }
	
	void testPrime(int number, int[] expected)
	{
		int[] primes = Prime.GetPrimes(number);
		assertArrayEquals(expected, primes);
	}

	void testMaxsum(int[] numbers, int expected) 
	{
		int maxSum = MaxSum.GetMaxSum(numbers);
		assertEquals(expected, maxSum);
	}
	
	void testCountSort(int[] numbers, int[] expected) 
	{
		try {
			int[] sorted = CountSort.Sort(numbers);
			assertArrayEquals(expected, sorted);
		} catch (Exception e) {
			assertFalse(true);
		}
	}
	
	@Test
	void runTestPrime() {
		for (Object[] args : testCasesPrimes()) {
			testPrime((int)args[0], (int[])args[1]);
		}
	}
	
	@Test
	void runTestMaxSum() {
		for (Object[] args : testCasesMaxsum()) {
			testMaxsum((int[])args[0], (int)args[1]);
		}
	}
	
	@Test
	void runTestCountSort() {
		for (Object[] args : testCasesCountSort()) {
			testCountSort((int[])args[0], (int[])args[1]);
		}
	}
}
