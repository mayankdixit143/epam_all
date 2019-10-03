package task2;
/**
 * This program finds addition multiplication 
 * and division of any two number
 * @author Mayank_D
 *
 */
public class calculator {
	public double calculation(char ch, float num1, float num2) {
		double output = 0;
		switch (ch) {
		/**
		 * find the addition of two number
		 * @param num1
		 * @param num2
		 * @ return double addition of two number 
		 */
		case '+':
			output = num1 + num2;
			break;
			/**
			 * find the multiplication of two number
			 * @param num1
			 * @param num2
			 * @ return double multiplication of two number 
			 */

		case '*':
			output = num1 * num2;
			break;
			
			/**
			 * find the division of two number
			 * @param num1
			 * @param num2
			 * @ return double division of two number 
			 */

		case '/':
			output = num1 / num2;
			break;

			/**
			 * find the modulo of two number
			 * @param num1
			 * @param num2
			 * @ return double modulo of two number 
			 */


		case '%':
			output=num1%num2;
			break;
		}

		return output;
	}
}
