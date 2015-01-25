package cn.evolab.adai.ec.ga.base;

import cn.evolab.adai.ec.core.EA;
import cn.evolab.adai.ec.core.FitnessFunction;
import cn.evolab.adai.ec.core.Individual;
import cn.evolab.adai.ec.core.Population;
import cn.evolab.adai.ec.core.stop.StopCondition;

public abstract class GA<T> extends EA<T> {

	public GA(int populationSize, int individualSize) {
		super(populationSize, individualSize);
	}
	
	// Generate new offspring by GAOperations
	public Population<T> generatOffspring(GAOperation<T> operation, Population<T> population) {
		return operation.runRecombination(population);
	}
	
	// Update population, return nextPopulation
	public Population<T> populationUpdate(GAOperation<T> operation, Population<T> population, Population<T> offspring) {
		return operation.runPopulationUpdate(population, offspring);
	}
	
	// Run EA, return the best individual
	public Individual<T> run(FitnessFunction<T> evaluate, GAOperation<T> operation, StopCondition condition) {
		// Step 1: Initialization
		Population<T> offspring = new Population<T>();
		condition.init();
		
		// Step 2: Generation 0
		best = this.popEvaluate(population, evaluate);
		
		// Evolution until stop
		while (!condition.stop()) {
			offspring = this.generatOffspring(operation, population);
			best = this.popEvaluate(offspring, evaluate);
			population = operation.runPopulationUpdate(population, offspring);
		}
		
		// Return the best individual
		return best;
	}	
	
	
}
