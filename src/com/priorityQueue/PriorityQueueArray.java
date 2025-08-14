package com.priorityQueue;

import java.util.ArrayList;
import java.util.Scanner;

public class PriorityQueueArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter for how many numbers");
		
		int size = sc.nextInt();
		PriorityArray priorityArray = new PriorityArray();
		System.out.println("enter numbers");
		for(int i = 0; i < size; i++) {
			priorityArray.add(sc.nextInt());
		}
		priorityArray.mList.forEach(System.out::println);
		
	}
	
	public static class PriorityArray{
		ArrayList<Integer> mList = new ArrayList<>();
		
		public void add(Integer data) {
			mList.add(data);
			
			int childPos = mList.size()-1;
			int parPos = (childPos - 1)/2;
			
			while(mList.get(childPos) < mList.get(parPos)) {
				System.out.println(mList.get(childPos) + " < "+ mList.get(parPos));
				int temp = mList.get(parPos);
				mList.set(parPos, mList.get(childPos));
				mList.set(childPos, temp);
				
				childPos = parPos;
				 parPos = (childPos - 1)/2;
			}
		}
		
		public int remove() {
			if(mList.size() == 0)
				return -1;
			if(mList.size() == 1) 
				 return mList.remove(0);
			int size = mList.size() - 1;
			int temp = mList.get(0);
			mList.set(0, mList.get(size));
			mList.set(size, temp);
			temp = mList.remove(size);
			
			heapify(0);
			return temp;
			
		}

		private void heapify(int parPos) {
			int leftChild = 2*parPos + 1;
			int rightChild = 2*parPos + 2;
			int i = parPos;
			if(leftChild < mList.size() && mList.get(parPos) > mList.get(leftChild)) {
				parPos = leftChild;
			}
			if(rightChild < mList.size() && mList.get(parPos) > mList.get(rightChild)) {
				parPos = rightChild;
			}
			if(parPos != i) {
				int temp = mList.get(parPos);
				mList.set(parPos, mList.get(i));
				mList.set(i, temp);
				heapify(parPos);
			}
			
		}
	}
}
