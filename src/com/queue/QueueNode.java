package com.queue;

public class QueueNode {
	private Node mHead = null;
	private Node mTail = null;
	
	public void add(String data) {
		offer(data);
	}
	
	public String poll() {
		if(mHead == null)
			return null;
		String data = mHead.data;
		mHead = mHead.mNext;
		return data;
	}
	
	public String peek() {
		if(mHead == null)
			return null;
		return mHead.data;
	}
	
	public void offer(String data) {
		if(data == null)
			throw new NullPointerException();
		Node newNode = new Node(data);
		if(mHead == null) {
			mHead = newNode;
			mHead.mNext = mTail;
			return;
		}
		
		mTail.mNext = newNode;
		mTail = newNode;
	}
	
	public String remove(String data) {
		if(mHead == null)
			return null;
		Node previous = mHead;
		Node next = mHead.mNext;
		while(next != null) {
			if(next.data.contains(data)) {
				previous.mNext = next.mNext;
				return data;
			}
		}
		return null;
	}
	
	
	public static class Node {
		public Node mNext;
		public String data;
		
		public Node(String data) {
			this.data = data;
			mNext = null;
		}
	}
}
