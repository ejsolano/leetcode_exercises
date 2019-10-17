package com.leetcode.problems;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * 
 * @author Ely Solano
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPalindromeDos(454));

	}

	// My solution. Incomplete
	public static boolean isPalindrome(int x) {
		
		if (x < 0) {

			return false;

		}

		int length = (int) (Math.log10(x) + 1); // get number of digits

		if (length == 1) {

			return true;

		} else {

			//falta determinar si es palindrome

		}

		return false;
	}
	
	// Internet solution
	public static boolean isPalindromeDos(int x) {

		int r,sum = 0,temp;    

		temp = x;
		while(x > 0) {  
			r = x % 10;
			sum = (sum*10)+r;
			x = x / 10;
		}

		return temp == sum;
	}

}
