package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = in.nextInt();
//boolean to keep track of prime or not prime, all boolean false to begin with
		boolean[] primes= new boolean[n];

		int p = 2;
		for(int i=0;i<n;i++) {
			primes[i]=true;
			for(int j=2;j<i+1;j++) { //starts loop at i=2
				int num=i+1;
				if((num-(num)/j *j)==0){
					primes[i]=false;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println("The number: " + (i+1) +" " + primes[i]);
		}
	}

}
