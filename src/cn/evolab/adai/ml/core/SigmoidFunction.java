package cn.evolab.adai.ml.core;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.math.Sigmoid;

public class SigmoidFunction extends ActivationFunction<Double, Double> {

	@Override
	public Vector<Double> run(Vector<Double> neuron) {
		Vector<Double> output = new Vector<Double>(neuron.size());
		for(int i=0; i<neuron.size(); i++) {
			output.set(i, Sigmoid.run(neuron.get(i)));
		}
		return output;
	}
}
