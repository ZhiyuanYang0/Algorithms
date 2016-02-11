package DataStructure;

import java.util.Arrays;

public class mergesort {

	  public static void main(String[] args) {  
		  
	        int[] A = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };    
	        int nums[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	        mergeSort(nums, 0, nums.length - 1);  
            System.out.println(Arrays.toString(nums));  
	    }  
	  
	  public static void mergeSort(int a[], int left, int right) {
		  if (left >= right) {
			  return;
		  }
		  int center = (left + right) / 2;
		  mergeSort(a, left, center);
		  mergeSort(a, center + 1, right);
		  merge(a, left, center, right);
	  }
	  
	  public static void merge(int a[], int left, int center, int right) {
		  int[] temp = new int[a.length];
		  int i = left; //left pointer
		  int j = center + 1; //right pointer
		  int k = left;
		  while (i <= center && j <= right) {
			  if (a[i] <= a[j]) {
				  temp[k] = a[i];
				  k++;
				  i++;
			  } else {
				  temp[k] = a[j];
				  k++;
				  j++;
			  }
		  }
		  //put the rest elements to the temp array
		  while (i <= center) {
			  temp[k] = a[i];
			  k++;
			  i++;
		  }
		  while (j <= right) {
			  temp[k] = a[j];
			  k++;
			  j++;
		  }
		  while (left <= right) {
			  a[left] = temp[left];
			  left++;
		  } 
	  }
	
}
