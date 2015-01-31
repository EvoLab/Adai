package cn.evolab.adai.ml.core;

import cn.evolab.adai.core.matrix.Vector;

public abstract class ActivationFunction<NT, HT> {
	
	public abstract Vector<HT> run(Vector<NT> neuron);

}
