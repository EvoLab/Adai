package cn.evolab.adai.ec.ga.operation;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.ga.base.Crossover;
import cn.evolab.adai.tools.Print;

public class OneCutCrossover<T> extends Crossover<T> {

	public OneCutCrossover(double crossoverRate) {
		super(crossoverRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Population<T> run(Population<T> population) {
		Population<T> offspring = new Population<T>();
		offspring = super.selectForCrossover(population);
		
		Print.population(offspring);
		
		return null;
	}

}
