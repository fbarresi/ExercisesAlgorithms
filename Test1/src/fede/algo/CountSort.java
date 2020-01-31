package fede.algo;

import java.util.Arrays;

public class CountSort {

	public static void main(String[] args) 
	{
		int[] sorted;
		try {
			sorted = Sort(new int[] {-1,2,3,5,1,2});
			System.out.println(Arrays.toString(sorted));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static int[] Sort(int[] numbers) 
	{
		int[] minMax = GetMinMax(numbers);
		int max = minMax[1];
		int min = minMax[0];
		int[] sorted = new int[numbers.length];
		int[][] traces = new int[max-min+1][1];
		
		for (int i = 0; i < numbers.length; i++)
			traces[numbers[i]-min][0]++;
		
		int sum = traces[0][0];
		for (int i = 1; i < traces.length; i++)
		{
			traces[i][0]+=sum;
			sum = traces[i][0];
		}
		
		for (int i = 0; i < numbers.length; i++) 
		{
			sorted[traces[numbers[i]-min][0]-1] = numbers[i];
			traces[numbers[i]-min][0]--;
		}
		return sorted;
	}
	
	private static int[] GetMinMax(int[] numbers)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++)
		{	
			if(numbers[i]>max) max = numbers[i];
			if(numbers[i]<min) min = numbers[i];
		}
		return new int[] {min, max};
	}

}
