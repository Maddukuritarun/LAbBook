package com.cg.assign.lab2;


import java.util.*;

public class GetSorted {
	    static int[] getSorted(int[] arr) {

	        Arrays.sort(arr);
	        int[] res = new int[arr.length];
	        for (int i = arr.length - 1; i >= 0; i--) {
	            res[arr.length - 1 - i] = arr[i];
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of array : ");
	        int n = sc.nextInt(); // read size
	        int[] arr = new int[n];
	        //read array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int[] res = getSorted(arr);
	        for(int i:res) {
	            System.out.print(i+ " ");
	        }

	}

}
