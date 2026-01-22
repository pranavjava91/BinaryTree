package practice;

import java.util.Arrays;

public class MergeSort {
	
	public int[] mergeSort(int[] arr) {
		
		if(arr.length == 0 || arr.length ==1) {
			return arr;
		}
		
		int mid = arr.length/2;
		
		int[] leftArray = mergeSort(Arrays.copyOfRange(arr, 0,mid));
		
		int[] rightArray = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(leftArray,rightArray);
	}

	public int[] merge(int[] leftArray, int[] rightArray) {
		
		
		int i=0;
		int j=0;
		int k=0;
		
		int[] mix = new int[leftArray.length+rightArray.length];
		
		while(i<leftArray.length && j<rightArray.length) {
			
			if(leftArray[i]<rightArray[j]) {
				mix[k] = leftArray[i];
				i++;
			} else {
				mix[k] = rightArray[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i<leftArray.length) {
			mix[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightArray.length) {
			mix[k] = rightArray[j];
			j++;
			k++;
		}
		
		
		return mix;
		
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {20,30,60,10,50};
		
		int[] arr = {3,4,5,2,1};

		MergeSort mergeSort = new MergeSort();
		int[] result = mergeSort.mergeSort(nums);
		for(int m : result) {
			System.out.println(m);
		}
	}

}
