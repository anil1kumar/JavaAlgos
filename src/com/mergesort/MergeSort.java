package com.mergesort;

import java.util.Scanner;

public class MergeSort {
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
		// TODO Auto-generated method stub
		divideArray(numbers, 0, (numbers.length - 1));
		printNumbers();
	}
	private static void printNumbers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}
	private static void divideArray(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		if(start >= end)
			return;
		
		int mid = start + (end - start)/2;
		
		System.out.println("start : " + start + " , mid : " + mid + " , end : " + end);
		divideArray(array, start, mid);
		divideArray(array, mid + 1, end);
		conquerArray(array, start, mid, end);
	}
	private static void conquerArray(int[] array, int start, int i, int end) {
		// TODO Auto-generated method stub
		System.out.println("start : " + start + " , mid : " + i + " , end : " + end);
		int[] temp = new int[end - start + 1];
		int count = 0;
		int indx1 = start;
		int indx2 = i+1;
		while(indx1 <= i && indx2 <= end) {
			System.out.println("index1 : " + indx1 + " , index2 : " + indx2);
			if(array[indx1] < array[indx2]) {
				System.out.println(array[indx1]);
				temp[count++] = array[indx1++];
			} else {
				System.out.println(array[indx2]);
				temp[count++] = array[indx2++];
			}
		}
		while(indx1 <= i) {
			temp[count++] = array[indx1++];
		}
		while(indx2 <= end) {
			temp[count++] = array[indx2++];
		}
		
		for(int j = 0, k = start; j < temp.length; j++, k++) {
			array[k] = temp[j];
		}
	
	}


}
