package data_structure;
/**
 * This code is from https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
 * 
 * @author Mayank_D
 */

import java.util.Scanner;
import java.util.Stack;

public class QusingS {
	public static void main(String[] args) {
		queue1<Integer> queue = new queue1<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) {
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) {
				queue.dequeue();
			} else if (operation == 3) {
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}

	public static class queue1<Integer> {
		private Stack<Integer> s1 = new Stack<>();
		private Stack<Integer> s2 = new Stack<>();

		public void enqueue(Integer num) {
			s1.push(num);
		}

		public Integer dequeue() {
			if (size() == 0) {
				return null;
			}
			if (s2.isEmpty()) {
				transfer();
			}
			return s2.pop();
		}

		public Integer peek() {
			if (size() == 0) {
				return null;
			}
			if (s2.isEmpty()) {
				transfer();
			}
			return s2.peek();
		}

		private void transfer() {
			if (s2.isEmpty()) {
				while (!s1.isEmpty()) {
					s2.push(s1.pop());
				}
			}
		}

		public int size() {
			return s1.size() + s2.size();
		}
	}
}
