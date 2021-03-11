package com.cg.assign.lab2;

import java.util.*;

public class SortString {
		    static String[] sortStrings(String[] strs) {
		        Arrays.sort(strs);
		        int size = strs.length;
		        String[] ser = new String[size];
		        if (size % 2 == 1) {
		            for (int i = 0; i < (size / 2) + 1; i++) {
		                ser[i] = strs[i].toUpperCase();
		            }
		            for (int i = (size / 2) + 1; i < size; i++) {
		                ser[i] = strs[i].toLowerCase();
		            }
		        } else {
		            for (int i = 0; i < (size / 2); i++) {
		                ser[i] = strs[i].toUpperCase();
		            }
		            for (int i = (size / 2); i < size; i++) {
		                ser[i] = strs[i].toLowerCase();
		            }
		        }

		        return ser;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt(); //read no of strings
		        String[] strs = new String[n+1];
		        for (int i = 0; i < strs.length; i++) {
		            strs[i] = sc.nextLine();
		        }
		        String[] res = sortStrings(strs);
		        for (String s : res) {
		            System.out.println("The sorted String is " + s);
		        }
		    }

		}