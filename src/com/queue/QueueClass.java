package com.queue;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.loading.MLet;

public class QueueClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("for how many numbers");
		int size = sc.nextInt();
		
		System.out.println("enter numbers/data");
		
		LinearQueue linearQueue = new LinearQueue(size);
		for(int i = 0; i < size; i++){
			linearQueue.add(sc.next());
		}
		printAll(linearQueue.mList);
		System.out.println("removed : " + linearQueue.remove());
		linearQueue.remove();
		printAll(linearQueue.mList);
		System.out.println("removed : " + linearQueue.remove());
		printAll(linearQueue.mList);
		System.out.println("added : " + "first");
		linearQueue.add("first");
		printAll(linearQueue.mList);
		System.out.println("poll : " + linearQueue.peek());
		
//		checkArray();
	}
	
	public static void checkArray() {
		String[] temp = new String[3];
		temp[0] = "hello";
		temp[1] = "worlde";
		temp[2] = "welcome";
		
		String[] array = new String[2];
//		array[0] = "first";
//		array[1] = "second";
//		array[2] = "third";
		
		temp = array;
		
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
	}
	
	private static void printAll(String[] mList) {
		// TODO Auto-generated method stub
		for(int i = 0; i < mList.length; i++) {
			if(mList[i] != null)
				System.out.println(mList[i]);
		}
	}

	public static class LinearQueue {
		public String[] mList;
		private int mFront = -1, mRear = -1;
		private int size;
		public LinearQueue(int size) {
			mList = new String[size];
			this.size = size;
		}
		
		
		public void add(String data) {
			if(mFront == -1) {
				mFront++;
			}
			mList[++mRear] = data;
		}
		
		public String remove() {
			if(mList.length == 0)
				return null;
			 String data = mList[0];
			 if(mList.length < 2) {
				 System.out.println("empty");
				 String[] temp = new String[size];
				 mList = temp;
				 mFront = -1;
				 mRear = -1;
			 } else {
			 String[] temp = new String[mList.length - 1];
			 System.out.println("len : " + (mList.length - 1));
			 for(int i = 0; i < mList.length-1; i++) {
				 temp[i] = mList[i+1];
			 }
			 mRear = (mList.length - 1);
			 mList = temp;
			 }
			return data;
		}
		
		public String poll() {
			if(mList.length == 0)
				return null;
			 String data = mList[0];
			 if(mList.length < 2) {
				 System.out.println("empty");
				 String[] temp = new String[size];
				 mList = temp;
				 mFront = -1;
				 mRear = -1;
			 } else {
			 String[] temp = new String[mList.length - 1];
			 System.out.println("len : " + (mList.length - 1));
			 for(int i = 0; i < mList.length-1; i++) {
				 temp[i] = mList[i+1];
			 }
			 mRear = (mList.length - 1);
			 mList = temp;
			 }
			return data;
		}
		
		public String peek() {
			if(mList.length == 0)
				return null;
			return mList[mRear];
		}
		
		
	}
	
	public static class CircularQueue {
		
	}
}
