

import cn.evolab.adai.ml.model.rbm.base.RBMTrainError;

public class DRBMTrainError extends RBMTrainError {
	double error;

	public double get() {
		return error;
	}

	public void set(double error) {
		this.error = error;
	}
	
}
