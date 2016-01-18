package com.ajit.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class MaxSum {
	
	static int max_so_far=0;
	static int max_ending_here=0;
	
	//kadane's algorithm
	public static int maxSubArray(final List<Integer> a) {
		int s=0;int e=0;boolean f=false;
	    for (int i = 0; i <a.size(); i++) {

	        if (max_ending_here+a.get(i)>0) {

	            max_ending_here=max_ending_here+a.get(i);

	            if (max_so_far<max_ending_here) {
	                max_so_far=max_ending_here;
	                if (!f) {
	                    s=i;
	                    f=true;
	                }
	                e=i;
	            }
	        } else {
	        	max_so_far = 0;
	        	max_ending_here = 0;
	        }

	    }
	    System.out.println("Position in array :(" + s +","+e+")");
	    return max_so_far;
	}
	
	// Accepted
	public static int maxSubArray1(final List<Integer> a) {
		int max = a.get(0);
		int[] sum = new int[a.size()];
		sum[0] = a.get(0);
 
		for (int i = 1; i < a.size(); i++) {
			sum[i] = Math.max(a.get(i), sum[i - 1] + a.get(i));
			max = Math.max(max, sum[i]);
		}
 
		return max;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(-2);
		list.add(1);
		list.add(-3);
		list.add(4);
		list.add(-1);
		list.add(2);
		list.add(1);
		list.add(-5);
		list.add(4);
		
		System.out.println(maxSubArray1(list));
	}

}
