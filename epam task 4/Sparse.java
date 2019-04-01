package data_structure;
/**
 * This code from https://www.hackerrank.com/challenges/sparse-arrays/problem
 * 
 * @author Mayank_D
 */

import java.util.*;

public class Sparse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(scan.next());
		}
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int count = 0;
			String s = scan.next();
			for (String str : list) {
				if (str.equals(s))
					count++;
			}
			System.out.println(count);
		}
		scan.close();
	}
}