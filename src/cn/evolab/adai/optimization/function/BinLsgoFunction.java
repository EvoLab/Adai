package cn.evolab.adai.optimization.function;

import cn.evolab.adai.ec.core.Individual;
import cn.evolab.adai.optimization.function.cec.Function;

public class BinLsgoFunction extends LsgoFunction<Boolean> {

	public BinLsgoFunction(Function f) {
		super(f);
	}

	@Override
	public double getMinFitness(Individual<Boolean> individual) {
		return super.binCompute(individual.get());
	}

}
