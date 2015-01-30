package cn.evolab.adai.ml.core;

import cn.evolab.adai.core.matrix.Matrix;

public class Weight<T> {
	protected Matrix<T> weight;
	public Weight() {
		weight = new Matrix<T>();
	}
	public Weight(int visibleSize, int hiddenSize) {
		weight = new Matrix<T>(visibleSize, hiddenSize);
	}
	public void setWeight(Matrix<T> weight) {
		this.weight = weight.clone();
	}
	public Matrix<T> getWeight() {
		return this.weight;
	}

}
