

import java.util.Scanner;

public class BuubleSortAlgo {
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
		int swap = 0;
		int check = 0;
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = 0; j < numbers.length - i - 1; j++) {
				if(numbers[j] > numbers[j+1]) {
					swap = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = swap;
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	// testing for temporary branch
}
