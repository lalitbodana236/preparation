package com.adhyayana.foundation.array;

import com.adhyayana.foundation.utils.GenericUtils;

public class RemoveEvenIntegerArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 10, 6, 3};

		GenericUtils.print(arr);

		int[] brr = removeEven(arr);

		GenericUtils.print(brr);
	}

	private static int[] removeEven(int[] arr) {
		System.out.println();

		int oddElement=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddElement++;
			}
		}

		int oddIndex=0;
		int[] result = new int[oddElement];

		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[oddIndex++]=arr[i];
			}
		}

		return result;
	}
}
