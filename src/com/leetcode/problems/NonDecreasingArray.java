package com.leetcode.problems;

public class NonDecreasingArray {

	static int movimientos = 0; 
	/**
	 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {3,4,2,3};
		int[] nums2 = {3,4,2,3};

		System.out.println("Se puede ordenar decrecientemente con tan solo un movimiento: " + checkPossibilityDos(nums2));

		System.out.println("Se puede ordenar decrecientemente con tan solo un movimiento: " + checkPossibility(nums));

	}

	/**
	 * Primera solucion
	 * @param nums arreglo de enteros
	 * @return Arreglo de enteros
	 */
	public static boolean checkPossibility(int[] nums) {

		int movimientos = 0;
        for (int i = 1; i < nums.length; i++) {
			
			for (int j = 0; j < nums.length - 1; j++) {
				if (j == 0 && nums[j] > nums[j+1]) {
                    nums[j] = nums[j+1];
                    movimientos++;
                }
                
				if (nums[j] > nums[j+1]) {
					
                    if (j + 2 < nums.length && nums[j] > nums[j+2]) {
                        nums[j] = nums[j+1];
                    } else {
                        nums[j+1] = nums[j];
                    }
					
					movimientos++;
                    
				}

				
			}
						
		}
        
        return !(movimientos > 1);

	}

	/**
	 * Segunda solucion más eficiente. Usa un solo for.
	 * @param nums
	 * @return
	 */
	public static boolean checkPossibilityDos(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i+1]) {
				if (i > 0) {
					if (nums[i-1] <= nums[i+1]) {
						nums[i] = nums[i-1];
					} else {
						nums[i+1] = nums[i];
					}
				}
				
				count++;
				if(count > 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Solucion vergataria, pero aun no la entiendo.
	 * @param nums
	 * @return
	 */
	public static boolean checkPossibilityTres(int[] nums) {
        int p = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                if (p != -1) return false;
                else p = i;
            }
        }
        return (p == -1 || p == 1 || p == nums.length - 1 || nums[p - 2] <= nums[p] || nums[p - 1] <= nums[p + 1]); 
    }

	public static void imprimirArreglo (int[] array) {
		System.out.print("[" );
		for (int i = 0; i < array.length; i++) {
			System.out.print( array[i] );
		}
		System.out.println("]");
	}

}
