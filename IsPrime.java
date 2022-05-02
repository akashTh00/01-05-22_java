// java program to check whether a number is prime or not--

import java.util.*;
class IsPrime{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Number : ");
			int num = sc.nextInt();
			boolean isPrime = false;
			for(int i=2; i < num / 2 ; ++i){
				if( num % i == 0){
					isPrime = true;
					break;
				}
			}
			if(!isPrime)
				System.out.printf("The number %d is a prime number.", num);
			else 
				System.out.printf("The number %d is not a prime number", num);
	}
}


