package task2;

import java.util.Scanner;

public class Construction_Client {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int material = reader.nextInt();
		double sqrt = reader.nextInt();
		Construction c1 = new Construction();
		double ans = c1.home_construction(material, sqrt);
		System.out.println(ans);
		reader.close();
	}
}
