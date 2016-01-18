package timus.online.judge;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TimusProblem {
	
	public static void main(String[] args) {
		TimusProblem prob = new TimusProblem();
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			list.add(in.nextInt());
		}
		Collections.reverse(list);
		for(int i : list) {
			printRoot(i);
		}
	}
	public static void printRoot(int n) {
		System.out.println(Math.sqrt(n));
	}
}
