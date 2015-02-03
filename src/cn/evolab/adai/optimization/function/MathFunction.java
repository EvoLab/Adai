package cn.evolab.adai.optimization.function;

import cn.evolab.adai.core.matrix.VectorEdit;
import cn.evolab.adai.ec.core.FitnessFunction;
import cn.evolab.adai.ec.core.Individual;

public class MathFunction extends FitnessFunction<Boolean> {

	@Override
	public double getMinFitness(Individual<Boolean> individual) {
		double fitness = 0.0;
		fitness = VectorEdit.booleanToDouble(individual.get());
		return fitness;
	}

}
