

import cn.evolab.adai.ml.model.rbm.base.RBMParameter;

public abstract class RBMErrorFunction<VT, NT, HT> extends ErrorFunction<VT, NT, HT> {
	protected RBMParameter<NT> netParameter;
	public RBMErrorFunction(RBMParameter<NT> netParameter) {
		this.netParameter = netParameter;
		// TODO Auto-generated constructor stub
	}
	
}
