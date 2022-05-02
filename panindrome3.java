// java program to check whether a number is panindrome or not using recursions--

import java.util.*;

class panindrome3{
	static int rev(int n, int temp){

		if(n == 0)
			return temp;
		temp = ( temp * 10) + (n % 10);
		return rev( n/10 , temp);
	}
	public static void main(String[] args) {
		
		int n = 12231;
		int temp = rev(n, 0);

		if(temp == n)
			System.out.println("yes");
		else 
			System.out.println("no");
	}
}