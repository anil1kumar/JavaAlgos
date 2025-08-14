package com.linklist;

import java.util.Scanner;

public class CustomLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("for how many number to sort");
		int size = sc.nextInt();
		
		System.out.println("enter numbers");
		LinkList<String> linkList = new LinkList<>();
		for(int i = 0; i < size; i++) {
			linkList.add(sc.next());
		}
		linkList.printAll();
		linkList.reverseList();
		linkList.printAll();
		linkList.reverseUsingRecusive(linkList.head);
		linkList.printAll();
	}
	
	static class LinkList<T> {
		Node<T> head = null;
		Node<T> tail = null;
		public LinkList() {
			// TODO Auto-generated constructor stub
		}
		public void add(T t) {
			Node<T> newNode = new Node<T>(t);
			if(head == null) {
				head = newNode;
				tail = head;
			} else {
				tail.next = newNode;
					tail = newNode;
				} 
		}
		
		public void printAll() {
			if(head == null)
				return;
			Node<T> node = head;
			while(node != null) {
				System.out.println("data : " + node.data );
				node = node.next;
			}
		}
		
		public void reverseList() {
			if(head == null)
				return;
			Node<T> prevNode = head;
			Node<T> nextNode = head.next;
			Node<T> temp = null;
			System.out.println("reverse list");
			while(nextNode != null) {
				System.out.println("reverse while : " + nextNode.data);
				temp = nextNode.next;
				  nextNode.next = prevNode; 
				  prevNode = nextNode; 
				  nextNode = temp;
			}
			head.next = null;
			head = prevNode;
		}
		
		public Node<T> reverseUsingRecusive(Node<T> next) {
			if(next.next == null) {
				head.next = null;
				head = next;
				return head;
			}
				
			Node<T> newNode = reverseUsingRecusive(next.next);
			newNode.next = next;
			return next;
		}
			
	}
	
	static class Node<T> {
		Node<T> next;
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> address) {
			this.next = address;
		}
		T data;
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		
		public Node(T data) {
			this.data = data;
			this.next = null;
			
		}
	}
}
