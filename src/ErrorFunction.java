

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.ml.base.NetParameter;
import cn.evolab.adai.ml.core.ActivationFunction;

public abstract class ErrorFunction<VT, NT, HT> {
	public abstract double training(ActivationFunction<NT, HT> activationFunction, NetParameter<NT> netParameter, Vector<VT> visibleUnits);
	public abstract Vector<HT> run(ActivationFunction<NT, HT> activationFunction, NetParameter<NT> netParameter, Vector<VT> visibleUnits);
	

}
