package task2;

public class calculator{	
	public float calculation(char ch ,float num1,float num2){
		float output = 0;
		switch (ch) {
			case '+':
            	output = num1 + num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;
		}
		return output;
	}
}
