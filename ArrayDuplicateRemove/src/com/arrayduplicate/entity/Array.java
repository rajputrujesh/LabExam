package com.arrayduplicate.entity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array {
    private int[] arr;
    private int size;

    public Array(int size) {
        this.size = size;
        this.arr = new int[size];
    }
	
	 public void readElements() {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = input.nextInt();
	        }
	    }
	 public void printElements() {
	        System.out.print("Original Array: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	 public int removeDuplicates() {
	        Set<Integer> uniqueElements = new HashSet<Integer>();
	        for (int i = 0; i < size; i++) {
	            uniqueElements.add(arr[i]);
	        }
	        int index = 0;
	        for (Integer element : uniqueElements) {
	            arr[index++] = element;
	        }

	        System.out.print("New Array: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        return index;
	    }
}
