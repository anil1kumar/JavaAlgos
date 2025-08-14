package com.insertion;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
	private static int[] numbers;
	public static void main(String[] args) {
		System.out.println("please tell for size of number list");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		numbers = new int[size];
		System.out.println("please enter " + size + " numbers");
		int i = 0;
		while(i < size) {
			numbers[i++] = sc.nextInt();
		}
		
		sortTheNumbers();
	}
	private static void sortTheNumbers() {
		int temp = 0;
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i+1; j > 0 ; j--) {
				if(numbers[j] < numbers[j-1]) {
					temp = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temp;
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	
	
}
