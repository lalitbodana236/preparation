package com.adhyayana.foundation.array;

import com.adhyayana.foundation.utils.GenericUtils;

public class FindProduct {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};

		GenericUtils.print(findProduct(arr));


		int[] arr1 = {4,2,1,5,0};

		GenericUtils.print(findProduct(arr1));

	}


	public static int[] findProduct(int arr[])  
	{    
		int n = arr.length;
		int i, temp = 1; 
		// Allocation of result array
		int result[] = new int[n]; 
		// Product of elements on left side excluding arr[i]
		for (i = 0; i < n; i++)  
		{ 
			result[i] = temp; 
			temp *= arr[i]; 
		} 
		// Initializing temp to 1 for product on right side
		
		GenericUtils.print(result);
		
		temp = 1; 

		// Product of elements on right side excluding arr[i] 
		for (i = n - 1; i >= 0; i--)  
		{ 
			result[i] *= temp; 
			temp *= arr[i]; 
		}
		
		GenericUtils.print(result);

		return result;
	} 

}
