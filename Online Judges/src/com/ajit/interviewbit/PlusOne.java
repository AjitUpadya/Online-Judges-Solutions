package com.ajit.interviewbit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PlusOne {
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		boolean flag = true;
		String numStr = "";
		for(int i=0; i<a.size(); i++) {
			if(a.get(i)== 0 && a.size() > 1 && flag) {
				continue;
			} else {
				flag = false;
				numStr += ""+a.get(i);
			}
		}
		if(!(numStr.length() > 0)) return null;
		//BigInteger num = BigInteger.valueOf(Long.valueOf(numStr.trim()) + 1);
		BigInteger num = new BigInteger(numStr.trim());
		num = num.add(new BigInteger("1"));
		String[] newNumArr = String.valueOf(num).trim().split("");
		a = new ArrayList<Integer>();
		for(int j=0; j<newNumArr.length; j++) {
			if(newNumArr[j] != "" && newNumArr[j].length() > 0) {
				a.add(Integer.parseInt(newNumArr[j]));
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		//1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5
		//9999999999999999999
		//ls.add(9); ls.add(9); ls.add(9);ls.add(9); ls.add(9); ls.add(9); ls.add(9); ls.add(9); ls.add(9); ls.add(9); ls.add(9); ls.add(9);
		
		ls.add(1);
		plusOne((ArrayList<Integer>) ls);

	}

}
