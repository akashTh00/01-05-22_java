// java program to check whether number is palindrome or not

import java.util.*;
class Palindrome1{
	public static void main(String[] args) {
		int n, temp,r, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		n = sc.nextInt();
		temp = n; 
		while(n > 0){
			r = n % 10;
			sum = (sum*10) + r;
			n = n / 10;
		}
		if( sum == temp )
			System.out.println("Palindrome number");
		else
			System.out.println("not Palindrome");
	}
}


/* A palindrome number is a number that is same after reverse. 
   For example 545, 151, 34543, 343, 171, 48984 
   are the palindrome numbers. It can also be a string like LOL, MADAM etc.
*/ 