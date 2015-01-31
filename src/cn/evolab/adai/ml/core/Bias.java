package cn.evolab.adai.ml.core;

import cn.evolab.adai.core.matrix.Vector;

public class Bias<T> {
	private double value;
	private Vector<T> vector;
	public Bias() {
		this.value = 1;
		this.setVector(new Vector<T>());
	}
	public Bias(double value, int vectorSize) {
		this.value = value;
		this.setVector(new Vector<T>(vectorSize));
	}
	
	public double getBiasValue() {
		return value;
	}
	public void setBiasValue(double value) {
		this.value = value;
	}

	public Vector<T> getVector() {
		return vector;
	}

	public void setVector(Vector<T> vector) {
		this.vector = vector;
	}
	
}
