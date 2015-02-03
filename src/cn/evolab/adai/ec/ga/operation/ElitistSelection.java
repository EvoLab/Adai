package cn.evolab.adai.ec.ga.operation;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.ga.base.Selection;

public class ElitistSelection<T> extends Selection<T> {

	public ElitistSelection(int nextPopulationSize) {
		super(nextPopulationSize);
	}

	@Override
	public Population<T> run(Population<T> population, Population<T> offspring) {
		
		population.addPopulation(offspring);
		
		for(int i=0; i<nextPopulation.size(); i++) {
			double min = Double.MAX_VALUE;
			int index = -1;
			
			for(int j=0; j<population.size(); j++) {
				if(population.getIndividual(j).getFitness()<min) {
					min = population.getIndividual(j).getFitness();
					index = j;
				}
			}
			if(index!=-1) {
				nextPopulation.addIndividual(population.getIndividual(index).clone());
				population.remove(index);
			}
		}

		return null;
	}

}
