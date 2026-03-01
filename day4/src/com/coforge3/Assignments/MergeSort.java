package com.coforge3.Assignments;
import java.util.*;
public class MergeSort {
	public static void ms(int arr[], int low , int high) {
		if(low == high) return ;
		
		int mid = (low + high)/2;
		ms(arr, low, mid);
		ms(arr, mid + 1, high);
		merge(arr, low, mid, high);
		
	}
	public static void merge(int arr[], int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		// [low...mid]
		// [mid+1...high]
		int left = low;
		int right = mid+1;
		
		while(left<=mid && right <=high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		//if one of the left or right array are completed then
		//if still elements are left in left array
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		//if still elements are left in right array
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		for(int i = low ; i<=high ; i++) {
			arr[i] = temp.get(i - low);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 2, 4, 1, 3};
		int n = arr.length;
		System.out.print("Array before sort: ");
		for(int i=0 ; i<n ; i++) {
			System.out.println(arr[i]);
		}
		ms(arr, 0, n-1);
		
		System.out.print("Array after sort: ");
		for(int i=0 ; i<n ; i++) {
			System.out.println(arr[i]);
		}
	}

}
