package com.ajit.coursera;

public class Sorter {
	public static void sort(Comparable[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			for(int j=i; j>0; j--) {
				if(a[j].compareTo(a[j-1]) < 0) {
					exch(a,j,j-1);
				}
			}
		}
	}
	
	public static void bubbleSort(Comparable[] a) {
		int n = a.length;
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(less(a[j+1],a[j])) {
					exch(a,j,j+1);
				}
			}
		}
	}
	
	public static void selectionSort(Comparable[] a) {
		int n = a.length;
		for(int i=0; i<n ; i++) {
			int min = i;
 			for(int j=i+1; j<n; j++) {
				if(less(a[j],a[min])) {
					min = j;
				}
			} 	// go through entire array from a[i+1] till n and find the smallest element
			exch(a,i,min); 			// swap the smallest with a[i] 
		}
	}
	
	public static void insertionSort(Comparable[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			for(int j=i; j>0; j--) {
				if(less(a[j],a[j-1])) {
					exch(a,j,j-1);
				} 
				else break;
			}
		}
	}
	private static boolean less(Comparable v, Comparable w) {
		//returns true if first arg is smaller that second arg
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	private static boolean isSorted(Comparable[] a) {
		for(int i=1; i<a.length;i++) {
			if(less(a[i], a[i-1])) {
				return false;
			}
		}
		return true;
	}
	
	private static void printComparable(Comparable[] a) {
		for(Comparable i : a) {
			System.out.print(i.toString());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Sorter sorter = new Sorter();
		Comparable[] comp = new Comparable[] {1,4,3,2,5};
		//Comparable[] comp = new Comparable[] {"D","C","B","A"};
		printComparable(comp);
		//Sorter.sort(comp);
		//selectionSort(comp);
		insertionSort(comp);
		//bubbleSort(comp);
		printComparable(comp);
	}
}
