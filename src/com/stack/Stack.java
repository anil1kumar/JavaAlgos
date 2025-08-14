package com.stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("for how many numbers");
		int size = sc.nextInt();
		StackClass stackClass = new StackClass();
		StackClassArrays stackClassArrays = new StackClassArrays(3);
		System.out.println("enter numbers");
		for(int i = 0; i < size; i++) {
			stackClassArrays.push(sc.next());
		}
		
//		stackClass.list.forEach(System.out::println);
//		System.out.println(stackClass.peek());
//		System.out.println(stackClass.pop());
//		System.out.println(stackClass.peek());
//		stackClass.list.forEach(System.out::println);
//		
//		stackClassArrays.printArray();
//		stackClassArrays.pop();
//		stackClassArrays.printArray();
		
	}
	
	public static class StackClassArrays{
		public String[] mArrays;
		private int i = -1;
		public StackClassArrays(int size) {
			mArrays = new String[size];
		}
		
		public void push(String data) {
			mArrays[++i] = data;
		}
		
		public String pop() {
			if(i == -1)
				return null;
			String data = mArrays[i];
			mArrays[i] = null;
			i--;
			return data;
		}
		
		public String peek() {
			if(i == -1)
				return null;
			return mArrays[i];
		}
		
		public void printArray() {
			if(i == -1)
				return;
			for(int j = 0; j <=i; j++) {
				System.out.println(mArrays[j]);
			}
		}
	}
	
	public static class StackClass {
		public ArrayList<String> list;
		
		public StackClass() {
			this.list = new ArrayList<>();
		}
		
		public void push(String data) {
			list.add(data);
		}
		
		public String pop() {
			if(list.size() == 0) {
				return null;
			}
			String data = list.get(list.size()-1);
			list.remove(list.size()-1);
			return data;
			
		}
		
		public String peek() {
			if(list.size() == 0)
				return null;
			return list.get(list.size()-1);
		}
	}
}
