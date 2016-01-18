package com.ajit.interviewbit;
import java.util.ArrayList;

public class SpiralArray {
	public static void main(String[] args) {
		SpiralArray arr = new SpiralArray();
		int[][] a = new int[4][4];
		int k = 1;
		for(int i=0; i<4; i++) {
			for (int j=0; j<4 ; j++) {
				a[i][j] = k;
				k++;
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println("");
		printSpiral(a);
	}

	public static void printSpiral(int[][] A) {
		ArrayList<Integer> coveredLs = new ArrayList<Integer>();
		int i = 0,j = 0;
		coveredLs.add(i);
		while(j < A.length - 1) {
			System.out.print(A[i][j] + " ");
			j++;
		}
		while(i < A.length - 1) {
			System.out.print(A[i][j] + " ");
			i++;	
		}
		while(i > -1 && j > -1) {
			System.out.print(A[i][j] + " ");
			i--; j--;
		}
	}
}