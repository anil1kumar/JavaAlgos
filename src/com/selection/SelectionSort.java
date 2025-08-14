package com.selection;

import java.util.Scanner;

public class SelectionSort {
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
		int swap = 0;
		for(int i = 0; i < numbers.length-1 ; i++) {
			temp = i;
			for(int j = i+1; j < numbers.length; j++) {
				if(numbers[temp] > numbers[j]) {
					temp = j;
				}
			}
			swap = numbers[temp];
			numbers[temp] = numbers[i];
			numbers[i] = swap;
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
