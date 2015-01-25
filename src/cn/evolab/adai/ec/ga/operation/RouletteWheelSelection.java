package cn.evolab.adai.ec.ga.operation;

import java.util.Random;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.ga.base.Selection;

public class RouletteWheelSelection<T> extends Selection<T> {
	public RouletteWheelSelection(int nextPopulationSize) {
		super(nextPopulationSize);
	}

	@Override
	public Population<T> run(Population<T> population, Population<T> offspring) {
		
		// TODO Auto-generated method stub
		population.addPopulation(offspring);

		double F=0;
		double p[] = new double[population.size()];
		double q[] = new double[population.size()];
		Random rd = new Random();
		
		
		for(int i=0; i<population.size(); i++) {
			F+=population.getIndividual(i).getFitness();
		}
		for(int i=0; i<population.size(); i++) {
			p[i]=population.getIndividual(i).getFitness()/F;
		}
		q[0]=p[0];
		for(int i=1; i<population.size(); i++) {
			q[i]=q[i-1]+p[i];
		}
		
		for(int i=0; i<nextPopulation.size(); i++) {
			double r = rd.nextDouble();
			if(r<q[0]) {
				nextPopulation.setIndividual(i, population.getIndividual(0));
			} else {
				for(int j=1; j<population.size(); j++) {
					if(q[j-1]<=r && r<q[j]) {
						nextPopulation.setIndividual(i, population.getIndividual(j));
						break;
					}
				}
				
			}
		}
		
		return nextPopulation;
	}

}
