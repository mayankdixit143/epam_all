package task2;

public class Interest {
	public double simple_interest(float principle, float rate, int time) {
		double output = (principle * rate * time) / 100;
		return output;
	}

	public double compound_interest(float principle, float rate, int time, int n) {
		double output = principle * (Math.pow((1 + rate / n), n * time));
		return output;
	}
}
