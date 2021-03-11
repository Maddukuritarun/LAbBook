package com.cg.assign.lab2;

import java.util.*;


public class Array {
		    static int getSecondSmallest(int[] arr) {
		        Arrays.sort(arr);

		        return arr[1];
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the size of array : ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }
		        System.out.println("The smallest Integer in the given array is "+getSecondSmallest(arr));
		    }

		}