

import cn.evolab.adai.ml.base.Parameter;
import cn.evolab.adai.ml.base.TrainError;
import cn.evolab.adai.ml.core.Units;
import cn.evolab.adai.ml.model.rbm.DRBMParameter;
import cn.evolab.adai.ml.model.rbm.base.RBMParameter;

public class DRBMNet extends RBMNet<Double, Double, Double> {

	public DRBMNet(DRBMParameter netParameter) {
		super(netParameter);
	}

	@Override
	public TrainError training(Parameter parameter, DRBMErrorFunction errorFunction,
			Units<Double> visibleUnits, Units<Double> hiddenUnits) {
		// TODO Auto-generated method stub
		return errorFunction.run();
		return null;
	}

	@Override
	public Units<Double> run(Parameter parameter, Units<Double> visibleUnits) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	@Override
	public TrainError training(DRBMParameter parameter, DRBMErrorFunction errorFunction, Units<Double> visibleUnits) {
		// TODO Auto-generated method stub
		return errorFunction.run();
	}

	@Override
	public Units<Double> run(Parameter parameter, Units<Double> visibleUnits) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
	
	
	

}
