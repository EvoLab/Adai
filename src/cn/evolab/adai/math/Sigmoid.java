package cn.evolab.adai.math;

public class Sigmoid {
	public static double run(double val) {
        return 1d / (1d + Math.exp(-val));
	}
	
}
