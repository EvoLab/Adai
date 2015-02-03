package cn.evolab.adai.ml.base;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.ml.core.ActivationFunction;


public abstract class ModelBase<VT, NT, HT> {

	// Basic Operations
	//protected NetParameter<NT> netParameter;
	protected ActivationFunction<NT, HT> activationFunction;
	protected NetParameter<NT> netParameter;
	
	public ModelBase(NetParameter<NT> netParameter, ActivationFunction<NT, HT> activationFunction) {

		// Define Activation Function
		this.activationFunction = activationFunction;
		// Define Parameters
		this.netParameter = netParameter;
		
	}
	
	public abstract double training(Vector<VT> visibleUnits);
	public abstract Vector<HT> run(Vector<VT> visibleUnits);
	public abstract void update(NetParameter<NT> netParameter);


}
