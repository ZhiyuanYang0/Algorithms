package Problems;

public class MedianOfTwoSortedArray {
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 7, 9};
		int[] nums2 = {1, 2};
		double k1 = findKth(nums1, 0, nums2, 0, 2);
		double k2 = findKth(nums1, 0, nums2, 0, 6);
		System.out.println(k1);
		System.out.println(k2);
		double ans = findMedianSortedArrays(nums1, nums2);
		System.out.println(ans);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len = nums1.length + nums2.length;
		if (len % 2 == 1) {
			return findKth(nums1, 0, nums2, 0, len / 2 + 1);
		} else {
			return (findKth(nums1, 0, nums2, 0, len / 2) + findKth(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
		}
	}

	// find kth number of two sorted array
	private static double findKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
		if (start1 >= nums1.length) {
			return nums2[start2 + k - 1];
		}

		if (start2 >= nums2.length) {
			return nums1[start1 + k - 1];
		}

		if (k == 1) {
			return Math.min(nums1[start1], nums2[start2]);
		}

		if (start1 + k / 2 - 1 >= nums1.length) {
			return findKth(nums1, start1, nums2, start2 + k / 2, k - k / 2);
		}

		if (start2 + k / 2 - 1 >= nums2.length) {
			return findKth(nums1, start1 + k / 2, nums2, start2, k - k / 2);
		}

		if (nums1[start1 + k / 2 - 1] < nums2[start2 + k / 2 - 1]) {
			return findKth(nums1, start1 + k / 2, nums2, start2, k - k / 2);
		} else {
			return findKth(nums1, start1, nums2, start2 + k / 2, k - k / 2);
		}
	}
}
