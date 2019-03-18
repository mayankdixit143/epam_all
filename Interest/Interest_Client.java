package task2;

import java.util.Scanner;

public class Interest_Client {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float principle = reader.nextInt();
		float rate = reader.nextFloat();
		int time = reader.nextInt();
		int n = reader.nextInt();
		Interest c1 = new Interest();
		double ans = c1.simple_interest(principle, rate, time);
		System.out.println(ans);
		double ans1 = c1.compound_interest(principle, rate, time, n);
		System.out.printf("%.4f\n", ans1);
		reader.close();
	}
}