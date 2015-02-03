package cn.evolab.adai.ec.ga.operation;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.ga.base.Crossover;

public class TwoCutCrossover<T> extends Crossover<T> {

	public TwoCutCrossover(double crossoverRate) {
		super(crossoverRate);
	}

	@Override
	public Population<T> run(Population<T> population) {
		return null;
	}

}
