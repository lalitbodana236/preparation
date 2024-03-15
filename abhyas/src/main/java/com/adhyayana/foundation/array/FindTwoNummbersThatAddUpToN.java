package com.adhyayana.foundation.array;

import com.adhyayana.foundation.utils.GenericUtils;

public class FindTwoNummbersThatAddUpToN {
	public static void main(String[] args) {
		int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
		int value = 27;
		
		GenericUtils.print(findSum(arr,value));
	}
	
	 public static int[] findSum(int[] arr, int n) {
	        int[] result = new int[2];

	      for(int i=0;i<arr.length;i++) {
	    	  for(int j=i+1;j<arr.length;j++) {
	    		  if(arr[i]+arr[j]==n) {
	    			  result[0] =arr[i];
	    			  result[1]=arr[j];
	    			  return result;
	    		  }
	    	  }
	      }
	       
	        return new int[0];
	    }
}
