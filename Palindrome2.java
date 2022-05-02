//java program to check if a string is palindrome or not

import java.util.*;
class Palindrome2{
	public static void main(String[] args) {
		String str = "NITIN";
		StringBuffer newStr = new StringBuffer();
		for(int i= str.length()-1; i >=0; i--){
			newStr = newStr.append(str.charAt(i));
		}
		if(str.equalsIgnoreCase(newStr.toString()))
		{
			System.out.println("String is palindrome");
		}
	    else{
	    	System.out.println("String is not a palindrome");
	    }

	}
}


		/* The equalsIgnoreCase() method compares two strings, ignoring lower case and 
		upper case difference.
		This method returns true if the strings are equal, and false if not.
		*/

		/* The toString() method of StringBuffer class is the inbuilt method used 
		to returns a string representing the data contained by StringBuffer Object. 
		A new String object is created and initialized to get the character sequence 
		from this StringBuffer object and then String is returned by toString(). 
		Subsequent changes to this sequence contained by Object do not affect the 
		contents of the String.
		*/