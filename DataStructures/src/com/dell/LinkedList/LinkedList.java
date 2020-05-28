package com.dell.LinkedList;

import com.dell.nodes.*;
	
public class LinkedList<T> {
	LinkedListNode<T> head;
	LinkedListNode<T> last;
	private int size;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		LinkedListNode<T> temp = head;
		sb.append("[");
		while(temp!=null) {
			sb.append(temp.getData());
			if(temp.getNext()!=null)
				sb.append(",");
			temp = temp.getNext();
		}
		sb.append("]");
		return sb.toString();
	}

	public int getSize() {
		return size;
	}

	public void add(T data) {
		LinkedListNode<T> node = new LinkedListNode<T>(data);
		if(null==head) {
			head = node;
			last = node;
		}else {
			last.setNext(node);
			last = node;
		}
		size++;
 	}
	public T getIndex(int getIndex) {
		LinkedListNode<T> node = this.head;
		if (getIndex > size-1 || getIndex < 0) {
			throw new IllegalArgumentException("index is not valid");
		}else {
			
			int index = 0;
			while(!(node == null || index == getIndex)) {
				if (index == getIndex)
					break;
				node = node.getNext();
				index++;
			}
		}
		return node.getData();
	}
	
	public void deleteIndex(int deleIndex) {
		
	}
}
class TestLinkedList{
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		for(int i = 1;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		System.out.println(l.getIndex(l.getSize()));
	}
}

