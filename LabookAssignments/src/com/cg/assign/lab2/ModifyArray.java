package com.cg.assign.lab2;


import java.util.*;
public class ModifyArray {
	    static int[] modifyArray(int[] array) {
	        int n = array.length;
	        Arrays.sort(array);
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < n - 1; i++) {
	            if (array[i] != array[i + 1]) {
	                res.add(array[i]);
	            }
	        }
	        res.add(array[n - 1]);
	        res.sort(Collections.reverseOrder());
	        int[] temp = new int[res.size()];
	        for (int i = 0; i < res.size(); i++) {
	            temp[i] = res.get(i);
	        }
	        return temp;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of an array : ");
	        int n = sc.nextInt(); //read size
	        
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) { // read arr elements
	            arr[i] = sc.nextInt();
	        }
	        int[] res = modifyArray(arr);
	        for (int s : res) {
	            System.out.print(s);
	        }
		

	}

}
