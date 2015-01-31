package cn.evolab.adai.ml.model.rbm;

import cn.evolab.adai.core.matrix.Matrix;
import cn.evolab.adai.core.matrix.MatrixEdit;
import cn.evolab.adai.core.matrix.VectorEdit;
import cn.evolab.adai.ml.core.Bias;
import cn.evolab.adai.ml.model.rbm.base.RBMParameter;

public class DRBMParameter extends RBMParameter<Double> {

	public DRBMParameter(int visibleSize, int hiddenSize) {
		super(visibleSize, hiddenSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Matrix<Double> weightInit(int visibleSize, int hiddenSize) {
		return MatrixEdit.doubleRandom(visibleSize, hiddenSize);
	}

	@Override
	public Bias<Double> biasInit(int biasVectorSize) {
		Bias<Double> bias = new Bias<Double>();
		bias.setVector(VectorEdit.doubleRandom(biasVectorSize));
		return bias;
	}

	@Override
	public RBMParameter<Double> clone() {
		DRBMParameter clone = new DRBMParameter(this.getWeight().rowSize(), this.getWeight().columnSize());
		clone.update(this.weightList, this.biasList);
		return clone;
	}

}
