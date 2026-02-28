package com.coforge3.Assignments;

public class SortingAlgorithms {
	
	public static void printArray(int arr[]) {
		System.out.print("[ ");
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");

	}
	
	public static void bubbleSort(int arr[], int n) {
		for(int i=0 ; i<n-1 ; i++) {
			for(int j =0 ; j< n-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					//swap logic
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
		System.out.print("Sorted Array Using Bubble Sort Logic: ");
		printArray(arr);
	}
	
	public static void selectionSort(int arr[], int n) {
		for(int i=0 ; i<n-1 ; i++) {
			int minEle = i;
			for(int j = i+1 ; j<n ; j++) {
				if(arr[j] < arr[minEle]) {
					minEle = j;
				}
			}
			//swaplogic
			
			int temp = arr[i];
			arr[i] = arr[minEle];
			arr[minEle] = temp;
		}
		System.out.print("Sorted Array Using Selection Sort Logic: ");
		printArray(arr);
	}
	
	public static void insertionSort(int arr[], int n) {
		for(int i=1 ; i<n ; i++) {
			int k = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>k) {
				arr[j+1] = arr[j];
				j = j -1;
			}
			arr[j+1] = k;
		}
		System.out.print("Sorted Array Using Insertion Sort Logic: ");
		printArray(arr);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,4,5,6,7};
		System.out.print("Original Array: ");
		printArray(nums);
		System.out.println();
		int n = nums.length;
		
		bubbleSort(nums, n);
		
		System.out.println();
		
		selectionSort(nums, n);
		
		System.out.println();

		insertionSort(nums, n);
	}

}
