package com.arrayduplicate.main;

import java.util.Scanner;

import com.arrayduplicate.entity.Array;

public class ArrayMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        Array array = new Array(size);
        array.readElements();
        array.printElements();
        int newLength = array.removeDuplicates();
        System.out.println("New Length of Array: " + newLength);
    }
	}


