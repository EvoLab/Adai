package cn.evolab.adai.ml.model.rbm.base;

import cn.evolab.adai.core.matrix.Matrix;
import cn.evolab.adai.ml.base.NetParameter;
import cn.evolab.adai.ml.core.Bias;

public abstract class RBMParameter<NT> extends NetParameter<NT> {
	
	public RBMParameter(int visibleSize, int hiddenSize) {
		super(new Matrix<NT>(visibleSize, hiddenSize), new Bias<NT>(1, hiddenSize));
		super.addBias(new Bias<NT>(1, visibleSize));
		super.init();
	}
	public abstract RBMParameter<Double> clone();
	
}
