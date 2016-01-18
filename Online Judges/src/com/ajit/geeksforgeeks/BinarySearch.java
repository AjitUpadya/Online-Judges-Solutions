package com.ajit.geeksforgeeks;

public class BinarySearch {

	public static int binarySearch(int[] a, int low, int hi, int key) {
		if(hi >= low) {
			int mid = (low + hi) /2;
			if(a[mid] == key) return mid;
			else if(a[mid] < key) {
				return binarySearch(a, mid+1, hi, key);
			} else if(a[mid] > key) {
				return binarySearch(a, low, mid-1, key);
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
	
	public static int iterativeBinarySearch(int[] a, int low, int hi, int key) {
		int mid = 0;
		while(hi-low >= 1) {
			mid = (low + (hi))/2;
			if(a[mid] < key) {
				low = mid+1;
			} else {
				hi = mid-1;
			}
		}
		/*if(a[low] <= key) {
			return a[low];
		} else return -1;*/
		return low;
	}
	
	public static int findNumberOfOcc(int[] a, int low, int hi, int key) {
		int mid = (low + hi)/2;
		int leftPos = iterativeBinarySearch(a, 0, mid, key);
		int rightPos = iterativeBinarySearch(a, mid, hi, key);
		return rightPos - leftPos + 1;
	}
	
	public static int findPeakElement(int[] a, int low, int hi) {
		if(low == hi) return a[low];
		int mid = (low + hi)/2;
		if(mid == 0)	return a[mid];
		if(mid == a.length-1)	return a[mid];
		if(a[mid] > a[mid+1] && a[mid] > a[mid-1])	return a[mid];
		else if(a[mid] > a[mid-1]) {
			return findPeakElement(a, mid+1, hi);
		} else {
			return findPeakElement(a, low, mid-1);
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		int[] b = new int[]{-1, 2, 3, 5, 6, 8, 9, 10};
		int[] c = new int[] {1,2,3,5,5,5,5,5,5,6,7,8,9};
		int[] d = new int[] {10, 20, 30, 40, 50};
		int[] e = new int[] {50, 40, 30, 20, 10};
		int[] f = new int[] {100, 80, 60, 50, 20};
		//System.out.println(binarySearch(a, 0, a.length-1, 100));
		//System.out.println(iterativeBinarySearch(a, 0, a.length-1, 5));
		//System.out.println(iterativeBinarySearch(b, 0, b.length-1, 0));
		//System.out.println(findNumberOfOcc(c, 0, c.length-1, 5));
		System.out.println(findPeakElement(f, 0, f.length-1));
		
	}

}
