package task2;

public class Construction {
	public double home_construction(int material, double sqft) {
		if (material == 1) {
			double res = sqft * 1200; // for Standard Materials
			return res;
		} else if (material == 2) {
			double res1 = sqft * 1500; // for Above Standard Materials
			return res1;
		} else if (material == 3) {
			double res2 = sqft * 1800; // for High Standard Materials
			return res2;
		} else {
			double res3 = sqft * 2500; // for High Standard Materials and fully automated house
			return res3;
		}
	}
}
