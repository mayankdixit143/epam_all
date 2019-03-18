package task2;
/**
 * This program is to find the simple interest
 * and compound interest
 * @author Mayank_D
 *
 */
public class Interest {
	public double simple_interest(float principle, float rate, int time) {
		/**
		 * find the simple interest
		 *@param principle
		 *@param rate
		 *@param time
		 *@return double simple interest
		 */
		double output = (principle * rate * time) / 100;
		return output;
	}

	public double compound_interest(float principle, float rate, int time, int n) {
		/**
		 * find the compound interest
		 *@param principle
		 *@param rate
		 *@param time
		 *@param n
		 *@return double compound interest
		 */
		double output = principle * (Math.pow((1 + rate / n), n * time));
		return output;
	}
}
