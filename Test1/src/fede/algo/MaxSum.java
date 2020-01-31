package fede.algo;


public class MaxSum {

	public static void main(String[] args) {
		int primes = GetMaxSum(new int[] {-11,-2,3,5,-7,10,10,-100});
		System.out.println(primes);
	}
	
	public static int GetMaxSum(int[] numbers) 
	{
		int max = 0;
		int gaps = 0;
		int lastGotIndex = 0;
		for (int i = 0; i < numbers.length; i++) 
		{
			if(max+numbers[i]+gaps > max)
			{
				max= max + numbers[i] + gaps;
				lastGotIndex = i;
				gaps = 0;
			}
			else if(lastGotIndex != 0) 
			{
				gaps += numbers[i];
			}
		}
		return max;
	}
}
