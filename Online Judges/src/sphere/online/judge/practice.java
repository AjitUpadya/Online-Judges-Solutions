package sphere.online.judge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice {
	static List<Integer> list = null;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1; i <= n; i++) {
			//System.out.println(in.nextInt());
			getPrimes(in.nextInt(), in.nextInt());
		}
	}
	static void getPrimes(int from, int to) {
		list = new ArrayList<Integer>();
		for(int i = from; i < to; i++) {
			if(isPrime(i)) {
				list.add(i);
			}
		}
		for(int i : list) {
			System.out.println(i);
		}
	}
	
	static boolean isPrime(int number) {
		if(number < 2) 	
			return false;
		for(int i=2; i<number; i++){
            if(number%i == 0){
                return false; //number is divisible so its not prime 
            } 
        } 
        return true;
	}
}
