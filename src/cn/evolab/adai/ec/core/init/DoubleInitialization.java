package cn.evolab.adai.ec.core.init;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.core.matrix.VectorEdit;
import cn.evolab.adai.ec.core.Individual;

public class DoubleInitialization extends Initialization<Double> {
	
	double range;
	public DoubleInitialization(double range) {
		super();
		this.range = range;
	}
	
	@Override
	public void individualInit(Individual<Double> individual) {
		Vector<Double> vector = new Vector<Double>(individual.get().size());
		VectorEdit.doubleRandom(vector, range);
		individual.set(vector);
	}
}
