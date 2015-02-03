

import cn.evolab.adai.ml.base.NetBase;
import cn.evolab.adai.ml.model.rbm.base.RBMParameter;

public abstract class RBMNet<VT, NT, HT> extends NetBase<VT, NT, HT> {

	protected RBMParameter<NT> netParameter;
	public RBMNet(RBMParameter<NT> netParameter) {
		super(netParameter);
	}

}
