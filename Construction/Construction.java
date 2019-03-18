package task2;
/**
 * This code is used for find the construction cost
 * @author Mayank_D
 */

public class Construction {
	public double home_construction(int material, double sqft) {
		/**
		 * @param material
		 * @param sqrt
		 * @return double home construction cost
		 */
		if (material == 1) {
			/**
			 * for Standard Materials
			 */
			double res = sqft * 1200;
			return res;
		} else if (material == 2) {
			/**
			 * for Above Standard Materials
			 */
			double res1 = sqft * 1500; 
			return res1;
		} else if (material == 3) {
			/**
			 * for High Standard Materials
			 */
			double res2 = sqft * 1800;
			return res2;
		} else {
			/**
			 * for High Standard Materials and fully automated house
			 */
			double res3 = sqft * 2500;
			return res3;
		}
	}
}
