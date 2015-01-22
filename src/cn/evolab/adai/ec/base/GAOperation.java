package cn.evolab.adai.ec.base;

import cn.evolab.adai.ec.core.Population;


public class GAOperation<T> extends EAOperation<T> {
	
	@Override
	public Population<T> update(Population<T> population, Population<T> offspring) {
		Population<T> newPopulation = new Population<T>();
		//newPopulation = this.selection.run(population, offspring);
		return newPopulation;
	}

	@Override
	public Population<T> generateOffspring(Population<T> population) {
		// TODO Auto-generated method stub
		return null;
	}

}
