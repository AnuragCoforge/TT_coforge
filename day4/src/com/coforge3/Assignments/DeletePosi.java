package com.coforge3.Assignments;
import java.util.Scanner;
public class DeletePosi {
	
	public static void printArray(int arr[]) {
		System.out.print("[ ");
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");

	}
	
	public static void deleteElement(int nums[], int posi, int n) {
		if(posi == 0) { //first index
			int tmp[] = new int[n-1];
			for(int i=0 ; i<n-1 ; i++) {
				tmp[i] = nums[i+1];
			}
			printArray(tmp);
		}
		else if(posi == n-1) { //last index
			int tmp[] = new int[n-1];
			for(int i=0 ; i<n-1 ; i++) {
				tmp[i] = nums[i];
			}
			printArray(tmp);

		}
		else if(posi > 0 && posi < n-1){//anywhere in between
//			System.out.println("correct");
			int tmp[] = new int[n-1];

			for(int i=0 ; i< posi; i++) {
				tmp[i] = nums[i];
			}
			
			for(int i=posi ; i<n-1 ; i++) {
				tmp[i] = nums[i+1];
			}
			printArray(tmp);
		}
		else {
			System.out.println("Invalid position");
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position for deletion: ");
		int posi = sc.nextInt();
		int nums[] = {1, 3, 5, 8, 9};
		int n = nums.length;
		deleteElement(nums, posi, n);
		sc.close();
	}
}
