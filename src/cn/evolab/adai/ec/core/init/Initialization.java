package cn.evolab.adai.ec.core.init;

import cn.evolab.adai.ec.core.Individual;
import cn.evolab.adai.ec.core.Population;

public abstract class Initialization<T> {
	
	public void populationInit(Population<T> population) {
		for(int i=0; i<population.size(); i++) {
			this.individualInit(population.getIndividual(i));
		}
	}
	public abstract void individualInit(Individual<T> individual);

}
