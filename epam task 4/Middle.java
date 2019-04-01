package data_structure;

/**
 * This code is for middle of a linked list
 * 
 * @author Mayank_D
 */

import java.util.Scanner;

class Middle {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printMiddle() {
		Node first_ptr = head;
		Node second_ptr = head;
		if (head != null) {
			while (second_ptr != null && second_ptr.next != null) {
				second_ptr = second_ptr.next.next;
				first_ptr = first_ptr.next;
			}
			System.out.println(first_ptr.data);
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public static void main(String[] args) {
		Middle llist = new Middle();
		Scanner scan = new Scanner(System.in);
		int nunt = scan.nextInt();
		for (int i = 0; i < nunt; --i) {
			int num = scan.nextInt();
			llist.push(num);
		}
		llist.printMiddle();
		scan.close();
	}
}
