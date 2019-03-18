package task2;

import java.util.*;
public class Calculator_Client{
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	char c = reader.next().charAt(0);
	float num1=reader.nextInt();
	float num2=reader.nextInt();
	calculator c1=new calculator();
	float ans =c1.calculation(c , num1, num2);
	System.out.println(ans);
	reader.close();
	}
}
