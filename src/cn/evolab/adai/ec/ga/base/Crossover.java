package cn.evolab.adai.ec.ga.base;

import java.util.Random;

import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.core.operation.Recombination;

public abstract class Crossover<T> extends Recombination<T> {
	
	protected double crossoverRate;
	public Crossover(double crossoverRate) {
		this.crossoverRate = crossoverRate;
	}
	
	protected Population<T> selectForCrossover(Population<T> population) {
		Population<T> offspring = new Population<T>();
		Random r = new Random();
		for(int i=0; i<population.size(); i++) {
			double rate = r.nextDouble();
			if(rate<=crossoverRate) {
				offspring.addIndividual(population.getIndividual(i));
			}
		}
		return offspring;
	}
	
	
	
}
