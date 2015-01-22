package cn.evolab.adai.ec.core.operation;

import cn.evolab.adai.ec.core.Population;

public class BinCrossover extends Crossover<Boolean> {

	public Population<Boolean> oneCutPoint(Population<Boolean> population) {
		Population<Boolean> offspring = new Population<Boolean>();
		
		return offspring;

	}
	@Override
	public Population<Boolean> run(Population<Boolean> population) {
		return oneCutPoint(population);
	}

}
