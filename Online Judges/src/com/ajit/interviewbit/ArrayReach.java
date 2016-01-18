package com.ajit.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReach {

	// X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
	public static int coverPoints(List<Integer> X, List<Integer> Y) {
		if(X.size() != Y.size()) return 0;
		int x, afterX, y, afterY;
		int totalDist = 0;
		for(int i=0; i<X.size() - 1; i++) {
			x = X.get(i);  afterX = X.get(i+1); 
			y = Y.get(i);  afterY = Y.get(i+1);

			int absX = Math.abs(afterX - x);
			int absY = Math.abs(afterY - y);
			int d = Integer.compare(absX, absY) > 0 ?  absX : absY;
			
			totalDist += Math.abs(d);
			
		}
		return totalDist;
    }
	
	public static void main(String[] args) {
		ArrayList<Integer> X = new ArrayList<Integer>();
		ArrayList<Integer> Y = new ArrayList<Integer>();
		Integer[] a = new Integer[] { 4, 8, -7, -5, -13, 9, -7, 8};
		Integer[] b = new Integer[] { 4, -15, -10, -3, -13, 12, 8, -8 };
		List<List<Integer>> ls1 = new ArrayList<List<Integer>>();
		List<List<Integer>> ls2 = new ArrayList<List<Integer>>();
		ls1.add((List<Integer>)Arrays.asList(a));
		ls2.add((List<Integer>)Arrays.asList(b));

		X.add(-7); X.add(1);// X.add(1);
		Y.add(-13); Y.add(-5); //Y.add(2);
		System.out.println(coverPoints(ls1.get(0), ls2.get(0)));

	}

}
