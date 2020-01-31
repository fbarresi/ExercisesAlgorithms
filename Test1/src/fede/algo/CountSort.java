package fede.algo;

import java.util.Arrays;

public class CountSort {

	public static void main(String[] args) 
	{
		int[] sorted;
		try {
			sorted = Sort(new int[] {1,2,3,5,1,2});
			System.out.println(Arrays.toString(sorted));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static int[] Sort(int[] numbers) throws Exception 
	{
		int max = GetMax(numbers);
		if(max <= 0) throw new Exception("Max element < 0");
		int[] sorted = new int[numbers.length];
		int[][] traces = new int[max+1][1];
		
		for (int i = 0; i < numbers.length; i++)
			traces[numbers[i]][0]++;
		
		int sum = traces[0][0];
		for (int i = 1; i < traces.length; i++)
		{
			traces[i][0]+=sum;
			sum = traces[i][0];
		}
		
		for (int i = 0; i < numbers.length; i++) 
		{
			sorted[traces[numbers[i]][0]-1] = numbers[i];
			traces[numbers[i]][0]--;
		}
		return sorted;
	}
	
	private static int GetMax(int[] numbers)
	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++)
			if(numbers[i]>max) max = numbers[i];
		return max;
	}

}
