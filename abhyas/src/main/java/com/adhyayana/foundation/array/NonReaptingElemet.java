package com.adhyayana.foundation.array;

public class NonReaptingElemet {

	public static void main(String[] args) {
		int[] arr = {9, 2, 3, 2, 6, 6};
		System.out.println(findFirstUnique(arr));


		int[] arr1 = {2,2,-6};
		System.out.println(findFirstUnique(arr1));
	}

	public static int findFirstUnique(int[] arr) {
		int result = -1;
		boolean isMatched=false;
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					isMatched=true;
					break;
				}
			}
			if(!isMatched)
				return arr[i];
			else 
				isMatched=false;
		}
		return result;
	}

}
