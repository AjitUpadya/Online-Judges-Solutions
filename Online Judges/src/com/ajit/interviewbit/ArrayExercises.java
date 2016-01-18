package com.ajit.interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayExercises {
	
	public static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		//[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
		A.add(new ArrayList<Integer>()); A.add(new ArrayList<Integer>()); A.add(new ArrayList<Integer>());
		A.get(0).add(1);A.get(0).add(2);A.get(0).add(3);A.get(0).add(4);
		A.get(1).add(5);A.get(1).add(6);A.get(1).add(7);A.get(1).add(8);
		A.get(2).add(9);A.get(2).add(10);A.get(2).add(11);A.get(2).add(12);
		
		ArrayList<ArrayList<Integer>> B = performOps(A);
		for (int i = 0; i < B.size(); i++) {
		    for (int j = 0; j < B.get(i).size(); j++) {
		            System.out.print(B.get(i).get(j) + " ");
		    }
		}
		
		Solution sol = new Solution();
		ArrayList<Integer> C = new ArrayList<Integer>();
		C.add(1);C.add(2);C.add(3);C.add(4);C.add(5);C.add(6);
		//C = sol.rotateArray(C, 10);
		//sol.performOps(C);
		
		/*ArrayList<Integer> x = sol.performOps(C);
		for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i) + " , ");
		}*/
	}
}



class Solution {
	
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			ret.add(A.get((i + B) % A.size()));
		}
		return ret;
	}
	
	ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
                B.set(i, A.get(i));
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
	}
}

