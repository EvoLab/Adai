package cn.evolab.adai.ml.function;

public class Activation {
	public static double Sigmoid(double x) {
		return 1.0/(1.0+Math.exp(-x));
	}
}
