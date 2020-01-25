package fede.algo;


public class Prime {

	public static void main(String[] args) {
		int n = 7;
		int[] primes = GetPrimes(n);
		String[] primesStrings = new String[primes.length];
		for (int i = 0; i < primes.length; i++) {
			primesStrings[i] = String.valueOf(primes[i]);
		}
		System.out.println("["+String.join(",", primesStrings)+"]");
	}

	
	public static int[] GetPrimes(int n) 
	{
		int[] primes = new int[n];
		
		int k = 0;
		for (int i = 1; i < n+1; i++) {
			if(isMultipleOfAnyOfTheese(i, primes) ) continue;
			else {
				primes[k] = i;
				k++;
			} 
		}
		int [] r = new int[k];
		System.arraycopy(primes, 0, r, 0, k);
		return r;
		
	}
	
	public static boolean isMultipleOfAnyOfTheese(int n, int[] numbers) 
	{
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i]== 0) break;
			if(n%numbers[i] == 0) return true;
		}
		return false;
	}
}
