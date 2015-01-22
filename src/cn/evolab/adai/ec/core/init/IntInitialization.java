package cn.evolab.adai.ec.core.init;

import cn.evolab.adai.core.matrix.Vector;
import cn.evolab.adai.core.matrix.VectorEdit;
import cn.evolab.adai.ec.core.Individual;

public class IntInitialization extends Initialization<Integer> {
	
	private int range;
	public IntInitialization(int range) {
		super();
		this.range = range;
	}
	@Override
	public void individualInit(Individual<Integer> individual) {
		Vector<Integer> vector = new Vector<Integer>(individual.get().size());
		VectorEdit.integerRandom(vector, range);
		individual.set(vector);
	}
	

}
