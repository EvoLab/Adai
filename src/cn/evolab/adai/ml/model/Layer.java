package cn.evolab.adai.ml.model;

import cn.evolab.adai.core.matrix.*;

public abstract class Layer {
	public void Input(Vector<Double> input) {
		
	}
	public void Input() {
		
	}
	public Vector<Double> Export(Vector<Double> input) {
		Vector<Double> output = new Vector<Double>();
		return output;
	}
	
	//Sigmoid Function
	public double Sigmoid(double x) {
		double y=0.0;
		
		return y;
	}

}
