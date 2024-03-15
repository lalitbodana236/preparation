package com.adhyayana.foundation.array;

import com.adhyayana.foundation.utils.GenericUtils;

public class FindMinimum {

	public static void main(String[] args) {
		int[] arr = {9, 2, 3, 6};
		System.out.println(findMinimum(arr));
	}
	
	public static int findMinimum(int[] arr) {
	      int ans=Integer.MAX_VALUE;
	      for(int i=0;i<arr.length;i++) {
	    	  if(arr[i]<ans)
	    		  ans=arr[i];
	      }
	      return ans;     
	    }

}
