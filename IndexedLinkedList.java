package program6;

import java.util.ArrayList;

public class IndexedLinkedList<T> {
	private int size;
	private Node head;
	

	private class Node {
		private T value;
		private Node next;
		

		public Node(T value) {
			// node constructor 
			this.next = null; 
			this.value = value;
		}
		public String toString() {
			return "Node: " + value;
		}
	}
	public IndexedLinkedList() {
		// this is the constructor
		this.head = null;
		this.size = 0;
	}
	public void insertBeforeIndex(T value, int index)  throws IndexOutOfBoundsException{
		if (index < 0 || index > size()) { throw new IndexOutOfBoundsException("Index Error " + index);} 
		Node newNode = new Node(value);
		size++;
		if (head == null) {
			head = newNode;
			
		} else {
			if (index == 0) {
				newNode.next = head;
				head = newNode;
			}
			else if(index == size)
			{
				Node c = head;
				int i = 0;
				while (i <= index) {
					if (i == index) {
						c.next = newNode;
						return;
					}
					c = c.next;
					i++;
				}
			}
			else {
				Node c = head;
				Node p = null;
				int i = 0; 
				while (i <= index) {
					if (i == index) {
						newNode.next = c;
						p.next = newNode;
						return;
					} 
					p = c;
					c = c.next;
					i++;
				}

			}
		}
	}

	public T getValueAtIndex(int index)  throws IndexOutOfBoundsException{
		if (index < 0 || index >= size()) { throw new IndexOutOfBoundsException("Index Error");} 
		Node curr = head;	
		for (int i = 0; i <=index;i++) {
			if (i == index) { return curr.value;}
			curr = curr.next;
		}
		return null;
	}

	public int getIndexOfValue (T value) {
		Node curr = head;	
		for (int i = 0; i < size();i++) {
			if (value.equals(curr.value)) { return i;}
			curr = curr.next;
		}
		return -1;
	}
	public int countValue(T value) {
		Node curr = head;	
		int count = 0;
		for (int i = 0; i < size();i++) {
			if (value.equals(curr.value)) { count++;}
			curr = curr.next;
		}
		return count;
	
	}

	public Iterable<T> values() {
		ArrayList<T> x = new ArrayList<T>();
		//create a list and add the values in the loop to that arraylist
		for (Node temp = head; temp!=null; temp=temp.next) {
			x.add(temp.value);
		}
		return x;

	}
	public int size() {
		return size;
	}
}
