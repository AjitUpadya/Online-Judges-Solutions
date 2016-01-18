package com.ajit.geeksforgeeks;

public class Quicksort {

	public static void quickSort(int[] a, int p, int r) {
		if(p < r) {
			int q = partition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		}
	}
	
	public static int partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p-1;
		for(int j=p; j <= r-1; j++) {
			if(a[j] <= x) {
				i = i+1;
				swap(a, i, j);
			}
		}
		swap(a, i+1, r);
		return i+1;
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {5,4,3,2,1};
		quickSort(a, 0, a.length-1);
		for(int i : a) {
			System.out.println(i + "\t");
		}
	}

}
