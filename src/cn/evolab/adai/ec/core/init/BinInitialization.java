package cn.evolab.adai.ec.core.init;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.core.matrix.VectorEdit;
import cn.evolab.adai.ec.core.Individual;

public class BinInitialization extends Initialization<Boolean> {
	@Override
	public void individualInit(Individual<Boolean> individual) {
		Vector<Boolean> vector = new Vector<Boolean>(individual.get().size());
		VectorEdit.booleanRandom(vector);
		individual.set(vector);
	}
}
