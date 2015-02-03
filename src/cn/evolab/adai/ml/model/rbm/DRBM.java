package cn.evolab.adai.ml.model.rbm;

import cn.evolab.adai.core.matrix.MatrixEdit;
import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.core.matrix.VectorEdit;
import cn.evolab.adai.ml.base.NetParameter;
import cn.evolab.adai.ml.core.ActivationFunction;
import cn.evolab.adai.ml.model.rbm.base.RBM;

public class DRBM extends RBM<Double, Double, Double> {

	public DRBM(DRBMParameter netParameter,
			ActivationFunction<Double, Double> activationFunction) {
		super(netParameter, activationFunction);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double training(Vector<Double> visibleUnits) {
		// TODO Auto-generated method stub
        Vector<Double> hiddenUnits = this.run(visibleUnits);
        Vector<Double> newVisibleUnits = new Vector<Double>(visibleUnits.size());
        Vector<Double> neuron = new Vector<Double>(visibleUnits.size());
        double error = 0.0;
        
		try {

			neuron = MatrixEdit.doubleMatrixMultiplyDoubleVector(netParameter.getWeight().transpose(), hiddenUnits);
			neuron = VectorEdit.doubleVectorMinusDoubleVector(neuron,
                    VectorEdit.doubleVectorMultiplyDoubleValue( netParameter.getBias(1).getVector(), netParameter.getBias(1).getBiasValue() ));	
			newVisibleUnits = activationFunction.run(neuron);
			error = VectorEdit.doubleSTDEV(visibleUnits, newVisibleUnits);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return error;
	}

	@Override
	public Vector<Double> run(Vector<Double> visibleUnits) {
		// TODO Auto-generated method stub
		Vector<Double> neuron = new Vector<Double>(netParameter.getWeight().rowSize());
        Vector<Double> output = new Vector<Double>(netParameter.getWeight().columnSize());

		try {
			
			neuron = MatrixEdit.doubleMatrixMultiplyDoubleVector(netParameter.getWeight(), visibleUnits );
			neuron = VectorEdit.doubleVectorMinusDoubleVector(neuron,
                     VectorEdit.doubleVectorMultiplyDoubleValue( netParameter.getBias(0).getVector(), netParameter.getBias(0).getBiasValue() ));
			output = activationFunction.run(neuron);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return output;
	}

	@Override
	public void update(NetParameter<Double> netParameter) {
		this.netParameter.update(netParameter);
	}

}
