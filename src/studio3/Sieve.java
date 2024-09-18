package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("To what number would you like to play sieve of Eratosthenes?");
		int n = in.nextInt();

		boolean [] itemSieved = new boolean[n];
		for (int i=2; i<n; i++) {
		itemSieved[i] = true;
			
		}
		
		for (int i=2; i<n; i++) {
			for (int j = i*2; i<n; j+=i) {
				itemSieved[j] = false;
				System.out.println(itemSieved[n]);
		}
	}
		for (int i=2; i<n; i++) {
			if(itemSieved[i]==true) {
				System.out.println(n);
			}
		}
}
}