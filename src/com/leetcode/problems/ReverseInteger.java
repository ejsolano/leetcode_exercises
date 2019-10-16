package com.leetcode.problems;

public class ReverseInteger {

	/**
	 * Given a 32-bit signed integer, reverse digits of an integer.
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 12345789;
		reverse(x);
	}
	
	public static int reverse(int x) {
        String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }

}
