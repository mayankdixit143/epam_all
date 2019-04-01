package data_structure;

/**
 * This code from https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
 * 
 * @author Mayank_D
 */

import java.io.*;
import java.util.*;

public class cycle {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	public static boolean HasCycle(SinglyLinkedListNode head) {
		if (head == null) {
			return false;
		}
		SinglyLinkedListNode first_pointer = head;
		SinglyLinkedListNode second_pointer = head;

		while (first_pointer != null && first_pointer.next != null) {
			first_pointer = first_pointer.next;
			second_pointer = second_pointer.next.next;

			if (second_pointer == null || first_pointer == null) {
				return false;
			}
			if (second_pointer == first_pointer) {
				return true;
			}
		}
		return false;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int tests = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int testsItr = 0; testsItr < tests; testsItr++) {
			int index = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			SinglyLinkedList llist = new SinglyLinkedList();

			int llistCount = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < llistCount; i++) {
				int llistItem = scanner.nextInt();
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				llist.insertNode(llistItem);
			}

			SinglyLinkedListNode extra = new SinglyLinkedListNode(-1);
			SinglyLinkedListNode temp = llist.head;

			for (int i = 0; i < llistCount; i++) {
				if (i == index) {
					extra = temp;
				}

				if (i != llistCount - 1) {
					temp = temp.next;
				}
			}

			temp.next = extra;

			boolean result = HasCycle(llist.head);

			bufferedWriter.write(String.valueOf(result ? 1 : 0));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
