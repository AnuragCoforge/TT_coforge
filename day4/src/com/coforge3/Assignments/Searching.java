package com.coforge3.Assignments;

public class Searching {
	public static int BinarySearch(int arr[], int k) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low<high) {
			int mid = (low + high)- low /2;
			
			if(arr[mid] == k) return mid;
			
			else if(arr[mid] > k) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 5;
		int arr[] = {1, 3, 5, 8, 9};
		int index = BinarySearch(arr, target);
		System.out.println("The element is present at index : "+ index);
	}

}
