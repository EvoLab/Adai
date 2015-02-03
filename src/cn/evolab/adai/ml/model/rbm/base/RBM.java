package cn.evolab.adai.ml.model.rbm.base;

import cn.evolab.adai.ml.base.ModelBase;
import cn.evolab.adai.ml.core.ActivationFunction;

public abstract class RBM<VT, NT, HT> extends ModelBase<VT, NT, HT>{

	public RBM(RBMParameter<NT> netParameter, ActivationFunction<NT, HT> activationFunction) {
		super(netParameter, activationFunction);
		// TODO Auto-generated constructor stub
	}
	
}
