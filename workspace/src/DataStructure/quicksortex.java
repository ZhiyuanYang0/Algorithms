package DataStructure;

public class quicksortex {
	
	public static void main(String[] args) {
		int[] nums = {1,2,4,3,0};
		quicksort(nums, 0, nums.length - 1);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static void quicksort (int A[], int start, int end) {
		int i = start;
		int j = end;
		int pivot = A[start];
		
		while (i < j) {
			 
			while (i < j && A[j] >= pivot) {
				j--;
			}
            if (i < j) {
    			int temp = A[i];
    			A[i] = A[j];
    			A[j] = temp;            	
            }

            while (i < j && A[i] < pivot) {
            	i++;
            }
            if (i < j) {
    			int temp = A[i];
    			A[i] = A[j];
    			A[j] = temp;                	
            }
		}
		
		if (i - start > 1) {
			quicksort(A, start, i - 1);
		}
		if (end - j > 1) {
			quicksort(A, j + 1, end);
		}
		
	}
}
