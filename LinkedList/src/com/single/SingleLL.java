package com.single;

class Node{
	int data;
	Node next;

	public Node(int data) { 
		this.data = data;
		this.next = null;
	}
}
public class SingleLL {
	Node head;
	
	public void insert(int val) {
		Node newNode = new Node(val);
		
		if (head == null) {
			head = newNode;
			return;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp =temp.next;
			}
			temp.next = newNode;
		}
	}
	public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
	public static void main(String[] args) {
		
		SingleLL list = new SingleLL();
		list.insert(100);
		
		list.insert(101);
		
		list.display();
		
		list.reverseList();
		list.display();
		
	}
	
	public void reverseList() {
        if (head == null || head.next == null) return;
        Node curr = head, nextNode = head, prev =null;
        nextNode = nextNode.next;
        while ( curr.next != null){

            curr.next = prev;
            prev = curr;
            curr = nextNode;
            nextNode = nextNode.next;
        }
        curr.next = prev;
        head = curr;
//        return curr;
    }
}
