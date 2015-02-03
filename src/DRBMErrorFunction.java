

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.ml.core.ActivationFunction;
import cn.evolab.adai.ml.model.rbm.DRBMParameter;

public class DRBMErrorFunction extends RBMErrorFunction<Double, Double, Double> {

	public DRBMErrorFunction(DRBMParameter netParameter) {
		super(netParameter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double training(
			ActivationFunction<Double, Double> activationFunction,
			Vector<Double> visibleUnits) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector<Double> run(
			ActivationFunction<Double, Double> activationFunction,
			Vector<Double> visibleUnits) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
