package com.adhyayana.foundation.array;

import com.adhyayana.foundation.utils.GenericUtils;

public class CheckMergeArray {
	
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 5}  ;
		int[] arr2 = {2, 6, 7, 8} ;
		
		GenericUtils.print(mergeArraysOptimised(arr1,arr2));
		
		int[] arr3 = {1, 2,3}  ;
		int[] arr4 = {4,5,6} ;
		
		GenericUtils.print(mergeArraysOptimised(arr3,arr4));
		
		int[] arr5 = {-1, 3}  ;
		int[] arr6 = {-1,-1,0,0,1,2} ;
		
		GenericUtils.print(mergeArraysOptimised(arr5,arr6));
		
		int[] arr7 = {6,7,8,9,10}  ;
		int[] arr8 = {1,2,3,4,5} ;
		
		GenericUtils.print(mergeArraysOptimised(arr7,arr8));
		
		int[] arr9 = {10,49,99,110,176}  ;
		int[] arr10 = {1,2,4,7,8,12,15,19,24,50,69,80,100} ;
		
		GenericUtils.print(mergeArraysOptimised(arr9,arr10));
		
		int[] arr11 = {0,1,4,9}  ;
		int[] arr12 = {-111,-20,-5,5,11,20} ;
		
		GenericUtils.print(mergeArraysOptimised(arr11,arr12));
	}
	
	public static int[] mergeArrays(int[] arr1, int[] arr2) 
    {  
        int[] result = new int[arr1.length+arr2.length];
        int index=0;
        for(int i : arr1)
        	result[index++]=i;
        
        for(int i : arr2)
        	result[index++]=i;
        
        
        for(int i=0;i<result.length-1;i++) {
        	
        	for(int j=i+1;j<result.length;j++) {
        		if(result[i]>result[j]) {
        			int temp =result[j];
        			result[j]=result[i];
        			result[i]=temp;
        			System.out.println("sort ");
        			GenericUtils.print(result);
        		}
        		
        		
        	}
        }
       
        return result;
    }
	
	public static int[] mergeArraysOptimised(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length+arr2.length];
		int index=0;
		int s1=arr1.length;
		int s2=arr2.length;
		int i=0,j=0;
		while(i<s1 && j<s2) {

			if(arr1[i]<arr2[j]) {
				result[index++]=arr1[i++];
			}else {
				result[index++]=arr2[j++];
			}
		}

		while(i<s1) {
			result[index++]=arr1[i++];
		}

		while(j<s2) {
			result[index++]=arr2[j++];
		}

		return result;
	}
}
